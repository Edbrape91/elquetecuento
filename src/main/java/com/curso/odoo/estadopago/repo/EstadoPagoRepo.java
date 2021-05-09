package com.curso.odoo.estadopago.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.curso.odoo.estadopago.model.EstadoPago;

@Repository
public interface EstadoPagoRepo extends JpaRepository<EstadoPago, Integer>{

}
