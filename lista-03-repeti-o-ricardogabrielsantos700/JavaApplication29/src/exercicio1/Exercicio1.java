/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicio1;

/**
 *
 * @author User
 */
public class Exercicio1 {
    public static void main(String[] args) {
        int contador = 233;
        
        System.out.println("Iniciando contagem:");
        
      
        while (contador <= 456) {
            System.out.println(contador);
            
            
            if (contador >= 300 && contador <= 400) {
                contador = contador + 3; 
            } else {
                contador = contador + 5; 
            }
        }
    }
}

