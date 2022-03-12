package com.javatechie.course.service;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Course {
    private String id;
    private String name;
    private int durationInMonths;
    private int price;

}
