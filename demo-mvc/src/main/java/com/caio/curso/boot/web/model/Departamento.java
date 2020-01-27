package com.caio.curso.boot.web.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@SuppressWarnings("serial")
@Entity
@Table(name="departamentos")
public class Departamento extends EntidadeAbstrata<Long> {
	//Atitbuto name opcional quando nomes iguais no modelo e no bd
	@Column(name="nome", nullable=false, unique=true, length=60)
	private String nome;
	
	@OneToMany(mappedBy = "departamento")
	private List<Cargos> cargos;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Cargos> getCargos() {
		return cargos;
	}

	public void setCargos(List<Cargos> cargos) {
		this.cargos = cargos;
	}
	
}
