package com.smarter.handler;

import com.smarter.entity.Student;
import com.smarter.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping("stu")
public class StudentController {

    @Autowired
    private StudentRepository studentRepository;

    @Value("${server.port}")
    private String port;

    @GetMapping("list")
    public Collection<Student> findAllStu(){
        return studentRepository.findAllStu();
    }

    @GetMapping("/findbyid/{id}")
    public Student findById(@PathVariable("id") long id){
        return studentRepository.findStuById(id);
    }

    @PostMapping("/save")
    public void save(@RequestBody Student student){
        studentRepository.updateStu(student);

    }

    @PutMapping("/update")
    public void update(@RequestBody Student student){
        studentRepository.updateStu(student);
    }

    @DeleteMapping("/deletebyid/{id}")
    public void deleteById(@PathVariable("id") long id){
        studentRepository.deleteStuById(id);
    }

    @RequestMapping("/port")
    public String getPort(){
        return port;
    }
}
