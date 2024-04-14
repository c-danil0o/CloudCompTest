package org.example.cloudmovies.repository;

import org.example.cloudmovies.model.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MoviesRepository extends JpaRepository<Movie, Long> {
}
