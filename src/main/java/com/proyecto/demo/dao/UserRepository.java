package com.proyecto.demo.dao;


import org.springframework.data.jpa.repository.JpaRepository;

import com.proyecto.demo.model.Usuario;

public interface UserRepository extends JpaRepository<Usuario, Long>{
	
	@SuppressWarnings("unchecked")
	Usuario save(Usuario user);
	

}
