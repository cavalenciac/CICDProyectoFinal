package com.bancolombia.app.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bancolombia.app.datasource.ArticuloRepository;
import com.bancolombia.app.entities.Articulo;


@Service
public class ServiceImpl implements IService{

	@Autowired
	private ArticuloRepository repositorio;
	
	@Override
	public boolean insert(Articulo articulo) {
		
		return repositorio.insert(articulo);
	}

	@Override
	public List<Articulo> getAll() {
		
		return repositorio.getAll();
	}
	
}
