package org.example;

import org.example.Composite.Folder;
import org.example.Leaf.File;

public class Main {
    public static void main(String[] args) {
        File file1 = new File("file1.txt", 1024);
        File file2 = new File("file2.txt", 2048);
        File file3 = new File("file3.txt", 3072);

        Folder folder1 = new Folder("Folder1");
        folder1.addNewFile(file1);
        folder1.addNewFile(file2);

        Folder folder2 = new Folder("Folder2");
        folder2.addNewFile(file3);
        folder2.addNewFile(folder1);

        folder2.showDetails();
        System.out.println("Total size: " + folder2.getSize() + " bytes");
    }
}