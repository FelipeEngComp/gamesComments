package com.felipe.gamescomments.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.felipe.gamescomments.models.Comentario;

public interface ComentarioRepository extends JpaRepository<Comentario, Long>{

}
