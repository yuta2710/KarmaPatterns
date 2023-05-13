package org.example.Composite;

import org.example.Component.FileComponent;
import org.example.Leaf.File;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Folder implements FileComponent {
    private String name;
    private List<FileComponent> files = new ArrayList<>();

    public Folder(String name) {
        this.name = name;
    }

    public void addNewFile(FileComponent file){
        files.add(file);
    }

    public void removeFile(FileComponent file){
        files.remove(file);
    }

    @Override
    public void showDetails() {
        System.out.println(name + ":" );

        for(FileComponent file : files){
            file.showDetails();
        }
    }

    @Override
    public long getSize() {
        return files.size();
    }
}
