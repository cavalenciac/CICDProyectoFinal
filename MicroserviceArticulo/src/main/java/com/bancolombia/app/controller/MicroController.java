package com.bancolombia.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bancolombia.app.entities.Articulo;
import com.bancolombia.app.services.IService;

@RestController
@RequestMapping("/articulo")//http://ip:port/articulo
public class MicroController {

	@Autowired
	private IService servicio;
	
	//agregamos el metodo post->insert
	@PostMapping
	public ResponseEntity<String> insert(@RequestBody Articulo articulo){
		
		if(servicio.insert(articulo))
			return new ResponseEntity<String>("OK", HttpStatus.CREATED);
				
		return new ResponseEntity<String>("OK", HttpStatus.BAD_REQUEST);
	}
	//agregamos el metodo get para que retorne informacion de la lista
	@GetMapping //se va a activar cuando GET -> http://ip:port/articulo
	public ResponseEntity<List<Articulo>> get(){
		
		return new ResponseEntity<List<Articulo>>(servicio.getAll(), HttpStatus.OK);
	}
	
}
