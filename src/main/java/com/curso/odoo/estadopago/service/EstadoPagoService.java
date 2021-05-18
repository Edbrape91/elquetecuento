package com.curso.odoo.estadopago.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.curso.odoo.estadopago.model.EstadoPago;
import com.curso.odoo.estadopago.repo.EstadoPagoRepo;

@Service
public class EstadoPagoService {

	@Autowired
	private EstadoPagoRepo estadoPagoRepo;
	

	public List<EstadoPago> find() {
		return estadoPagoRepo.findAll();
	}

	public void save(EstadoPago estadopago) {
		estadoPagoRepo.save(estadopago);
	}

	public EstadoPago findId(Integer Id){
		return estadoPagoRepo.findById(Id).orElseThrow();
	}
}
