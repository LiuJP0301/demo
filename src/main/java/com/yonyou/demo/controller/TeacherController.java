package com.yonyou.demo.controller;

import com.yonyou.demo.entity.Teacher;
import com.yonyou.demo.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Classname TeacherController
 * @Description TODO
 * @Date 2019/8/7 0007 14:07
 * @Created by Administrator - liujinpeng
 */
@RestController
public class TeacherController {
    @Autowired
    TeacherService teacherService;

    /**
     * 查询所有的教师
     * @return
     */
    @RequestMapping(value = "/listTeachers",method = RequestMethod.GET)
    public List<Teacher> listTeachers(){
        return teacherService.findAllTeachers();
    }


    /**
     * 添加单个教师信息
     * @param teacher
     */
    @PostMapping
    public void addTeacher(@RequestBody Teacher teacher){
         teacherService.addTeacher(teacher);
    }

    /**
     * 第一种方式：数据库，查询年龄在35岁以上并且工资大于5000的老师
     * @return
     */
    @RequestMapping(value = "/findTeachers",method = RequestMethod.GET)
    public List<Teacher> findTeachers(){
        return teacherService.findTeachers();
    }

    /**
     * 第二种方式：自定义接口，查询年龄在35岁以上并且工资大于5000的老师
     * @return
     */
    @RequestMapping(value = "/findTeachers2",method = RequestMethod.GET)
    public List<Teacher> findTeachers2(){
        return teacherService.findTeachers2();
    }

    /**
     * 第二种方式：lambda表达式，查询年龄在35岁以上并且工资大于5000的老师
     * @return
     */
    @RequestMapping(value = "/findTeachers3",method = RequestMethod.GET)
    public List<Teacher> findTeachers3(){
        return teacherService.findTeachers3();
    }





}
