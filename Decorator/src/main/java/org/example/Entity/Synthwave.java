package org.example.Entity;

import java.time.LocalDateTime;

public class Synthwave extends Song{
    private String era;
    private String synthesizerType;
    private int bpm;

    public Synthwave(String title, String artist, int duration, LocalDateTime releasedDate, String feat, String era, String synthesizerType, int bpm) {
        super(title, artist, duration, releasedDate, feat);
        this.era = era;
        this.synthesizerType = synthesizerType;
        this.bpm = bpm;
    }

    public Synthwave() {}

    public String getEra() {
        return era;
    }

    public void setEra(String era) {
        this.era = era;
    }

    public String getSynthesizerType() {
        return synthesizerType;
    }

    public void setSynthesizerType(String synthesizerType) {
        this.synthesizerType = synthesizerType;
    }

    public int getBpm() {
        return bpm;
    }

    public void setBpm(int bpm) {
        this.bpm = bpm;
    }

    @Override
    public String toString() {
        return super.toString() + ":" + "Synthwave{" +
                "era='" + era + '\'' +
                ", synthesizerType='" + synthesizerType + '\'' +
                ", bpm=" + bpm +
                '}';
    }
}
