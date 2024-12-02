package com.bancolombia.app.datasource;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.bancolombia.app.entities.Worker;



@Component
public class WorkerRepository {

private final List<Worker> lista=new ArrayList<>();
	
	public boolean insert(Worker worker) {
		return lista.add(worker);
	}
	
	public List<Worker> getAll(){
		return lista;
	}
}

