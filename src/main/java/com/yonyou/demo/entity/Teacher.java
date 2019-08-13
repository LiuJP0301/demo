package com.yonyou.demo.entity;

import lombok.Data;

import javax.persistence.*;

/**
 * @Classname Teacher
 * @Description TODO
 * @Date 2019/8/7 0007 13:42
 * @Created by Administrator - liujinpeng
 */
@Entity
@Data
public class Teacher {
    @Id
    @GeneratedValue(generator = "IDENTITY")
    private Long id;

    /**
     * 教师名称
     */
    private String name;

    /**
     * 教师性别
     */
    private Integer sex;

    /**
     * 教师工资
     */
    private Double salary;

    /**
     * 教师年龄
     */
    private Integer age;

    /**
     * 教师手机号
     */
    private String mobile;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setTeacherName(String name) {
        this.name = name;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sex=" + sex +
                ", salary=" + salary +
                ", age=" + age +
                ", mobile='" + mobile + '\'' +
                '}';
    }
}
