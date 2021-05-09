package com.curso.odoo.comercial.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.curso.odoo.comercial.model.Comercial;

@Repository
public interface ComercialRepo extends JpaRepository<Comercial, Integer>{

}
