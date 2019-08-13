package com.yonyou.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Classname WelcomeController
 * @Description TODO
 * @Date 2019/8/7 0007 19:46
 * @Created by Administrator - liujinpeng
 */
@Controller
public class WelcomeController {
    @Autowired
    private StringRedisTemplate redisTemplate;

    @RequestMapping(value = {"/welcome"})
    public String welcome(ModelMap map){
        String username = redisTemplate.opsForValue().get("user");
        if(username != null && !username.equals("")){
            map.addAttribute("user", username);
            return "welcome";
        }else{
            return "error";
        }

    }
}
