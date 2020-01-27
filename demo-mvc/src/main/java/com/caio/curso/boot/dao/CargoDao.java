package com.caio.curso.boot.dao;

import java.util.List;

import com.caio.curso.boot.web.model.Cargos;

public interface CargoDao {

	void save(Cargos cargo);
	
	void update(Cargos cargo);
	
	void delete(Long id);
	
	Cargos findById(Long id);
	
	List<Cargos> findAll();
}
