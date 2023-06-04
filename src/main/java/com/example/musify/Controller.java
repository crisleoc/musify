package com.example.musify;

import com.example.musify.classes.Song;
import com.example.musify.structures.BST;
import com.example.musify.util.ManageCSV;
import com.example.musify.util.Request;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

import java.util.LinkedList;

public class Controller {

    public static void anotherCode() {
        // CSV
        LinkedList<Song> dataBase = new LinkedList<>();
        ManageCSV manageCSV = new ManageCSV();
        dataBase = manageCSV.readCSV("src\\main\\resources\\com\\example\\musify\\data\\songs1.csv", dataBase);

        System.out.println("--------------------");

        //BST
        BST bst = new BST();
        for (Song song : dataBase) {
            bst.insert(song);
        }
        int idSearch = 10;
        Song cancionEncontrada = bst.search(idSearch);
        if (cancionEncontrada != null) {
            System.out.println("Canción encontrada: " + cancionEncontrada.getTitle());
        } else {
            System.out.println("Canción no encontrada");
        }

        System.out.println("--------------------");

        // REQUEST
        try {
            Request request = new Request();
            Song song = Request.requestSong("Lose Yourself, Eminem");
            // Print all the information about the song
            System.out.println(song.toString());
            // Print the title of the song
            System.out.println(song.getTitle());
            System.out.println(song.getPreview());
            // Print the name of the artist
            System.out.println(song.getArtist().getName());
            // Print the name of the album
            System.out.println(song.getAlbum().getTitle());
            System.out.println("--------------------");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}