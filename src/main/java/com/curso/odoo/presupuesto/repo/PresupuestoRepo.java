package com.curso.odoo.presupuesto.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.curso.odoo.presupuesto.model.Presupuesto;

@Repository
public interface PresupuestoRepo extends JpaRepository<Presupuesto, Integer>{

}
