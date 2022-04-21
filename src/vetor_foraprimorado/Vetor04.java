package vetor_foraprimorado;

import java.util.Scanner;

public class Vetor04 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o valor do vetor: ");
        int n = leitor.nextInt();
        System.out.println(" ");

        String nomes[] = new String[n];

        for (String nome: nomes) {
            nome = leitor.nextLine();
            System.out.printf("O nome é: %s\n", nome);
        }

        leitor.close();
    }
}
