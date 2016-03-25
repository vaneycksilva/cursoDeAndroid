package com.example.rapha.aula10.util;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.field.ForeignCollectionField;
import com.j256.ormlite.table.DatabaseTable;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Created by Van Eyck on 24/03/2016.
 */

@DatabaseTable(tableName = "disciplina")
public class Disciplina {

    @DatabaseField(generatedId = true)
    private int id;

    @DatabaseField
    private String nome;

    @DatabaseField
    private int qtdCreditos;

    @ForeignCollectionField
    Collection<Professor> professores = new ArrayList<>();


    public Disciplina(String nome, int qtdCreditos){

        this.nome=nome;
        this.qtdCreditos=qtdCreditos;
    }


    public Disciplina(){

    }


    public void addProfessor(Professor professor){
        this.professores.add(professor);
    }

    public void removerProfessor(Professor professor){
        this.professores.remove(professor);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQtdCreditos() {
        return qtdCreditos;
    }

    public void setQtdCreditos(int qtdCreditos) {
        this.qtdCreditos = qtdCreditos;
    }

    @Override
    public String toString() {
        return "id: "+this.id+"\nnome: "+this.nome+"\nQuantidade de Créditos: "+this.qtdCreditos;
    }
}
