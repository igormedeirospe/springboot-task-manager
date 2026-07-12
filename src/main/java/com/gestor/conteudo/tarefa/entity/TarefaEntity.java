package com.gestor.conteudo.tarefa.entity;

import jakarta.persistence.*;

@jakarta.persistence.Entity
@Table(name = "db_conteudo")
public class TarefaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String descricao;

    private int postadoToday;

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getPostadoToday() {
        return postadoToday;
    }

    public void setPostadoToday(int postadoToday) {
        this.postadoToday = postadoToday;
    }




}
