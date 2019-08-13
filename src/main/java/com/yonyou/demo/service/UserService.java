package com.yonyou.demo.service;

import com.yonyou.demo.entity.User;

import java.util.List;

/**
 * @Classname UserService
 * @Description TODO
 * @Date 2019/8/7 0007 19:01
 * @Created by Administrator - liujinpeng
 */
public interface UserService {

    public List<User> findUserByNameAndPassword(String username, String password);
}
