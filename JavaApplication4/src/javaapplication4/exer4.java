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
public class exer4 {
    public static void main(String[] args) {
        /* Implemente em Java, um código que gere uma tabuada
        de qualquer número inteiro entre 1 e 10. O usuário precisará
        informar qual o número da tabuada. Utilize o comando for. */
        
        Scanner ler = new Scanner(System.in);
        System.out.println("Qual o número da tabuáda?");
        int numero = ler.nextInt();
        
        System.out.println("Tabuada do " + numero);
        
        for (int i=1; i<=10 ;i++){
            System.out.println(numero + " x " + i + " = " + (numero*i));
        }
    }
}
