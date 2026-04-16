package com.example.SnowMoon.favorites.application.service;


import com.example.SnowMoon.favorites.application.port.in.AddFavoriteUseCase;
import com.example.SnowMoon.favorites.application.port.in.GetFavoritesUseCase;
import com.example.SnowMoon.favorites.application.port.in.RemoveFavoriteUseCase;
import com.example.SnowMoon.favorites.application.port.out.FavoriteRepository;
import com.example.SnowMoon.favorites.domain.model.Favorite;
import org.springframework.stereotype.Service;

import java.util.List;

//cerebro, implementa caso de uso, usa el repositorio pero no sabe cómo funciona por dentro

@Service
public class FavoriteService implements GetFavoritesUseCase, AddFavoriteUseCase , RemoveFavoriteUseCase {
    private final FavoriteRepository favoriteRepository;

    public FavoriteService(FavoriteRepository favoriteRepository){
        this.favoriteRepository = favoriteRepository;
    }

    @Override
    public List<Favorite> getFavorites(String userId){
        return favoriteRepository.findByUserId(userId);
    }

    @Override
    public void addFavorite(Favorite favorite){
        favoriteRepository.save(favorite);
    }

    @Override
    public void removeFavorite(String id) {
        favoriteRepository.deleteById(id);
    }

}
