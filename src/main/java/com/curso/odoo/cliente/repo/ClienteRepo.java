package com.curso.odoo.cliente.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.curso.odoo.cliente.model.Cliente;

@Repository
public interface ClienteRepo extends JpaRepository<Cliente, Integer>{

}
