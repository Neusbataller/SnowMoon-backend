package com.example.SnowMoon.favorites.infraestructure.adapter.out.persistence.repository;

import com.example.SnowMoon.favorites.application.port.out.FavoriteRepository;
import com.example.SnowMoon.favorites.domain.model.Favorite;
import com.example.SnowMoon.favorites.infraestructure.adapter.out.persistence.document.FavoriteDocument;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class FavoriteMongoAdapter implements FavoriteRepository {

    private final MongoFavoriteRepository mongoFavoriteRepository;

    public FavoriteMongoAdapter(MongoFavoriteRepository mongoFavoriteRepository) {
        this.mongoFavoriteRepository = mongoFavoriteRepository;
    }

    @Override
    public List<Favorite> findAll() {
        return mongoFavoriteRepository.findAll()
                .stream()
                .map(doc -> new Favorite(
                        doc.getId(),
                        doc.getTitle(),
                        doc.getArtist(),
                        doc.getImage(),
                        doc.getPreview(),
                        doc.getUserId()
                ))
                .toList();
    }

    @Override
    public List<Favorite> findByUserId(String userId) {
        return mongoFavoriteRepository.findByUserId(userId)
                .stream()
                .map(doc -> new Favorite(
                        doc.getId(),
                        doc.getTitle(),
                        doc.getArtist(),
                        doc.getImage(),
                        doc.getPreview(),
                        doc.getUserId()
                ))
                .toList();
    }

    @Override
    public void save(Favorite favorite) {
        FavoriteDocument document = new FavoriteDocument(
                favorite.getId(),
                favorite.getTitle(),
                favorite.getArtist(),
                favorite.getImage(),
                favorite.getPreview(),
                favorite.getUserId()
        );

        mongoFavoriteRepository.save(document);
    }

    @Override
    public void deleteById(String id) {
        mongoFavoriteRepository.deleteById(id);
    }
}