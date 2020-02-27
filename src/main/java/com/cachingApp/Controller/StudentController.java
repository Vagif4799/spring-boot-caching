package com.cachingApp.Controller;

import com.cachingApp.Service.StudentService;
import com.cachingApp.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

    private StudentService studentService;

    @Autowired
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("/student/{id}")
    public Student findStudentById(@PathVariable("id") String id) {
        System.out.println("Searching by id: " + id);
        return studentService.getStudentById(id);
    }

}
