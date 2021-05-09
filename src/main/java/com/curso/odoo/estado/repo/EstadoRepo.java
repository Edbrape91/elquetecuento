package com.curso.odoo.estado.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.curso.odoo.estado.model.Estado;

@Repository
public interface EstadoRepo extends JpaRepository<Estado, Integer>{

}
