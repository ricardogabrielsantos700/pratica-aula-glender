/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicio3;

/**
 *
 * @author User
 */
import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        try (Scanner entrada = new Scanner(System.in)) {
            System.out.println("Informe o valor de n:");
            int n = entrada.nextInt();
            
            long soma = 0;
            
            for (int i = 1; i <= n; i++) {
                long potencia = 1;
                
                
                for (int j = 1; j <= i; j++) {
                    potencia = potencia * i;
                }
                
                soma = soma + potencia;
            }
            
            System.out.println("O resultado da expressão é: " + soma);
        }
    }
}

