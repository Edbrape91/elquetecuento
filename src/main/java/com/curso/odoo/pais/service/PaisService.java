package com.curso.odoo.pais.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.curso.odoo.pais.repo.PaisRepo;



@Service
public class PaisService {

	@Autowired
	private PaisRepo paisRepo;
	
}
