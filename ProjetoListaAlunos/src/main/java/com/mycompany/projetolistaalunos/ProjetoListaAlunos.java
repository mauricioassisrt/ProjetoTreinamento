/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.projetolistaalunos;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class ProjetoListaAlunos {

    public static void main(String[] args) {

        int contador;
        List<Aluno> listaAluno = new ArrayList<>();
        Aluno a1 = new Aluno();
        Vetor lista = new Vetor();

        try {

            do {
                contador = Integer.parseInt(JOptionPane.showInputDialog("[1] Adicionar um aluno\n"
                        + "[2] Ver os alunos \n"
                        + "[5] Sair"));
                /**
                 * Adicionar Aluno
                 */
                if (contador == 1) {
                    a1 = new Aluno();
                    a1.setNome(JOptionPane.showInputDialog("Digite um nome \n"));
                    listaAluno = lista.adiciona(a1);
                    /**
                     * Listar alunos
                     */
                } else if (contador == 2) {
                    JOptionPane.showMessageDialog(null, listaAluno.toArray());
                } else if (contador == 5) {
                    JOptionPane.showMessageDialog(null, "Saindo");
                }
            } while (contador != 5);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro" + e.getMessage());
        }

    }
}
