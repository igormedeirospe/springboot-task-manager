package com.gestor.conteudo.tarefa.repository;

import com.gestor.conteudo.tarefa.entity.TarefaEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Repository extends JpaRepository<TarefaEntity, Long> {



}


