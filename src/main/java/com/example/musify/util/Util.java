package com.example.musify.util;

public class Util {
    public static String capitalize(String phrase) {
        String[] words = phrase.split(" ");
        String capitalizedPhrase = "";
        for (String word : words) {
            capitalizedPhrase += word.substring(0, 1).toUpperCase() + word.substring(1) + " ";
        }
        return capitalizedPhrase.trim();
    }
}
