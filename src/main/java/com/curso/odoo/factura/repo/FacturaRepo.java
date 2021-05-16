package com.curso.odoo.factura.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.curso.odoo.factura.model.Factura;
import com.curso.odoo.usuario.model.Usuario;

@Repository
public interface FacturaRepo extends JpaRepository<Factura, Integer>{
	
	

}
