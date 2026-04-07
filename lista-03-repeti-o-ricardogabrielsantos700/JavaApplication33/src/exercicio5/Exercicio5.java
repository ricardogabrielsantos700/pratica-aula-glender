/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicio5;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Exercicio5 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int maiorIndiceAcidentes = 0;
        int menorIndiceAcidentes = 0;
        
        
        for (int i = 1; i <= 5; i++) {
            System.out.println("--- Dados da Cidade " + i + " ---");
            System.out.println("Digite o código da cidade:");
            
            System.out.println("Digite o número de veículos de passeio:");
            
            System.out.println("Digite o número de acidentes de trânsito com vítimas:");
            int acidentes = entrada.nextInt();
            
            
            if (i == 1) {
                maiorIndiceAcidentes = acidentes;
                menorIndiceAcidentes = acidentes;
            } else {
                if (acidentes > maiorIndiceAcidentes) {
                    maiorIndiceAcidentes = acidentes;
                }
                if (acidentes < menorIndiceAcidentes) {
                    menorIndiceAcidentes = acidentes;
                }
            }
        }}}
