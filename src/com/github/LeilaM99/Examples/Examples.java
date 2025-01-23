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




}

