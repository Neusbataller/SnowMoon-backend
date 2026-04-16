package com.example.SnowMoon.favorites.application.port.in;

import com.example.SnowMoon.favorites.domain.model.Favorite;

import java.util.List;

public interface GetFavoritesUseCase {

    List<Favorite> getFavorites(String userId);
}