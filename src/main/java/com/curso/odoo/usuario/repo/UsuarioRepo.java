package com.curso.odoo.usuario.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.curso.odoo.usuario.model.Usuario;

@Repository
public interface UsuarioRepo extends JpaRepository<Usuario, Integer> {
	
	@Query("SELECT nombreausuario, passusuario  FROM Usuario where nombreausuario = :nombre and passusuario = :pass") 
	List<Usuario> findElement(@Param("nombre") String  nombre, @Param("pass") String  pass);
	
}
