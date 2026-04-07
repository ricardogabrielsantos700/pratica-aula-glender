/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicio2;

/**
 *
 * @author User
 */
import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Digite o dia da data mais antiga:");
        int dia1 = entrada.nextInt();
        System.out.println("Digite o mês da data mais antiga:");
        int mes1 = entrada.nextInt();
        System.out.println("Digite o ano da data mais antiga:");
        int ano1 = entrada.nextInt();
        
        System.out.println("Digite o dia da data mais recente:");
        int dia2 = entrada.nextInt();
        System.out.println("Digite o mês da data mais recente:");
        int mes2 = entrada.nextInt();
        System.out.println("Digite o ano da data mais recente:");
        int ano2 = entrada.nextInt();
        
        int diasDecorridos = 0;
        
       
        while (dia1 != dia2 || mes1 != mes2 || ano1 != ano2) {
            diasDecorridos++;
            dia1++; 
            
            
            int diasNoMes = 31;
            if (mes1 == 4 || mes1 == 6 || mes1 == 9 || mes1 == 11) {
                diasNoMes = 30;
            } else if (mes1 == 2) {
                
                boolean bissexto = (ano1 % 4 == 0 && ano1 % 100 != 0) || (ano1 % 400 == 0);
                if (bissexto) {
                    diasNoMes = 29;
                } else {
                    diasNoMes = 28;
                }
            }
            
            
            if (dia1 > diasNoMes) {
                dia1 = 1;
                mes1++;
                
                
                if (mes1 > 12) {
                    mes1 = 1;
                    ano1++;
                }
            }
        }}}