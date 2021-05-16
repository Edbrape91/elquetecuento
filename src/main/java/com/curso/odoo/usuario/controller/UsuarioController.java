package com.curso.odoo.usuario.controller;

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

	@PostMapping("/login")
	public String usuarioForm(@RequestParam("nombreausuario") String nombreausuario,
			@RequestParam("passusuario") String passusuario) {

		if(usuarioService.findParam(nombreausuario , passusuario)==null) {
		return "redirect:/login";
		}
		else{
			return "redirect:/index";
		}
	}
//
//	@PostMapping("/registro")
//	public String registroForm(@RequestParam("email") String email,
//			@RequestParam("nombreausuario") String nombreausuario,
//			@RequestParam("passusuario") String passusuario,
//			@RequestParam("direccion") String direccion,
//			@RequestParam("nombre") String nombre,
//			@RequestParam("apellidos") String apellidos,
//			@RequestParam("ciudad") String ciudad,
//			@RequestParam("provincia") String provincia,
//			@RequestParam("cp") String cp
//			) {
//
//		Usuario newUser_1 = new Usuario();
//
//		newUser_1.setCodigoestadopago(codigoestadopago);
//		newUser_1.setNombreestadopago(nombreestadopago);
//
//		
//		//poner el metodo save
//		usuarioService.find();
//
//		return "redirect:/login";
//	}
//	
	
}
