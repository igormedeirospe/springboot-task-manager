package com.gestor.conteudo.tarefa.service;

import com.gestor.conteudo.tarefa.entity.TarefaEntity;
import com.gestor.conteudo.tarefa.repository.Repository;

@org.springframework.stereotype.Service
public class Service {

    private final Repository repository;

    public Service(Repository repository) {
        this.repository = repository;
    }

    //metodos
    public TarefaEntity save(TarefaEntity tarefa) {
        return repository.save(tarefa);
    }
    public TarefaEntity findById(Long id) {
        return repository.findById(id).orElse(null);
    }



}
