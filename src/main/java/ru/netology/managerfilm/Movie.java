package ru.netology.managerfilm;

public class Movie {

    private final String movie; // это класс, хранящий в себе название фильма, входящий в массив афиши

    public Movie(String movie) {
        this.movie = movie;
    }

    public String getMovie() {
        return movie;
    }
}
