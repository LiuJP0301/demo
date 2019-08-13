package com.yonyou.demo.service.impl;

import com.yonyou.demo.entity.Teacher;
import com.yonyou.demo.repository.TeacherRepository;
import com.yonyou.demo.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @Classname TeacherServiceImpl
 * @Description TODO
 * @Date 2019/8/7 0007 16:35
 * @Created by Administrator - liujinpeng
 */
@Service
public class TeacherServiceImpl implements TeacherService {
    @Autowired
    private TeacherRepository teacherRepository;

    @Override
    public List<Teacher> findAllTeachers() {
        return teacherRepository.findAll();
    }

    /**
     * 添加单个教师信息
     *
     * @param teacher
     */
    @Override
    public void addTeacher(Teacher teacher) {
        teacherRepository.save(teacher);
    }


    @Override
    public List<Teacher> findTeachers() {
        return teacherRepository.findTeachers();
    }

    /**
     * 第二种方式：自定义接口，查询年龄在35岁以上并且工资大于5000的老师
     *
     * @return
     */
    @Override
    public List<Teacher> findTeachers2() {
        //全部教师
        List<Teacher> teacherList = teacherRepository.findAllTeachers();

        //过滤后的教师
        List<Teacher> teachers = new ArrayList<>();

        //保证在查询结果不为空的情况下过滤
        if (teacherList != null && teacherList.size() > 0) {
            for (Teacher teacher : teacherList) {
                if (teacher.getAge() > 35 && teacher.getSalary() > 5000) {
                    System.out.println(teacher.getAge());
                    teachers.add(teacher);
                }
            }
        }
        return teachers;
    }

    @Override
    public List<Teacher> findTeachers3() {
        //全部教师
        List<Teacher> teacherList = teacherRepository.findAllTeachers();

        //过滤后的教师
        List<Teacher> teachers = new ArrayList<>();

        //保证在查询结果不为空的情况下过滤
        if (teacherList != null && teacherList.size() > 0) {
            teachers = teacherList.stream().filter(a -> a.getAge() > 50 && a.getSalary() > 5000).collect(Collectors.toList());
        }
        return teachers;
    }


}
