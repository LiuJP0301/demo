package com.yonyou.demo.repository;

import com.yonyou.demo.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

/**
 * @Classname UserRepository
 * @Description TODO
 * @Date 2019/8/7 0007 18:58
 * @Created by Administrator - liujinpeng
 */
public interface UserRepository extends JpaRepository<User, Long> {

   /* @Override
    @Query(value = "select * from user",nativeQuery = true)
    List<User> findAll();*/
}
