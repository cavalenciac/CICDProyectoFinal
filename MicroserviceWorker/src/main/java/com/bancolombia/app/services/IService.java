package com.bancolombia.app.services;

import java.util.List;

import com.bancolombia.app.entities.Worker;


public interface IService {
	boolean insert(Worker worker);
	List<Worker> getAll();
}
