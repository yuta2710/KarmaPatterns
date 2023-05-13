package org.example.Entity;

import java.time.LocalDateTime;

public class Pop extends Song{
    private String genre;
    private int popularity;

    public Pop(String title, String artist, int duration, LocalDateTime releasedDate, String feat, String genre, int popularity) {
        super(title, artist, duration, releasedDate, feat);
        this.genre = genre;
        this.popularity = popularity;
    }

    public Pop() {}

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getPopularity() {
        return popularity;
    }

    public void setPopularity(int popularity) {
        this.popularity = popularity;
    }

    @Override
    public String toString() {
        return "Pop{" +
                "genre='" + genre + '\'' +
                ", popularity=" + popularity +
                '}';
    }
}
