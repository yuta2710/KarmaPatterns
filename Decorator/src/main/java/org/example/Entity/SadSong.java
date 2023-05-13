package org.example.Entity;

import java.time.LocalDateTime;

public class SadSong extends Song{
    private String mood;
    private int tempo;
    private boolean isSlow;

    public SadSong(String title, String artist, int duration, LocalDateTime releasedDate, String feat, String mood, int tempo, boolean isSlow) {
        super(title, artist, duration, releasedDate, feat);
        this.mood = mood;
        this.tempo = tempo;
        this.isSlow = isSlow;
    }

    public SadSong() {}

    public String getMood() {
        return mood;
    }

    public void setMood(String mood) {
        this.mood = mood;
    }

    public int getTempo() {
        return tempo;
    }

    public void setTempo(int tempo) {
        this.tempo = tempo;
    }

    public boolean isSlow() {
        return isSlow;
    }

    public void setSlow(boolean slow) {
        isSlow = slow;
    }

    @Override
    public String toString() {
        return super.toString() + ":" +"SadSong{" +
                "mood='" + mood + '\'' +
                ", tempo=" + tempo +
                ", isSlow=" + isSlow +
                '}';
    }
}
