package com.curso.odoo.pais.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.curso.odoo.pais.model.Pais;

@Repository
public interface PaisRepo extends JpaRepository<Pais, Integer>{

}
