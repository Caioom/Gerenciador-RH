package com.caio.curso.boot.dao;

import org.springframework.stereotype.Repository;

import com.caio.curso.boot.web.model.Funcionario;

@Repository
public class FuncionarioDaoImpl extends DaoAbstrato<Funcionario, Long> implements FuncionarioDao {

}
