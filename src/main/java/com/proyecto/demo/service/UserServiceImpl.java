package com.proyecto.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proyecto.demo.dao.UserRepository;
import com.proyecto.demo.model.Usuario;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	protected UserRepository userRepository;

	@Override
	public Usuario save(Usuario user) {
		return this.userRepository.save(user);
	}
}
