package com.github.LeilaM99.Examples;

public class Course {
    String courseName;
    int credits;

    public void displayCourseInfo(Course this) {
        System.out.println("Course: " + this.courseName + ", Credits: " + this.credits);
    }
}
