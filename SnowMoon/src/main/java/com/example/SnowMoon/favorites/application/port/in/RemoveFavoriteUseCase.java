package com.example.SnowMoon.favorites.application.port.in;

//puede eliminar un favorito por id
public interface RemoveFavoriteUseCase {
    void removeFavorite(String id);
}
