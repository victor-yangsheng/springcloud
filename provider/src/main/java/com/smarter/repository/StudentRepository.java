package com.smarter.repository;

import com.smarter.entity.Student;

import java.util.Collection;

public interface StudentRepository {

    public void deleteStuById(Long id);

    public Collection<Student> findAllStu();

    public Student findStuById(Long id);

    public void addStu(Student student);

    public void updateStu(Student student);

}
