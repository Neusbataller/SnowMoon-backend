package com.example.SnowMoon.favorites.domain.model;

public class Favorite  {
    private String id;
    private String title;
    private String artist;
    private String image;
    private String preview;
    private String userId;

    public Favorite(String id, String title, String artist, String image, String preview, String userId) {
        this.id = id;
        this.title = title;
        this.artist = artist;
        this.image = image;
        this.preview = preview;
        this.userId = userId;

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getPreview() {
        return preview;
    }


    public void setPreview(String preview) {
        this.preview = preview;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
}
