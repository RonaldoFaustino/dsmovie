package com.desuperior.dsmovie.repositories;



import org.springframework.data.jpa.repository.JpaRepository;

import com.desuperior.dsmovie.entities.Score;
import com.desuperior.dsmovie.entities.ScorePK;


public interface ScoreRepository extends JpaRepository<Score, ScorePK> {
	
	
}
