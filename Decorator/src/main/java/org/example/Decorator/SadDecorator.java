package org.example.Decorator;

import org.example.Entity.Song;

import java.util.ArrayList;
import java.util.List;

public class SadDecorator extends SongDecorator{
    private List<String> features = new ArrayList<>();

    public SadDecorator(Song song) {
        super(song);
    }

    public List<String> getFeatures() {
        return features;
    }

    @Override
    public void addFeature(Song song, String featureName) {
        if(song != null && !featureName.isEmpty() && featureName != null){
            features.add(featureName);
        }
    }

    @Override
    public void removeFeature(Song song, String featureName) {

    }
}
