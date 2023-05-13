package org.example;

import org.example.Decorator.SadDecorator;
import org.example.Decorator.SongDecorator;
import org.example.Entity.SadSong;
import org.example.Entity.Song;

import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        LocalDateTime releaseDate = LocalDateTime.of(2017, 10, 27, 20, 0);
        Song sad = new SadSong("A lot", "21 Savage", 5, releaseDate, "J-Cole", "SAD", 100, false);

        SongDecorator config = new SadDecorator(sad);

        config.addFeature(sad, "Instrumental Version");

        System.out.println(config.getSong().toString() + ":" + ((SadDecorator) config).getFeatures());
    }
}