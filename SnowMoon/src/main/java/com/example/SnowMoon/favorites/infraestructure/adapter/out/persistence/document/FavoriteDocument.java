package com.example.SnowMoon.favorites.infraestructure.adapter.out.persistence.document;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "favorites")
public class FavoriteDocument {

    @Id
    private String id;
    private String title;
    private String artist;
    private String image;
    private String preview;
    private String userId;

    public FavoriteDocument() {
    }

    public FavoriteDocument(String id, String title, String artist, String image, String preview, String userId) {
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

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    public String getImage() {
        return image;
    }

    public String getPreview() {
        return preview;
    }

    public String getUserId() {
        return userId;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public void setPreview(String preview) {
        this.preview = preview;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
}