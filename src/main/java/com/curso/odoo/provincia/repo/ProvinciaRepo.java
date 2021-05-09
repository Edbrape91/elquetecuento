package com.curso.odoo.provincia.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.curso.odoo.provincia.model.Provincia;

@Repository
public interface ProvinciaRepo extends JpaRepository<Provincia, Integer>{

}
