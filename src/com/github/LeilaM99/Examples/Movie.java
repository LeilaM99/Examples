package com.github.LeilaM99.Examples;

public class Movie {
    String title;
    String director;

    public void play(Movie this) {
        System.out.println("Playing the movie: " + this.title + "by: " + this.director  );
    }
}
