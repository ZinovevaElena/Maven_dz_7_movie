package ru.netology.managerfilm;

public class RepositoryFilm {
    private int id;
    private int premiereDate;
    private String movie;
    private String genre;
    private String[] movies = new String[0];
    private int limit;

    public RepositoryFilm(int id, int premiereDate, String movie, String genre) {
        this.id = id;
        this.premiereDate = premiereDate;
        this.movie = movie;
        this.genre = genre;
    }
    public RepositoryFilm() {
        this.limit = 5;
    }

    public RepositoryFilm(int limit) {
        this.limit = limit;
    }

    public String getMovie() {
        return movie;
    }

    public int getlimit() {
        return limit;
    }

    // добавление фильма
    public void addMovie(String movie) {

        String[] tmp = new String[movies.length + 1];
        System.arraycopy(movies, 0, tmp, 0, movies.length);
        tmp[tmp.length - 1] = movie;
        movies = tmp;
    }

    // Вывод всех фильмов в порядке добавления
    public String[] findAll() {
        return movies;
    }

    // Вывод 5 последних добавленных фильмов
    public String[] findLast() {
        int resultLenght;
        if (limit > movies.length) {
            resultLenght = movies.length;
        } else {
            resultLenght = limit;
        }
        String[] tmp = new String[resultLenght];
        for (int i = 0; i < tmp.length; i++) {
            tmp[i] = movies[movies.length - 1 - i];
        }
        return tmp;
    }
}






