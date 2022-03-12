package com.javatechie.student.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@SpringBootApplication
@RestController
public class StudentServiceApplication {

    @GetMapping("/students")
    public List<Student> getStudents() {
        return Stream.of(new Student(101, "basant", "1", "B"),
                        new Student(102, "Santosh", "2", "B"),
                        new Student(103, "Ajay", "11", "C"))
                .collect(Collectors.toList());
    }


    public static void main(String[] args) {
        SpringApplication.run(StudentServiceApplication.class, args);
    }

}
