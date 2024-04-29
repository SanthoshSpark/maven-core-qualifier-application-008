package com.spring.core.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class University {
    private List<Student> computerScienceStudents;
    private List<Student> javaProgrammingStudents;
    private List<Course> computerScienceCourses;
    private List<Course> javaProgrammingCourses;

    // Autowired with Qualifier for Computer Science Students
    @Autowired
    @Qualifier("computerScienceStudents")
    public void setComputerScienceStudents(List<Student> computerScienceStudents) {
        this.computerScienceStudents = computerScienceStudents;
    }

    // Autowired with Qualifier for Java Programming Students
    @Autowired
    @Qualifier("javaProgrammingStudents")
    public void setJavaProgrammingStudents(List<Student> javaProgrammingStudents) {
        this.javaProgrammingStudents = javaProgrammingStudents;
    }

    // Autowired with Qualifier for Computer Science Courses
    @Autowired
    @Qualifier("computerScienceCourses")
    public void setComputerScienceCourses(List<Course> computerScienceCourses) {
        this.computerScienceCourses = computerScienceCourses;
    }

    // Autowired with Qualifier for Java Programming Courses
    @Autowired
    @Qualifier("javaProgrammingCourses")
    public void setJavaProgrammingCourses(List<Course> javaProgrammingCourses) {
        this.javaProgrammingCourses = javaProgrammingCourses;
    }

    public void displayUniversityInfo() {
        System.out.println("University Information:");
        
        System.out.println("Computer Science Students:");
        for (Student student : computerScienceStudents) {
            System.out.println(student.getName());
        }
        
        System.out.println("Java Programming Students:");
        for (Student student : javaProgrammingStudents) {
            System.out.println(student.getName());
        }
        
        System.out.println("Computer Science Courses:");
        for (Course course : computerScienceCourses) {
            System.out.println(course.getName());
        }
        
        System.out.println("Java Programming Courses:");
        for (Course course : javaProgrammingCourses) {
            System.out.println(course.getName());
        }
    }
}
