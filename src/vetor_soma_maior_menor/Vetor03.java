package vetor_soma_maior_menor;

import java.util.Scanner;

public class Vetor03 {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        int n = 5 ;
        int vet[] = new int[n];
        int i;

        for (i = 0; i < vet.length; i++) {
            System.out.printf("Informe %2do valor de %d", (i + 1), n);
            vet[i] = leitor.nextInt();
        }

        int soma = 0, menor = vet[0], maior = vet[0];

        for (i = 0; i < vet.length; i++) {
            soma += vet[i];

            if(vet[i] < menor){
                menor = vet[i];
            } else if (vet[i] > maior) {
                maior = vet[i];
            }
        }

        System.out.println("\n\t\t - Saidas - \n");

        for (i = 0; i < vet.length; i++){
            if (vet[i] == menor) {
                System.out.printf("vet[%d] = %d <--- menor valor\n", i, vet[i]);
            } else if (vet[i] == maior) {
                System.out.printf("vet[%d] = %d <--- maior valor\n", i, vet[i]);
            } else {
                System.out.printf("vet[%d] = %d\n", i, vet[i]);
            }
        }

        System.out.printf("%d é a soma dos valores.\n", soma);
        leitor.close();
    }
}
