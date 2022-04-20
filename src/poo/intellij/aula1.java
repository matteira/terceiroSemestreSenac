package poo.intellij;

import java.util.Scanner;

public class aula1 {
    public static void main(String[] args) {
        try (Scanner leitor = new Scanner(System.in)) {
            int x;
            int n;

            System.out.println("Informe o numero: ");
            x = leitor.nextInt();
            n = leitor.nextInt();

            calculadora cal = new calculadora(x);
            Calculadora2 cal2 = new Calculadora2(n);

            System.out.println("O dobro do numero digitado é " + cal.Dobro());
            System.out.println("============================");
            System.out.println("O triplo do numero digitado é " + cal2.Triplo());
        }
    }
}
