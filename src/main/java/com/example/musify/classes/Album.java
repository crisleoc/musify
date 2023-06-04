package com.example.musify.classes;

public class Album {
    private long id;
    private String title;
    private String cover;

    public Album() {
    }
    public Album(long id, String title, String cover) {
        this.id = id;
        this.title = title;
        this.cover = cover;
    }

    public Album(String nameAlbum) {
        this.title = nameAlbum;
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

    public String getCover() {
        return cover;
    }

    public void setCover(String cover) {
        this.cover = cover;
    }
}
