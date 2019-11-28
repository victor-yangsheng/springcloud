package com.smarter.handler;

import com.smarter.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.Collection;

@RestController
@RequestMapping("/rest")
public class RestHandler {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("list")
    public Collection<Student> findAllStu(){
        return restTemplate.getForObject("http://localhost:8001/stu/list",Collection.class);
    }

    @GetMapping("/findbyid/{id}")
    public Student findById(@PathVariable("id") long id){
        return restTemplate.getForObject("http://localhost:8001/stu/findbyid/{id}",Student.class,id);
    }

    @PostMapping("/save")
    public void save(@RequestBody Student student){
        restTemplate.postForObject("http://localhost:8001/stu/save",student,String.class);

    }

    @PutMapping("/update")
    public void update(@RequestBody Student student){
       restTemplate.put("http://localhost:8001/stu/update",student);
    }

    @DeleteMapping("/deletebyid/{id}")
    public void deleteById(@PathVariable("id") long id){
        restTemplate.delete("http://localhost:8001/stu/deletebyid/{id}",id,null);
    }
}
