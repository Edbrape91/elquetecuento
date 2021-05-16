package com.curso.odoo.cliente.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.curso.odoo.cliente.model.Cliente;
import com.curso.odoo.cliente.repo.ClienteRepo;
import com.curso.odoo.usuario.model.Usuario;

@Service
public class ClienteService {

	
	@Autowired
	private ClienteRepo clienteRepo;

	public ClienteRepo getClienteRepo() {
		return clienteRepo;
	}

	
	public List<Cliente> find(){
		return clienteRepo.findAll();
	}
	
	public void save(Cliente cliente){
		clienteRepo.save(cliente);
	}
	
	public void delete(Integer idClient) {
		clienteRepo.deleteById(idClient);
	}
	
	public List<Cliente> findParam(String Nombre){
		return clienteRepo.findElement(Nombre);
	}

}
