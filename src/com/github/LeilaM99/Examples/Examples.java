package com.github.LeilaM99.Examples;

public class Examples {

        public static void main(String[] args) {

            Movie myMovie = new Movie();
            myMovie.title = "Inception";
            myMovie.director = "C. Nolan";
            myMovie.play();

            Laptop myLaptop = new Laptop();
            myLaptop.brand = "ASUS";
            myLaptop.model = "FX502VM";
            myLaptop.powerOn();

            Book myBook = new Book();
            myBook.title = "The Midnight Library";
            myBook.author = "Matt Haig";
            myBook.read();

            Employee emp = new Employee();
            emp.name = "Lily";
            emp.position = "Developer";
            emp.work();

            Course course1 = new Course();
            course1.courseName = "JAVA-Moho Edition";
            course1.credits = 3;
            course1.displayCourseInfo();

        }

}






