package com.example.musify.classes;

public class Artist {
    private long id;
    private String name;
    private String picture;

    public Artist() {
    }
    public Artist(long id, String name, String picture) {
        this.id = id;
        this.name = name;
        this.picture = picture;
    }

    public Artist(String nameArtist) {
        this.name = nameArtist;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }
}
