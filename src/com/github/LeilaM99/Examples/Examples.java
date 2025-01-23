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
        }




//    Ex1
    static class Movie {
        String title;
        String director;

        void play() {
            System.out.println("Playing the movie: " + title);
        }
    }
//  Ex2
    static class Laptop {
    String brand;
    String model;

    void powerOn() {
        System.out.println(brand + " " + model + " is powering on.");
    }
}
//  Ex3
    static class Book {
        String title;
        String author;

        void read() {
            System.out.println("Reading " + title + " by " + author);
        }
    }

//  Ex4
    static class Employee {
    String name;
    String position;

    void work() {
        System.out.println(name + " is working as a " + position);
    }
    }




}






