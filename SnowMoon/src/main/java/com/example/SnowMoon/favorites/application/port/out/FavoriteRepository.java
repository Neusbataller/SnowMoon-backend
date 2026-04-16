package com.example.SnowMoon.favorites.application.port.out;

import com.example.SnowMoon.favorites.domain.model.Favorite;
import java.util.List;

//interface = contrato, define que puede hacer pero no cómo se hace
public interface FavoriteRepository {
    List<Favorite> findAll();
    List <Favorite> findByUserId(String userId);
    void save(Favorite favorite); //guardar un favorito, no cómo lo guarda
    void deleteById(String id); //poder borrar un favorito por su ID, no cómo lo elimina
}

//puede guardar, obtener, borrar.. pero no sabe cómo