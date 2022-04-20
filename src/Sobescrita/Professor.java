package Sobescrita;

public class Professor extends Pessoa{

    int matriculaProfessor;
    String dataAdmissao;
    double salarioHorista;


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
