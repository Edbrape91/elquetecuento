package com.curso.odoo.actividades.service;

import java.util.List;
import java.util.Optional;

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
	
	public void delete(Integer idActivity) {
		actividadRepo.deleteById(idActivity);
	}

	public Activity findId(Integer Id){
		return actividadRepo.findById(Id).orElseThrow();
	}
	
}
