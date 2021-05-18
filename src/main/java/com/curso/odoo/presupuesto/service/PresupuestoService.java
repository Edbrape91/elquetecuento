package com.curso.odoo.presupuesto.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.curso.odoo.presupuesto.model.Presupuesto;
import com.curso.odoo.presupuesto.repo.PresupuestoRepo;

@Service
public class PresupuestoService {

	@Autowired
	private PresupuestoRepo presupuestoRepo;
	
	public PresupuestoRepo getPresupuestoRepo() {
		return presupuestoRepo;
	}

	
	public List<Presupuesto> find(){
		return presupuestoRepo.findAll();
	}
	
	public void save(Presupuesto presupuesto){
		presupuestoRepo.save(presupuesto);
	}
	
	public void delete(Integer idPresupuesto) {
		presupuestoRepo.deleteById(idPresupuesto);
	}
	
	public Optional<Presupuesto> findId(Integer Id){
		return presupuestoRepo.findById(Id);
	}
	
	
}
