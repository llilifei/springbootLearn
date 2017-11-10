package com.feifei.mybatis.DAO;

import com.feifei.mybatis.entity.Students;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;


import java.util.List;

@Mapper
@Repository
public interface StudentsDao {

    List<Students> get(int sid);
    List<Students> selectAll();
    List<Students> selectByname(String name);
    public int insertStudent( Students students);
    public int deleteStudent(int sid);
    public int updateStudent(Students students);
}
