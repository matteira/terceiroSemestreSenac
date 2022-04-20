package Sobescrita;

//Classe filha Aluno e Professor.

public class Aluno extends Pessoa {
    int registroAluno;
    float notaVestibular;
    String curso, dataMatricula;


    @Override

    public String retornaDados(){
        String dados;

        dados = super.retornaDados();

        dados += "\tRA: " + registroAluno + "\n";
        dados += "\tNota Vestibular: " + notaVestibular + "\n";
        dados += "\tCurso: " + curso + "\n";
        dados += "\tData Matricula: " + dataMatricula + "\n";

        return dados;

    }
}
