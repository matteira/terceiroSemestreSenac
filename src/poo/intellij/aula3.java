package poo.intellij;

import java.util.Scanner;


public class aula3 {
    public static void main(String[] args) {
        float num;
        Scanner leitor = new Scanner(System.in);

        Metodo dob = new Metodo();

        System.out.println("Informe o valor: ");
        num = leitor.nextFloat();

        dob.setD(num);

        System.out.println("\nO dobro de " + dob.getD() + "é: " + dob.Metodo());
    }
}
