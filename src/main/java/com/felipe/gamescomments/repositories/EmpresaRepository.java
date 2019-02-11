package com.felipe.gamescomments.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.felipe.gamescomments.models.Empresa;

public interface EmpresaRepository extends JpaRepository<Empresa, Long>{

}
