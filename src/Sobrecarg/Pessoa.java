package Sobrecarg;

// Classe super mãe.

public class Pessoa {
    String nome, rg, cpf, cor;
    int peso;



    public String retornaDados(){
        String dados = "";

        dados += "\tNome: " + nome + "\n";
        dados += "\tRG: " + rg + "\n";
        dados += "\tCPF: " + cpf + "\n";
        dados += "\tCor: " + cor + "\n";
        dados += "\tPeso: " + peso + "\n";

        return dados;
    }
}
