package org.example.Decorator;

import org.example.Entity.Song;

public abstract class SongDecorator extends Song{
    private Song song;

    public SongDecorator(Song song) {
        this.song = song;
    }

    public Song getSong() {
        return song;
    }

    public abstract void addFeature(Song song, String featureName);
    public abstract void removeFeature(Song song, String featureName);
}
