package com.curso.odoo.pais.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.curso.odoo.comercial.model.Comercial;
import com.curso.odoo.pais.model.Pais;
import com.curso.odoo.pais.repo.PaisRepo;



@Service
public class PaisService {

	@Autowired
	private PaisRepo paisRepo;
	
	public List<Pais> find(){
		return paisRepo.findAll();
	}
	
	public void save(Pais pais){
		paisRepo.save(pais);
	}
}
