package vetor;

import java.util.Scanner;

public class Vetor02 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int n = 10, vet[] = new int[n], vet2[] = new int[n];


        for (int i = 0; i < vet.length; i++) {

            System.out.println("Digite o valor numero 1: ");
            vet[i] = leitor.nextInt();

            System.out.println("Digite o valor numero 2: ");
            vet2[i] = leitor.nextInt();

            int cal = vet[i] * vet2[i];

            System.out.println(" ");
            System.out.println("Valor final: " + cal);
            System.out.println(" ");
        }

        leitor.close();
    }
}
