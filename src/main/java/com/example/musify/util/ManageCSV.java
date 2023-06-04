package com.example.musify.util;

import com.example.musify.classes.Song;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.LinkedList;

public class ManageCSV {
    private String[] data;

    public LinkedList<Song> readCSV(String path, LinkedList<Song> db) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(path));
            String line;
            reader.readLine();
            while ((line = reader.readLine()) != null) {
                data = line.split(",");
                db.add(new Song(Long.parseLong(data[0]), data[1], Integer.parseInt(data[2]), data[3], data[4]));
                printLine();
            }
            reader.close();
            data = null;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return db;
    }

    public void printLine() {
        StringBuilder line = new StringBuilder();
        for (String datum : data) {
            line.append(datum).append(" | ");
        }
        System.out.println(line);
        System.out.println();
    }
}
