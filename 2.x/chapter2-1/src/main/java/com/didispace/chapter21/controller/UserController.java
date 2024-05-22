package com.didispace.chapter21.controller;

import com.didispace.chapter21.dto.UserDTO;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController //标记一个类为SpringMVC控制器，返回的结果直接作为HTTP响应体
@RequestMapping(value = "/users")     // 指定控制器处理的URL路径前缀，通过这里配置使下面的映射都在/users下
public class UserController {

    // 创建线程安全的Map，模拟users信息的存储
    static Map<Long, UserDTO> users = Collections.synchronizedMap(new HashMap<Long, UserDTO>());

    /**
     * 处理"/users/"的GET请求，用来获取用户列表
     *
     * @return
     */
    @GetMapping("/")
    public List<UserDTO> getUserList() {
        // 还可以通过@RequestParam从页面中传递参数来进行查询条件或者翻页信息的传递
        return new ArrayList<>(users.values());
    }

    /**
     * 处理"/users/"的POST请求，用来创建User
     *
     * @param userDTO
     * @return
     */
    @PostMapping("/") // 处理HTTP POST请求
    public String postUser(@RequestBody UserDTO userDTO) {
        // @RequestBody注解用来绑定通过http请求中application/json类型上传的数据
        users.put(userDTO.getId(), userDTO);
        return "success";
    }

    /**
     * 处理"/users/{id}"的GET请求，用来获取url中id值的User信息
     * @param id
     * @return
     */
    @GetMapping("/{id}") // 处理HTTP GET请求
    public UserDTO getUser(@PathVariable Long id) {
        // @PathVariable：将URL路径中的变量{id}绑定到方法参数上
        return users.get(id);
    }

    /**
     * 处理"/users/{id}"的PUT请求，用来更新User信息
     *
     * @param id
     * @param userDTO
     * @return
     */
    @PutMapping("/{id}") // 处理HTTP PUT请求
    public String putUser(@PathVariable Long id, @RequestBody UserDTO userDTO) {
        // @RequestBody：将HTTP请求体绑定到方法参数上
        UserDTO u = users.get(id);

        if (null != u) {
            u.setName(userDTO.getName());
            u.setAge(userDTO.getAge());
            users.put(id, u);
            return "success";
        }

        return "failure";

    }

    /**
     * 处理"/users/{id}"的DELETE请求，用来删除User
     *
     * @param id
     * @return
     */
    @DeleteMapping("/{id}") //处理HTTP DELETE请求
    public String deleteUser(@PathVariable Long id) {
        users.remove(id);
        return "success";
    }

}