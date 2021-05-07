package com.curso.odoo.repositorios.Actividades;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.curso.odoo.model.Actividades.Activity;


@Repository
public interface ActividadRepo extends JpaRepository<Activity, Integer> {

}
