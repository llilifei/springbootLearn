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

    //欢迎
    public String show(){
        return  "hello LongShare";
    }

    //通过id查询
    public List<Students> showDao(int sid ) {
        return studentsDao.get(sid);
    }
    //查询所有数据
    public List<Students> showAll(){
        return studentsDao.selectAll();
    }
    //通过名字查询
    public List<Students> selectByname(String name){
        return studentsDao.selectByname(name);
    }

    //插入数据
    public int insetstu(){
        Students students =new Students();
        students.setSname("傻栗子");
        students.setSage(12);
     return studentsDao.insertStudent(students);
    }
    //删除学生
    public int deleteStu(int sid){
        return studentsDao.deleteStudent(sid);
    }
    //修改学生
    public int updateStu(){
        Students students = new Students();
        students.setSid(3);
        students.setSname("王二小");
        return studentsDao.updateStudent(students);
    }

}
