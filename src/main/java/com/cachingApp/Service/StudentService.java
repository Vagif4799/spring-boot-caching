package com.cachingApp.Service;

import com.cachingApp.model.Student;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    @Cacheable("student")
    public Student getStudentById(String id){
        try {
            System.out.println("Going to send call database...");
            Thread.sleep(1000*5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return new Student(id, "Vagif", "Guliyev");
    }

}
