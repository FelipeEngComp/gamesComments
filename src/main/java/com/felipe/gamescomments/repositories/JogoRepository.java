package com.felipe.gamescomments.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.felipe.gamescomments.models.Jogo;

public interface JogoRepository extends JpaRepository<Jogo, Long> {

}
