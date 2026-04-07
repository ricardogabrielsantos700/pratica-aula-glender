/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicio4;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Exercicio4 {
    public static void main(String[] args) {
        try (Scanner entrada = new Scanner(System.in)) {
            int maiorIdade = 0;
            int menorIdade = 0;
            int quantidadeMulheresEspecificas = 0;
            boolean primeiroHabitante = true;
            
            while (true) {
                System.out.println("Digite a idade (ou -1 para encerrar):");
                int idade = entrada.nextInt();
                
                if (idade == -1) {
                    break;
                }

                System.out.println("Digite o sexo (1 - Masculino, 2 - Feminino):");
                int sexo = entrada.nextInt();
                
                System.out.println("Digite a cor dos olhos (1 - Azuis, 2 - Verdes, 3 - Castanhos):");
                int olhos = entrada.nextInt();
                
                System.out.println("Digite a cor dos cabelos (1 - Louros, 2 - Castanhos, 3 - Pretos):");
                int cabelos = entrada.nextInt();
                
                
                if (primeiroHabitante) {
                    maiorIdade = idade;
                    menorIdade = idade;
                    primeiroHabitante = false;
                } else {
                    if (idade > maiorIdade) {
                        maiorIdade = idade;
                    }
                    if (idade < menorIdade) {
                        menorIdade = idade;
                    }
                }
                
                
                if (sexo == 2 && (idade >= 18 && idade <= 35) && olhos == 2 && cabelos == 1) {
                    quantidadeMulheresEspecificas++;
                }
            }
            
            
            if (primeiroHabitante) {
                System.out.println("Nenhum dado foi inserido.");
            } else {
                System.out.println("A maior idade entre os habitantes é: " + maiorIdade);
                System.out.println("A menor idade entre os habitantes é: " + menorIdade);
                System.out.println("Mulheres com idade entre 18-35, de olhos verdes e cabelos louros: " + quantidadeMulheresEspecificas);
            }
        }
    }
}


