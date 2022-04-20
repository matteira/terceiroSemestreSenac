package Sobescrita;

public class aula4 {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno();
        Professor professor1 = new Professor();

        //Atribuindo valores nas funções.

        aluno1.nome = "Gabriel Mattos Costa";
        aluno1.rg = "505468372";
        aluno1.cpf = "52222842804";
        aluno1.sexo = "Masculino";
        aluno1.cor = "Branco";
        aluno1.peso = 85;
        aluno1.registroAluno = 123466;
        aluno1.notaVestibular = 7.50F;
        aluno1.curso = "Bacharelado em Sistema de informação";
        aluno1.dataMatricula = "04/02/2022";

        professor1.nome = "Joarez da Penha";
        professor1.rg = "564722891";
        professor1.cpf = "23476598901";
        professor1.sexo = "Masculino";
        professor1.cor = "Pardo";
        professor1.peso = 95;
        professor1.matriculaProfessor = 888902;
        professor1.dataAdmissao = "01/03/2022";
        professor1.salarioHorista = 80.90;

        //Exibir Aluno e Professor.

        System.out.println("\t==================================");
        System.out.println("\t\t == Dados do Aluno == \n");
        System.out.println(aluno1.retornaDados());
        System.out.println("\t==================================");
        System.out.println("\t\t == Dados do Professor == \n");
        System.out.println(professor1.retornaDados());

    }
}
