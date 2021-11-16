/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication4;

import java.util.Scanner;

/**
 *
 * @author jacks
 */
public class exer2 {
    public static void main(String[] args) {
        /* Implemente em Java, um código que leia seis números e
        informe o maior entre eles. Utilize o comando for. */
        
        Scanner ler = new Scanner(System.in);
        int numero;
        int maiornum = Integer.MIN_VALUE; // equivale ao menor valor possível, pode inicializar essa variável com 0 ou com um número negativo.
        
        for (int i=0; i<6; i++) {
            System.out.println("Informe um número");
            numero = ler.nextInt();
            
            if (numero>maiornum) {
                maiornum = numero;
            }
        }
        System.out.println("o maior número digitado foi: " + maiornum);
    }
}
