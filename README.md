# pratica-aula-glender

-faça um programa que calcule o fatorial de um numero informado pelo usuário 

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package atividade.em.sala.pkg01;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class AtividadeEmSala01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite um número inteiro positivo para calcular o fatorial: ");
        int numero = leitor.nextInt();

       
        if (numero < 0) {
            System.out.println("Não é possível calcular o fatorial de um número negativo.");
        } else {
            long fatorial = 1; 
            
            
            for (int i = 1; i <= numero; i++) {
                fatorial *= i;
            }
            
            System.out.println(numero + "! = " + fatorial);
        }
    }
    
}







2 - faça um programa que diga quais sÃO os multiplos de 2,3 e 5 entre ! e 1000



/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package atividade.em.sala.pkg02;

/**
 *
 * @author User
 */
public class AtividadeEmSala02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       System.out.println("Múltiplos de 2, 3 e 5 entre 1 e 1000:\n");

        for (int i = 1; i <= 1000; i++) {
            
            if (i % 2 == 0 && i % 3 == 0 && i % 5 == 0) {
                System.out.println("Número: " + i + " (Múltiplo comum)");
            } 
            
                System.out.print(i + " ");
            }
    }
    
}




3- tabuada 

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package atividade.em.sala.pkg03;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class AtividadeEmSala03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite um número para ver sua tabuada: ");
        
        if (leitor.hasNextInt()) {
            int n = leitor.nextInt();
            
            System.out.println("\n--- Tabuada do " + n + " ---");
            
            for (int i = 1; i <= 10; i++) {
                int resultado = n * i;
                System.out.printf("%d x %d = %d%n", n, i, resultado);
            }
            
            System.out.println("-----------------------");
        } else {
            System.out.println("Erro: Por favor, insira apenas números inteiros.");
        }

        leitor.close();
    }
}
    
    
}



4 - tabuada 0 a 10 



/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculadora.de.de.pkg0.a.pkg10;

/**
 *
 * @author Pedro
 */
public class tabuadaDeDe0A10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
                int n, x;

        for( x = 0; x <= 10; x++) {
            for( n = 0; n <= 10; n++) {
                     System.out.println(x*n);
        }
                  System.out.println("--------------------------------"); 
   
    }
 
    }
}
