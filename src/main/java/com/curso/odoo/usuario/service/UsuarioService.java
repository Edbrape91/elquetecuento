package com.curso.odoo.usuario.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.curso.odoo.usuario.model.Usuario;
import com.curso.odoo.usuario.repo.UsuarioRepo;


@Service
public class UsuarioService {
	
	@Autowired
	private UsuarioRepo usuarioRepo;

	public UsuarioRepo getClienteRepo() {
		return usuarioRepo;
	}

	
	public List<Usuario> find(){
		return usuarioRepo.findAll();
	}
	
	public void save(Usuario usuario){
		usuarioRepo.save(usuario);
	}
	
	public void delete(Integer idUsuario) {
		usuarioRepo.deleteById(idUsuario);
	}

	public List<Usuario> findParam(String Nombre , String Pass ){
		return usuarioRepo.findElement(Nombre, Pass);
	}
	
}
