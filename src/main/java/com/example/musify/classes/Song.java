package com.example.musify.classes;

public class Song {
    private long id;
    private String title;
    private String preview;

    private int duration;
    private Artist artist;
    private Album album;

    public Song() {}

    public Song(long id, String title, int duration, String nameArtist, String nameAlbum) {
        this.id = id;
        this.title = title;
        this.duration = duration;
        this.artist = new Artist(nameArtist);
        this.album = new Album(nameAlbum);
    }

    public Song(long id, String title, String preview, int duration, Artist artist, Album album) {
        this.id = id;
        this.title = title;
        this.preview = preview;
        this.duration = duration;
        this.artist = artist;
        this.album = album;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPreview() {
        return preview;
    }

    public void setPreview(String preview) {
        this.preview = preview;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }
    public Artist getArtist() {
        return artist;
    }

    public void setArtist(Artist artist) {
        this.artist = artist;
    }

    public Album getAlbum() {
        return album;
    }

    public void setAlbum(Album album) {
        this.album = album;
    }
}
