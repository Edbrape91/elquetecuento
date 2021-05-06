package com.curso.odoo.repositorios.Actividades;

import org.springframework.data.repository.CrudRepository;

import com.curso.odoo.model.Actividades.Activity;

public interface ActividadRepo extends CrudRepository<Activity, Integer> {

}
