package com.curso.odoo.actividades.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.curso.odoo.actividades.model.Activity;


@Repository
public interface ActivityRepo extends JpaRepository<Activity, Integer> {

}
