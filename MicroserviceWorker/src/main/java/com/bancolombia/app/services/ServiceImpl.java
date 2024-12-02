package com.bancolombia.app.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bancolombia.app.datasource.WorkerRepository;
import com.bancolombia.app.entities.Worker;




@Service
public class ServiceImpl implements IService{

	@Autowired
	private WorkerRepository repositorio;
	
	
	@Override
	public boolean insert(Worker worker) {
		
		return repositorio.insert(worker);
	}

	@Override
	public List<Worker> getAll() {
		
		return repositorio.getAll();
	}
}
