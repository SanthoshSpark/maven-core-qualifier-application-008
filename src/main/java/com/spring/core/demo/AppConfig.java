package com.spring.core.demo;

import java.util.Arrays;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class AppConfig {

    @Bean
    //@Primary
    public Student student1() {
        return new Student("Alice");
    }

    @Bean
    public Student student2() {
        return new Student("Bob");
    }

    @Bean
    //@Primary
    public Course course1() {
        return new Course("Introduction to Computer Science");
    }

    @Bean
    public Course course2() {
        return new Course("Advanced Java Programming");
    }

    @Bean("computerScienceStudents")
    public List<Student> computerScienceStudents() {
        return Arrays.asList(student1());
    }

    @Bean("javaProgrammingStudents")
    public List<Student> javaProgrammingStudents() {
        return Arrays.asList(student2());
    }

    @Bean("computerScienceCourses")
    public List<Course> computerScienceCourses() {
        return Arrays.asList(course1());
    }

    @Bean("javaProgrammingCourses")
    public List<Course> javaProgrammingCourses() {
        return Arrays.asList(course2());
    }

    @Bean
    public University university() {
        return new University();
    }
}
