package com.example.musify.util;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class ParseJson {
    public static List <Data> parseResponse(String json) {
        Gson gson = new Gson();
        Response response =  gson.fromJson(json, Response.class);
        List<Data> dataList = response.getData();
        return dataList;
    }

    public static class Response {
        @SerializedName("data")
        private List<ParseJson.Data> data;

        public List<ParseJson.Data> getData() {
            return data;
        }
    }

    public static class Data {
        @SerializedName("id")
        private long id;
        @SerializedName("readable")
        private boolean readable;
        @SerializedName("title")
        private String title;
        @SerializedName("title_short")
        private String titleShort;
        @SerializedName("title_version")
        private String titleVersion;
        @SerializedName("link")
        private String link;
        @SerializedName("duration")
        private int duration;
        @SerializedName("rank")
        private int rank;
        @SerializedName("explicit_lyrics")
        private boolean explicitLyrics;
        @SerializedName("explicit_content_lyrics")
        private int explicitContentLyrics;
        @SerializedName("explicit_content_cover")
        private int explicitContentCover;
        @SerializedName("preview")
        private String preview;
        @SerializedName("md5_image")
        private String md5Image;
        @SerializedName("artist")
        private ParseJson.Artist artist;
        @SerializedName("album")
        private ParseJson.Album album;

        @SerializedName("type")
        private String type;

        public long getId() {
            return id;
        }
        public String getTitle() {
            return title;
        }

        public String getPreview() {
            return preview;
        }

        public ParseJson.Artist getArtist() {
            return artist;
        }

        public ParseJson.Album getAlbum() {
            return album;
        }

        public int getDuration() {
            return duration;
        }
    }

    public static class Album {
        @SerializedName("id")
        private long id;
        @SerializedName("title")
        private String title;
        @SerializedName("cover")
        private String cover;
        @SerializedName("cover_small")
        private String coverSmall;
        @SerializedName("cover_medium")
        private String coverMedium;
        @SerializedName("cover_big")
        private String coverBig;
        @SerializedName("cover_xl")
        private String coverXl;
        @SerializedName("md5_image")
        private String md5Image;
        @SerializedName("tracklist")
        private String tracklist;

        @SerializedName("type")
        private String type;

        public long getId() {
            return id;
        }

        public String getTitle() {
            return title;
        }

        public String getCover() {
            return cover;
        }
    }

    public static class Artist {
        @SerializedName("id")
        private long id;
        @SerializedName("name")
        private String name;
        @SerializedName("link")
        private String link;
        @SerializedName("picture")
        private String picture;
        @SerializedName("picture_small")
        private String pictureSmall;
        @SerializedName("picture_medium")
        private String pictureMedium;
        @SerializedName("picture_big")
        private String pictureBig;
        @SerializedName("picture_xl")
        private String pictureXl;
        @SerializedName("tracklist")
        private String tracklist;

        @SerializedName("type")
        private String type;

        public String getName() {
            return name;
        }

        public long getId() {
            return id;
        }

        public String getPicture() {
            return picture;
        }
    }
}
