package com.github.LeilaM99.Examples;

public class Book {
        String title;
        String author;

        public void read(Book this) {
            System.out.println("Reading " + this.title + " by " + this.author);
        }

}
