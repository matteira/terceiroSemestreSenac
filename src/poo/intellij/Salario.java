package poo.intellij;

import java.util.Scanner;

public class Salario {
    public static void main(String[] args) {
        try (Scanner leitor = new Scanner(System.in)) {
            int x, y;

            System.out.println("Informe seu salario: ");
            x = leitor.nextInt();

            System.out.println("Informe seu desconto: ");
            y = leitor.nextInt();

            CalculoSalario sal1 = new CalculoSalario(x, y);

            System.out.println("Seu salario é : " + sal1.SeuSalario());
        }
    }
}
