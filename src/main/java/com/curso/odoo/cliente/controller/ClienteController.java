package com.curso.odoo.cliente.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.curso.odoo.cliente.model.Cliente;
import com.curso.odoo.cliente.service.ClienteService;
import com.curso.odoo.provincia.model.Provincia;
import com.curso.odoo.provincia.service.ProvinciaService;

@Controller
public class ClienteController {

	@Autowired
	private ClienteService clientesService;
	@Autowired
	private ProvinciaService provinciaService;
	
	@GetMapping("/cliente")
	public String listClientes(Model model) {
		
		//Pedir a la base de datos los clientes
				List<Cliente> clients = clientesService.find(); 
			
				//Pasarselas a la web(a traves del modelo)
				model.addAttribute("clientes", clients);
				
		
		return "ProyectoS/cliente";
	}

	@GetMapping("/clientes_new")
	public String clienteForm(Model model) {
		
		List<Provincia> provincia = provinciaService.find(); 
		
		model.addAttribute("provincias", provincia);
		
		return "ProyectoS/clientes_new";
	}
	

	@PostMapping("/clientes_new")
	public String clientePost(@RequestParam("nombreacliente") String nombrecliente, 
			@RequestParam("apellidoscliente") String apellidoscliente, 
			@RequestParam("indiOComp") char tipocliente,
			@RequestParam("direction1") String calle, 
			@RequestParam("direction2") String calle1,
			@RequestParam("ciudad") String ciudad, 
			@RequestParam("provincia") Integer codigoprovincia,
			@RequestParam("codigoPostal") Integer codigopostal,
			@RequestParam("nif") String nif, 
			@RequestParam("telefono") String telefono,
			@RequestParam("movil") String movil,
			@RequestParam("email") String email,
			@RequestParam("paginaweb") String paginaweb, 
			@RequestParam("categorias") String categorias){
		
		Cliente cliente_1 = new Cliente();
		
		Provincia p = provinciaService.findId(codigoprovincia);
		
		
		
		cliente_1.setNombrecliente(nombrecliente);
		cliente_1.setApellidoscliente(apellidoscliente);
		cliente_1.setTipocliente(tipocliente);
		cliente_1.setProvincia(p);
		cliente_1.setCalle(calle1);
		cliente_1.setCalle1(calle1);
		cliente_1.setCiudad(ciudad);
		cliente_1.setCodigopostal(codigopostal);
		cliente_1.setNif(nif);
		cliente_1.setTelefono(telefono);
		cliente_1.setMovil(movil);
		cliente_1.setEmail(email);
		cliente_1.setPaginaweb(paginaweb);
		cliente_1.setCategorias(categorias);
		
		
		clientesService.save(cliente_1);
	
		
		return "redirect:/cliente";
	}
	
	@GetMapping("/cliente_borrar")
	public String clienteBorra(@RequestParam Integer idCliente, Model model) {
		
		clientesService.delete(idCliente);
		
		return "redirect:/cliente";
	}
	
	@PostMapping("/buscarcliente")
	public String clienteFind(@RequestParam ("nombre") String nombre, Model model){
		
		List<Cliente> clientes = clientesService.findParam(nombre);
		
		model.addAttribute("clientes", clientes);
		
		return "ProyectoS/cliente";
	}
	
}
