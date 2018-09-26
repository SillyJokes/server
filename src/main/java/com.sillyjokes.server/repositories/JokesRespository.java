package com.sillyjokes.server.repositories;

import com.sillyjokes.server.models.Jokes;

//JPA Spring library import
import org.springframework.data.jpa.repository.JpaRepository;

//repository interface that extends JPA Repository
public interface JokesRespository extends JpaRepository<Jokes, Long> {
}
