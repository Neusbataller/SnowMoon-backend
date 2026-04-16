package com.example.SnowMoon.favorites.application.port.in;

import com.example.SnowMoon.favorites.domain.model.Favorite;

public interface AddFavoriteUseCase {
    void addFavorite(Favorite favorite);
}
