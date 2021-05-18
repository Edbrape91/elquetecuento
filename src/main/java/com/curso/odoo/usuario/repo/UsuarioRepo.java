package com.curso.odoo.usuario.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.curso.odoo.usuario.model.Usuario;

@Repository
public interface UsuarioRepo extends JpaRepository<Usuario, Integer> {
	
	// Query nativa
	@Query(value="SELECT * FROM Usuario WHERE nombreausuario = ?1 AND passusuario = ?2", nativeQuery=true) 
	List<Usuario> findElement(String  nombreausuario, String  passusuario);

	// query method
	List<Usuario> findByNombreausuarioAndPassusuario(String nombre, String pass);
	
}
