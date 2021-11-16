/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication4;

/**
 *
 * @author jacks
 */
public class exer3 {
    public static void main(String[] args) {
        /* Implemente em Java, um código que imprima os números ímpares
        entre 1 e 50. Utilize o comando for. */
        
        for (int i = 1; i<50; i++){
            if (i%2 != 0){
            System.out.println(i);
            }
        }
        
        for (int i = 1; i<50; i+=2){
            System.out.println(i);
        }
    }
}
