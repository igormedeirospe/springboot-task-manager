package com.gestor.conteudo.tarefa.entity;

import jakarta.persistence.*;

@jakarta.persistence.Entity
@Table(name = "db_conteudo")
public class TarefaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

}
