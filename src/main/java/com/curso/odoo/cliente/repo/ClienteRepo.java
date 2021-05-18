package com.curso.odoo.cliente.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.curso.odoo.cliente.model.Cliente;

@Repository
public interface ClienteRepo extends JpaRepository<Cliente, Integer>{
	
	@Query("FROM Cliente where nombrecliente = :nombre ") 
	List<Cliente> findElement(@Param("nombre") String  nombre);
	

}
