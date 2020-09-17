package com.xincl.dao;

import com.xincl.pojo.Student;
import com.xincl.utils.MyBatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TestUserMapper {
    static Logger logger = Logger.getLogger(TestUserMapper.class);

    //获取所有学生
    @Test
    public void test0(){
        SqlSession sqlSession = MyBatisUtils.getsqlSession();
        StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
        List<Student> student = mapper.getStudentAll();
        for (Student student1:student){
            System.out.println(student1);
        }
        sqlSession.close();
    }

    //获取所有学生
    @Test
    public void test1(){
        SqlSession sqlSession = MyBatisUtils.getsqlSession();
        StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
        List<Student> student = mapper.getAll2();
        for (Student student1:student){
            System.out.println(student1);
        }
        sqlSession.close();
    }

    //根据id获取所有学生
    @Test
    public void test2(){
        SqlSession sqlSession = MyBatisUtils.getsqlSession();
        StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
        List<Student> student = mapper.getStudent(100);
        for (Student student1:student){
            System.out.println(student1);
        }
        sqlSession.close();
    }

    //获取学生和对应老师名称
    @Test
    public void testGetAll(){
        SqlSession sqlSession = MyBatisUtils.getsqlSession();
        StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
        List<Student> all = mapper.getAll();
        for (Student student:all){
            System.out.println(student);
        }
        sqlSession.close();
    }
}
