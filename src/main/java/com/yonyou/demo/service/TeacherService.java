package com.yonyou.demo.service;

import com.yonyou.demo.entity.Teacher;


import java.util.List;

/**
 * @Classname TeacherService
 * @Description TODO
 * @Date 2019/8/7 0007 14:00
 * @Created by Administrator - liujinpeng
 */

public interface TeacherService {
    /**
     * 查找所有教师信息
     * @return
     */
    public List<Teacher> findAllTeachers();

    /**
     * 添加单个教师信息
     * @param teacher
     */
    public void addTeacher(Teacher teacher);

    /**
     * 第一种方式：数据库，查询年龄在35岁以上并且工资大于5000的老师
     * @return
     */
    public List<Teacher> findTeachers();

    /**
     * 第二种方式：自定义接口，查询年龄在35岁以上并且工资大于5000的老师
     * @return
     */
    public List<Teacher> findTeachers2();

    /**
     * 第三种方式：Lambda表达式，查询年龄在35岁以上并且工资大于5000的老师
     * @return
     */
    public List<Teacher> findTeachers3();
}
