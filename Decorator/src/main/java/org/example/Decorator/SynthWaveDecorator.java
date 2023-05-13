package org.example.Decorator;

import org.example.Entity.Song;

import java.util.ArrayList;
import java.util.List;

public class SynthWaveDecorator extends SongDecorator{
    private List<String> synthwaves = new ArrayList<>();
    private String type;

    public SynthWaveDecorator(Song song, String type) {
        super(song);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    @Override
    public void addFeature(Song song, String featureName) {
        synthwaves.add(featureName);
    }

    @Override
    public void removeFeature(Song song, String featureName) {
        synthwaves.add(featureName);
    }
}
