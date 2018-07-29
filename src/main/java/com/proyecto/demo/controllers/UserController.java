package com.proyecto.demo.controllers;

import java.io.IOException;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.proyecto.demo.model.Usuario;
import com.proyecto.demo.service.UserService;
import com.proyecto.demo.util.RestResponse;

@RestController
public class UserController {
	
	@Autowired
	protected UserService userService;
	
	protected ObjectMapper mapper;
	
	@RequestMapping(value = "/saveOrUpdate", method = RequestMethod.POST)
	public RestResponse saveOrUpdate(@RequestBody String userJson) 
			throws JsonParseException, JsonMappingException, IOException {
		this.mapper = new ObjectMapper();
		
		Usuario user = this.mapper.readValue(userJson, Usuario.class);
		
		if(!this.validate(user)) {
			return new RestResponse(HttpStatus.NOT_ACCEPTABLE.value(), 
					"Llene los campos obligatorios");
		}
		
		this.userService.save(user);
		
		return new RestResponse(HttpStatus.OK.value(), "Operacion Exitosa!");
		
	}
	
	@RequestMapping(value = "/getUsers", method = RequestMethod.GET)
	public List<Usuario> getUsers() {
		return this.userService.mostrarUsuarios();
	}
	
	private boolean validate(Usuario user) {
		boolean isValid = true;
		
		if(StringUtils.trimToNull(user.getPrimerNombre()) == null) {	
			isValid = false;
		}
		if(StringUtils.trimToNull(user.getApellido()) == null) {
			isValid = false;
		}
		if(StringUtils.trimToNull(user.getDireccion()) == null) {
			isValid = false;
		}
		return isValid;
	}
	
}







