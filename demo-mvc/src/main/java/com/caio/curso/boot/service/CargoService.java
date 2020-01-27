package com.caio.curso.boot.service;

import java.util.List;

import com.caio.curso.boot.web.model.Cargos;

public interface CargoService {
	
	void salvar(Cargos cargo);
	
	void editar(Cargos cargo);
	
	void excluir(Long id);
	
	Cargos buscarPorId(Long id);
	
	List<Cargos> buscarTodos();
	
}
