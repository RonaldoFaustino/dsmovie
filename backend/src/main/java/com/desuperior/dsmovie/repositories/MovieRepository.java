package com.desuperior.dsmovie.repositories;



import org.springframework.data.jpa.repository.JpaRepository;

import com.desuperior.dsmovie.entities.Movie;

public interface MovieRepository extends JpaRepository<Movie, Long> {
	
	
}
