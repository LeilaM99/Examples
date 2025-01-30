package com.github.LeilaM99.Examples;

public class Laptop {
    String brand;
    String model;

    public void powerOn(Laptop this) {
        System.out.println(this.brand + " " + this.model + " is powering on.");
    }
}
