package Sobrecarg;

//Classe filha Aluno e Professor.

public class Aluno extends Pessoa {
    int registroAluno;
    float notaVestibular;
    String curso, dataMatricula;

    public Aluno() {

        super();
    }

    public Aluno(String nome, String rg, String cpf, String cor, int peso, int registroAluno, float notaVestibular, String curso, String dataMatricula) {

        super();

        this.nome = nome;
        this.rg = rg;
        this.cpf = cpf;
        this.peso = peso;
        this.cor = cor;
        this.registroAluno = registroAluno;
        this.notaVestibular = notaVestibular;
        this.curso = curso;
        this.dataMatricula = dataMatricula;
    }

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
