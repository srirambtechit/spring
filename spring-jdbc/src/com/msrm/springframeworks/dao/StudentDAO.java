package com.msrm.springframeworks.dao;

import java.util.List;

import com.msrm.springframeworks.dos.Student;

public interface StudentDAO {

    int save(Student student);

    int update(Student student);

    int delete(int id);

    List<Student> fetchStudent();

}
