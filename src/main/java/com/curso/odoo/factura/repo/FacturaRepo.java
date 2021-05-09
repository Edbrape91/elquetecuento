package com.curso.odoo.factura.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.curso.odoo.factura.model.Factura;

@Repository
public interface FacturaRepo extends JpaRepository<Factura, Integer>{

}
