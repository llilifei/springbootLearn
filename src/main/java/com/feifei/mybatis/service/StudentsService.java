package com.feifei.mybatis.service;

import com.feifei.mybatis.DAO.StudentsDao;
import com.feifei.mybatis.entity.Students;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentsService {

    @Autowired
    private StudentsDao studentsDao;

    public String show(){
        return  "hello LongShare";
    }

    public List<Students> showDao(int sid ) {
        return studentsDao.get(sid);
    }
    public List<Students> showAll(){
        return studentsDao.selectAll();
    }
    public List<Students> selectByname(String name){
        return studentsDao.selectByname(name);
    }

    public int insetstu(){
        Students students =new Students();
        students.setSname("wangwu");
        students.setSage(11);
     return studentsDao.insertStudent(students);
    }
    public int deleteStu(int sid){
        return studentsDao.deleteStudent(sid);
    }
    public int updateStu(){
        Students students = new Students();
        students.setSid(3);
        students.setSname("傻狗");
        return studentsDao.updateStudent(students);
    }

}
