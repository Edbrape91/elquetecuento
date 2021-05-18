package com.curso.odoo.usuario.controller;

import java.util.List;

import javax.persistence.Column;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.curso.odoo.usuario.model.Usuario;
import com.curso.odoo.usuario.service.UsuarioService;

@Controller
public class UsuarioController {

	@Autowired
	private UsuarioService usuarioService;

	@GetMapping("/login")
	public String usuarioList(Model model) {

		return "ProyectoS/login";
	}
	
	@GetMapping("/registro")
	public String registroList(Model model) {

		return "ProyectoS/registro";
	}
	@GetMapping("/restaurar")
	public String usuarioRestore(Model model) {

		return "ProyectoS/restaurarcontraseña";
	}

	@PostMapping("/login")
	public String usuarioForm(@RequestParam("nombreausuario") String nombreausuario,
			@RequestParam("passusuario") String passusuario) {
        List <Usuario> lista = usuarioService.findParam(nombreausuario , passusuario);
		if(lista.isEmpty()) {
			return "redirect:/login";
		}
		else{
			return "redirect:/index?login=success";
		}
	}

	@PostMapping("/registro")
	public String registroForm(@RequestParam("email") String email,
			@RequestParam("nombreausuario") String nombreausuario,
			@RequestParam("passusuario") String passusuario,
			@RequestParam("direccion") String direccion,
			@RequestParam("nombre") String nombre,
			@RequestParam("apellidos") String apellidos,
			@RequestParam("ciudad") String ciudad,
			@RequestParam("provincia") String provincia,
			@RequestParam("cp") Integer cp
			) {

		Usuario newUser_1 = new Usuario();

		newUser_1.setEmail(email);
		newUser_1.setNombreausuario(nombreausuario);
		newUser_1.setPassusuario(passusuario);
		newUser_1.setDireccion(direccion);
		newUser_1.setNombre(nombre);
		newUser_1.setApellidos(apellidos);
		newUser_1.setCiudad(ciudad);
		newUser_1.setProvincia(provincia);
		newUser_1.setCp(cp);

		
		//poner el metodo save
		usuarioService.save(newUser_1);

		return "redirect:/login";
	}
	
	
}
