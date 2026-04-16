package com.example.SnowMoon.favorites.infraestructure.adapter.out.persistence.repository;

import com.example.SnowMoon.favorites.infraestructure.adapter.out.persistence.document.FavoriteDocument;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface MongoFavoriteRepository extends MongoRepository<FavoriteDocument, String> {
    List<FavoriteDocument> findByUserId(String userId);
}

//Spring genera automáticamente métodos cómo findAll(), save(), deleteById()