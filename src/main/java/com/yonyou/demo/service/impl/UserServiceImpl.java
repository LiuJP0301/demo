package com.yonyou.demo.service.impl;

import com.yonyou.demo.entity.User;
import com.yonyou.demo.repository.UserRepository;
import com.yonyou.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @Classname UserServiceImpl
 * @Description TODO
 * @Date 2019/8/7 0007 19:02
 * @Created by Administrator - liujinpeng
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public List<User> findUserByNameAndPassword(String username, String password) {
        //全部用户
        List<User> userList = userRepository.findAll();

        //存在的用户
        List<User> users = new ArrayList<>();

        //保证在查询结果不为空的情况下过滤
        if (userList != null && userList.size() > 0) {
            users = userList.stream().filter(a -> a.getPassword().equals(password) && a.getUsername().equals(username))
                    .collect(Collectors.toList());
            if(users != null && users.size() == 1){
                return users;
            }
        }
        return null;
    }
}
