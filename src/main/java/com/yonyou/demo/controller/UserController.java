package com.yonyou.demo.controller;

import com.yonyou.demo.entity.User;
import com.yonyou.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Classname UserController
 * @Description TODO
 * @Date 2019/8/7 0007 18:56
 * @Created by Administrator - liujinpeng
 */
@Controller
@RequestMapping("/index/")//接口注解
public class UserController {

    @Autowired
    UserService userService;

    @Autowired
    private StringRedisTemplate redisTemplate;

    @RequestMapping(value = {"/index"})
    public String index(){
        return "login";
    }

    @RequestMapping(value = {"/login"})
    public String userLogin(@RequestParam("username") String username,@RequestParam("password") String password, ModelMap map) {
        User user = userService.findUserByNameAndPassword(username, password).get(0);

        //若存在用户
        if (user != null) {
            // 使用redisTemplate设置key值为user，value值为userName的数据
            redisTemplate.opsForValue().set("user",user.getUsername());

            //登录成功，进入欢迎页面
            map.addAttribute("user", user.getUsername()+"");
            return "welcome";
        }
        return "error";
    }

}
