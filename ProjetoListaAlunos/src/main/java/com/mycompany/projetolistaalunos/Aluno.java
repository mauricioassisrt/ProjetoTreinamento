/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projetolistaalunos;

/**
 *
 * @author User
 */
public class Aluno {

    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String toString() {
        return this.nome;
    }

    public boolean equals(Object o) {
        Aluno outro = (Aluno) o;
        return this.nome.equals(outro.nome);
    }

}
