package com.curso.odoo.provincia.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.curso.odoo.provincia.repo.ProvinciaRepo;

@Service
public class ProvinciaService {

	
	@Autowired
	private ProvinciaRepo provinciaRepo;
	
}
