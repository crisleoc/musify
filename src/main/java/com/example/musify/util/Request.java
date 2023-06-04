package com.example.musify.util;

import com.example.musify.classes.Album;
import com.example.musify.classes.Artist;
import com.example.musify.classes.Song;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.List;

import static com.example.musify.util.Util.capitalize;

public class Request {
    public static String replaceIllegalCharacters(String phrase) {
        phrase = capitalize(phrase);
        return phrase.replaceAll("[^a-zA-Z0-9]", "");
    }

    public static String makeRequest(String phrase) throws IOException, InterruptedException {
        phrase = replaceIllegalCharacters(phrase);
        System.out.println(phrase);
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://deezerdevs-deezer.p.rapidapi.com/search?q=" + phrase))
                .header("X-RapidAPI-Key", "b814916aa4msh9b59f291284a1cbp18d158jsnc26adb11377a")
                .header("X-RapidAPI-Host", "deezerdevs-deezer.p.rapidapi.com")
                .method("GET", HttpRequest.BodyPublishers.noBody())
                .build();
        HttpResponse<String> response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());
        System.out.println(response.body());
        return response.body();
    }

    public static Song requestSong(String phrase) throws IOException, InterruptedException {
        List<ParseJson.Data> dataList = ParseJson.parseResponse(makeRequest(phrase));
        Song song = new Song();
        Artist artist = new Artist();
        Album album = new Album();

        if (dataList.size() > 0) {
            ParseJson.Data data = dataList.get(0);
            song.setId(data.getId());
            song.setTitle(data.getTitle());
            song.setDuration(data.getDuration());
            song.setPreview(data.getPreview());

            ParseJson.Artist artistData = data.getArtist();
            artist.setId(artistData.getId());
            artist.setName(artistData.getName());
            artist.setPicture(artistData.getPicture());

            ParseJson.Album albumData = data.getAlbum();
            album.setId(albumData.getId());
            album.setTitle(albumData.getTitle());
            album.setCover(albumData.getCover());

            song.setArtist(artist);
            song.setAlbum(album);
        } else {
            throw new IllegalArgumentException("No song found for the phrase: " + phrase);
        }

        return song;
    }
}
