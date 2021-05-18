package com.curso.odoo.provincia.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.curso.odoo.provincia.model.Provincia;
import com.curso.odoo.provincia.repo.ProvinciaRepo;

@Service
public class ProvinciaService {

	
	@Autowired
	private ProvinciaRepo provinciaRepo;
	
	public List<Provincia> find(){
		return provinciaRepo.findAll();
	}
	
	public Provincia findId(Integer Id){
		return provinciaRepo.findById(Id).orElseThrow();
	}
	
}
