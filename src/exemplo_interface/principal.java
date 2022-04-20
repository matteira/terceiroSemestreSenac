package exemplo_interface;

import java.util.Scanner;

public class principal {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        FuncionarioDiarista fDiarista = new FuncionarioDiarista();

        System.out.print("Informe o nome do funcionario: ");
        fDiarista.setNome(leitor.next());

        System.out.print("Valor da hora: ");
        fDiarista.setValorHora(leitor.nextDouble());

        System.out.print("Dias trabalhados: ");
        fDiarista.setDiasTrabalhados(leitor.nextInt());

        System.out.println(" ");
        System.out.println("Nome do funcionario: " + fDiarista.getNome());
        System.out.print("Salario do funcionario: ");
        System.out.printf("%.2f%n", fDiarista.calSalarioLiquid());
        System.out.println("============================");




        FuncionarioMensalista fMensalista = new FuncionarioMensalista();


        System.out.print("Informe o nome do funcionario mensalista: ");
        fMensalista.setNome(leitor.next());

        System.out.print("Informe salario bruto: ");
        fMensalista.setSalario(leitor.nextDouble());

        System.out.println(" ");
        System.out.println("Nome funcionario: " + fMensalista.getNome());
        System.out.print("Salario do funcionario: ");
        System.out.printf("%.2f%n", fMensalista.calSalarioLiquid());

        leitor.close();
    }
}
