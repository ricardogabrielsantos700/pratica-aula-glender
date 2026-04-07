
import java.util.LinkedHashSet;
import java.util.Scanner;


public class UniaoVetores {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite a quantidade de elementos (n): ");
        int n = leitor.nextInt();

        int[] vetorX = new int[n];
        int[] vetorY = new int[n];

       
        Set<Integer> conjuntoZ = new LinkedHashSet<>();

        
        System.out.println("Preencha o Vetor X:");
        for (int i = 0; i < n; i++) {
            System.out.printf("X[%d]: ", i);
            vetorX[i] = leitor.nextInt();
            conjuntoZ.add(vetorX[i]); 
        }

       
        System.out.println("\nPreencha o Vetor Y:");
        for (int i = 0; i < n; i++) {
            System.out.printf("Y[%d]: ", i);
            vetorY[i] = leitor.nextInt();
            conjuntoZ.add(vetorY[i]); 
        }

      
        System.out.println("\nVetor União Z (sem repetições):");
        System.out.println(conjuntoZ);

        leitor.close();
    }
}