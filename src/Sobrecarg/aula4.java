package Sobrecarg;

public class aula4 {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("Gabriel Mattos Costa", "505468372", "52222842804", "Branco", 85,
                123466, 7.50F, "Bacharelado em Sistema de informação","04/02/2022");
        Professor professor1 = new Professor("Joarez da Penha", "564722891", "23476598901",
                "Pardo", 95, 888902, "01/03/2022",80.90);

        //Exibir Aluno e Professor.

        System.out.println("\t==================================");
        System.out.println("\t\t == Dados do Aluno == \n");
        System.out.println(aluno1.retornaDados());
        System.out.println("\t==================================");
        System.out.println("\t\t == Dados do Professor == \n");
        System.out.println(professor1.retornaDados());

    }
}
