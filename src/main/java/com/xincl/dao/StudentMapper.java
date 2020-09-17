package com.xincl.dao;

import com.xincl.pojo.Student;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface StudentMapper {

    @Select("select * from student where id= #{id}")
    List<Student> getStudent(@Param("id") int id);

    //查询所有学生
    List<Student> getStudentAll();

    //查询所有学生以及指导老师名单
    List<Student> getAll();

    List<Student> getAll2();

}
