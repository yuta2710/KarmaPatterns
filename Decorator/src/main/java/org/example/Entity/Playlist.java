package org.example.Entity;

import java.util.ArrayList;
import java.util.List;

public class Playlist {
    private String name;
    private List<Song> songs;

    public Playlist(String name) {
        this.name = name;
        songs = new ArrayList<>();
    }

    public boolean addNewSong(Song song) {
        if(songs.contains(song)){
            return false;
        }

        songs.add(song);
        return true;
    }

    public boolean removeSong(Song song){
        if(songs.contains(song)){
            songs.remove(song);
            return true;
        }

        return false;
    }

    public String getName() {
        return name;
    }

    public List<Song> getSongs() {
        return songs;
    }
}
