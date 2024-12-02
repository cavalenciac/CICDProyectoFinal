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

import com.bancolombia.app.entities.Worker;
import com.bancolombia.app.services.IService;

@RestController
@RequestMapping("/worker")//http://ip:port/articulo
public class MicroController {

	@Autowired
	private IService servicio;
	
	//agregamos el metodo post->insert
		@PostMapping
		public ResponseEntity<String> insert(@RequestBody Worker worker){
			
			if(servicio.insert(worker))
				return new ResponseEntity<String>("OK", HttpStatus.CREATED);
					
			return new ResponseEntity<String>("OK", HttpStatus.BAD_REQUEST);
		}
		//agregamos el metodo get para que retorne informacion de la lista
		@GetMapping //se va a activar cuando GET -> http://ip:port/worker
		public ResponseEntity<List<Worker>> get(){
			
			return new ResponseEntity<List<Worker>>(servicio.getAll(), HttpStatus.OK);
		}
		
}
