package com.proyecto.demo.service;

import java.util.List;

import com.proyecto.demo.model.Usuario;

public interface UserService {

	/**
	 * Guarda un usuario
	 * @param user
	 * @return el usuario guardado
	 */
	Usuario save(Usuario user);

	/**
	 * Recupera la lista de Usuarios
	 * @return lista de usuarios
	 */
	List<Usuario> mostrarUsuarios();

	/**
	 * Eliminar un usuario con el id recibido
	 * @param id
	 */
	void eliminarUsuario(Long id);

}
