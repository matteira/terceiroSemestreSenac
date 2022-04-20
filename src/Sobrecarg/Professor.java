package Sobrecarg;

public class Professor extends Pessoa{

    int matriculaProfessor;
    String dataAdmissao;
    double salarioHorista;

    public Professor() {
        super();
    }

    public Professor(String nome, String rg, String cpf, String cor, int peso, int matriculaProfessor, String dataAdmissao, double salarioHorista) {

        super();

        this.nome = nome;
        this.rg = rg;
        this.cpf = cpf;
        this.peso = peso;
        this.cor = cor;
        this.matriculaProfessor = matriculaProfessor;
        this.dataAdmissao = dataAdmissao;
        this.salarioHorista = salarioHorista;
    }

    @Override

    public String retornaDados(){

        String dados;

        dados = super.retornaDados();

        dados += "\tMatricula do Professor: " + matriculaProfessor + "\n";
        dados += "\tData Matricula: " + dataAdmissao + "\n";
        dados += "\tSalario por Hora: " + salarioHorista + "\n";

        return dados;

    }
}
