package org.example.Leaf;

import org.example.Component.FileComponent;

public class File implements FileComponent {
    private String name;
    private long size;

    public File(String name, long size) {
        this.name = name;
        this.size = size;
    }

    @Override
    public void showDetails() {
        System.out.println(name + ":" + size);
    }

    @Override
    public long getSize() {
        return size;
    }
}
