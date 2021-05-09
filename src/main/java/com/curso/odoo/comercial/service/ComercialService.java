package com.curso.odoo.comercial.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.curso.odoo.comercial.repo.ComercialRepo;

@Service
public class ComercialService {
	
	@Autowired
	private ComercialRepo comercialRepo;

}
