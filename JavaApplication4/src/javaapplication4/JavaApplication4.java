/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication4;

/**
 *
 * @author jacks
 */
public class JavaApplication4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       /* for ([inicialização]; [condição]; [atualização]){
         [comando];
        } */
        
        for (int i = 0; i < 5; i++) {  // i++ é incremento, pode ser escrito como i=i+1 ou i+=1
            System.out.println("i tem valor: " + i);
        }
        System.out.println(" ");
        
        for (int i = 0, j = 10; i < j; i++, j--) {
            System.out.println("i tem valor: " + i + " enquanto j tem valor: " + j);
        }

    }
    
}
