package com.smarter.repository;

import com.smarter.entity.Student;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Repository
public class StudentRepositotyImpl implements StudentRepository {

    private static Map<Long,Student> students ;

    static{
        students = new HashMap<>();

        students.put(1L,new Student(1l,"小红","吃水果"));
        students.put(2L,new Student(2l,"小明","吃饭"));
        students.put(3L,new Student(3l,"小红","喝粥"));

    }

    @Override
    public void deleteStuById(Long id) {
        students.remove(id);
    }

    @Override
    public Collection<Student> findAllStu() {
        return students.values();
    }

    @Override
    public Student findStuById(Long id) {
        return students.get(id);
    }

    @Override
    public void addStu(Student student) {
        students.put(student.getId(),student);
    }

    @Override
    public void updateStu(Student student) {
        students.put(student.getId(),student);
    }
}
