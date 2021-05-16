package com.curso.odoo.usuario.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="usuario")
public class Usuario {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	 private int codigousuario;
	@Column
	private String nombreausuario;
	@Column
	private String passusuario; 
	@Column
	private String  email;
	@Column
	private String direccion;  
	@Column
	private String nombre; 
	@Column
	private String  apellidos;
	@Column
	private String ciudad; 
	@Column
	private String provincia;
	@Column
	private int cp;
	
	
	public int getCodigousuario() {
		return codigousuario;
	}
	public void setCodigousuario(int codigousuario) {
		this.codigousuario = codigousuario;
	}
	public String getNombreausuario() {
		return nombreausuario;
	}
	public void setNombreausuario(String nombreausuario) {
		this.nombreausuario = nombreausuario;
	}
	public String getPassusuario() {
		return passusuario;
	}
	public void setPassusuario(String passusuario) {
		this.passusuario = passusuario;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public String getCiudad() {
		return ciudad;
	}
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
	public String getProvincia() {
		return provincia;
	}
	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}
	public int getCp() {
		return cp;
	}
	public void setCp(int cp) {
		this.cp = cp;
	}  
	
	
}
