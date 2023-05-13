package org.example.Entity;

import java.time.LocalDateTime;
import java.util.UUID;

public abstract class Song {
    protected String songId;
    protected String title;
    protected String artist;
    protected int duration;
    protected LocalDateTime releasedDate;
    protected String feat;

    public Song(String title, String artist, int duration, LocalDateTime releasedDate, String feat) {
        this.songId = UUID.randomUUID().toString();
        this.title = title;
        this.artist = artist;
        this.duration = duration;
        this.releasedDate = releasedDate;
        this.feat = feat;
    }

    public Song() {}

    public String getSongId() {
        return songId;
    }

    public void setSongId(String songId) {
        this.songId = songId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public LocalDateTime getReleasedDate() {
        return releasedDate;
    }

    public void setReleasedDate(LocalDateTime releasedDate) {
        this.releasedDate = releasedDate;
    }

    public String getFeat() {
        return feat;
    }

    public void setFeat(String feater) {
        this.feat = feater;
    }

    @Override
    public String toString() {
        return "Song: {" +
                "songId='" + songId + '\'' +
                ", title='" + title + '\'' +
                ", artist='" + artist + '\'' +
                ", duration=" + duration +
                ", releasedDate=" + releasedDate +
                ", feater='" + feat + '\'' +
                '}';
    }
}
