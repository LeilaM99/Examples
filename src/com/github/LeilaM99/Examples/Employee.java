package com.github.LeilaM99.Examples;

public class Employee {
    String name;
    String position;

    public void work(Employee this) {
        System.out.println(this.name + " is working as a " + this.position);
    }
}
