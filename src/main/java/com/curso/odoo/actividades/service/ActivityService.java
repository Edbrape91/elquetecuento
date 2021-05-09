package com.curso.odoo.actividades.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.curso.odoo.actividades.model.Activity;
import com.curso.odoo.actividades.repo.ActivityRepo;

@Service
public class ActivityService {
	
	@Autowired
	private ActivityRepo actividadRepo;
	
	public List<Activity> find(){
		return actividadRepo.findAll();
	}
	
	public void save(Activity activity){
		actividadRepo.save(activity);
	}
	

}
