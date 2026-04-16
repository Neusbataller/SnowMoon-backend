package com.example.SnowMoon.favorites.infraestructure.adapter.out.persistence.repository;


import com.example.SnowMoon.favorites.application.port.out.FavoriteRepository;
import com.example.SnowMoon.favorites.domain.model.Favorite;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;


//simula una bbdd
public class InMemoryFavoriteRepository implements FavoriteRepository {

    private final List<Favorite> favorites = new ArrayList<>();

    @Override
    public List<Favorite> findAll(){
        return favorites;
    }

    @Override
    public List<Favorite> findByUserId(String userId) {
        return List.of();
    }

    @Override
    public void save(Favorite favorite) {
        System.out.println("GUARDANDO EN MEMORIA: " + favorite.getTitle());
        favorites.add(favorite);
    }

    @Override
    public void deleteById(String id) {
        favorites.removeIf(f -> f.getId().equals(id));
    }

}
