package com.feifei.mybatis.Controller;

import com.feifei.mybatis.entity.Students;
import com.feifei.mybatis.service.StudentsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentsController {

    @Autowired
    private StudentsService studentsService;

    @RequestMapping("/show")
    public  String show(){
        return studentsService.show();
    }
    @RequestMapping("/showDao")
        public Object showDao(int sid){
            return studentsService.showDao(sid);
    }
    @RequestMapping("/showAll")
    public Object showAll(){
            return studentsService.showAll();
    }
    @RequestMapping("selectbyname")
    public Object selectByname(String sname){
        return studentsService.selectByname(sname);
    }
    @ResponseBody
    @RequestMapping(value = "/insertstu",method = RequestMethod.GET)
    public int insertStudent(Students students){
           return studentsService.insetstu();

    }
    @RequestMapping("/deleteStu")
    public int deleteStudent(int sid){
       return studentsService.deleteStu(sid);
    }
    @RequestMapping("/updatestu")
    public int updateStudent(){
        return studentsService.updateStu();
    }
}
