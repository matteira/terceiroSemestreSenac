package classe_abstrata;

class Aluno extends Pessoa {
    private int ra, vest;
    private String dataM, curso;

    public Aluno() {
    }

    public Aluno (String dataM, String curso, int ra, int vest) {
        this.ra = ra;
        this.dataM = dataM;
        this.curso = curso;
        this.vest = vest;
    }



    public int getRa() {
        return ra;
    }

    public int getVest() {
        return vest;
    }

    public void setVest(int vest) {
        this.vest = vest;
    }

    public String getDataM() {
        return dataM;
    }

    public void setDataM(String dataM) {
        this.dataM = dataM;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    @Override
    public String retornaDados() {

        String dados = "";

        dados += "\t      Nome: " + getNome() + "\n";
        dados += "\t      Genero: " + getSexo() + "\n";
        dados += "\t      Rg: " + getRg() + "\n";
        dados += "\t      CPF: " + getCpf() + "\n";
        dados += "\t      RA:  " + getRa() + "\n";

        return dados;
    }
}
