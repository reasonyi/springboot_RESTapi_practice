package com.example.hackertonPractice.movie;

import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieRepository extends JpaRepository<Movie, Long> {   // JpaRepository<Entity, PK타입>
}
