package com.curso.odoo.factura.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.curso.odoo.factura.model.Factura;
import com.curso.odoo.factura.repo.FacturaRepo;

@Service
public class FacturaService {

	@Autowired
	private FacturaRepo facturaRepo;
	
	public List<Factura> find(){
		return facturaRepo.findAll();
	}
	
	public void save(Factura factura){
		facturaRepo.save(factura);
	}
	
	public void delete(Integer idFactura) {
		facturaRepo.deleteById(idFactura);
	}

	public Optional<Factura> findId(Integer Id){
		return facturaRepo.findById(Id);
	}
}
