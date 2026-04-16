package com.example.SnowMoon.favorites.infraestructure.adapter.in.controller;

import com.example.SnowMoon.favorites.application.port.in.AddFavoriteUseCase;
import com.example.SnowMoon.favorites.application.port.in.GetFavoritesUseCase;
import com.example.SnowMoon.favorites.application.port.in.RemoveFavoriteUseCase;
import com.example.SnowMoon.favorites.domain.model.Favorite;
import com.example.SnowMoon.favorites.infraestructure.adapter.in.dto.CreateFavoriteRequest;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("/api/favorites")
public class FavoriteController {

    private final GetFavoritesUseCase getFavoritesUseCase;
    private final AddFavoriteUseCase addFavoriteUseCase;
    private final RemoveFavoriteUseCase removeFavoriteUseCase;

    public FavoriteController(GetFavoritesUseCase getFavoritesUseCase,
                              AddFavoriteUseCase addFavoriteUseCase,
                              RemoveFavoriteUseCase removeFavoriteUseCase) {
        this.getFavoritesUseCase = getFavoritesUseCase;
        this.addFavoriteUseCase = addFavoriteUseCase;
        this.removeFavoriteUseCase = removeFavoriteUseCase;
    }

    @GetMapping
    public List<Favorite> getFavorites(@RequestParam String userId) {
        return getFavoritesUseCase.getFavorites(userId);
    }

    @PostMapping
    public void addFavorite(@RequestBody CreateFavoriteRequest request) {
        Favorite favorite = new Favorite(
                request.getId(),
                request.getTitle(),
                request.getArtist(),
                request.getImage(),
                request.getPreview(),
                request.getUserId()
        );

        addFavoriteUseCase.addFavorite(favorite);
    }

    @DeleteMapping("/{id}")
    public void removeFavorite(@PathVariable String id) {
        removeFavoriteUseCase.removeFavorite(id);
    }
}