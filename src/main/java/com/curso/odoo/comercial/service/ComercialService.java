package com.curso.odoo.comercial.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.curso.odoo.comercial.model.Comercial;
import com.curso.odoo.comercial.repo.ComercialRepo;

@Service
public class ComercialService {
	
	@Autowired
	private ComercialRepo comercialRepo;
	
	public List<Comercial> find(){
		return comercialRepo.findAll();
	}
	
	public void save(Comercial comercial){
		comercialRepo.save(comercial);
	}

	public void delete(Integer idComercial) {
		comercialRepo.deleteById(idComercial);
	}

	
}
