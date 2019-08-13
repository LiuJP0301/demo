package com.yonyou.demo.repository;

import com.yonyou.demo.entity.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * @Classname TeacherRepository
 * @Description TODO
 * @Date 2019/8/7 0007 15:34
 * @Created by Administrator - liujinpeng
 */
public interface TeacherRepository extends JpaRepository<Teacher, Long> {
    @Query(value = "select * from teacher",nativeQuery = true)
    public List<Teacher> findAllTeachers();

    @Query(value = "select * from teacher where age > 35 and salary > 5000 ",nativeQuery = true)
    public List<Teacher> findTeachers();

}
