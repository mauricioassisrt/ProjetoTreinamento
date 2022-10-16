/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.projetotreino;

import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class ProjetoTreino {

    public static void main(String[] args) {
        // Declarando as variaveis
        double a, b, c, x;
        //atribuindo valores a elas 
        a = 3;
        b = 2;
        c = 1;
        // multiplicando b x c 
        a = b * c;
        // 4
        b = b * b;
        // 4
        c = b * a;
        if (b > a && b > c) {
            b = c * 3 - (a + 5);
            c = b - a * c * 2;
        } else {
            c = c + 2 * b + 2;
            b = c * 2 - a * 2;
        }
        x = a + b + c;
        System.out.println("SOMA DE A B E C " + x);
    }
}
