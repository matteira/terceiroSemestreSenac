package classe_abstrata;

 class Professor  extends Pessoa {
     private int matriProfessor;
     private String datAdmissao;
     private double salHorista;

     public Professor() {
     }

     public Professor(int matriProfessor, String datAdmissao, double salHorista) {
         this.matriProfessor = matriProfessor;
         this.datAdmissao = datAdmissao;
         this.salHorista = salHorista;
     }

     public int getMatriProfessor() {
         return matriProfessor;
     }

     public void setMatriProfessor(int matriProfessor) {
         this.matriProfessor = matriProfessor;
     }

     public String getDatAdmissao() {
         return datAdmissao;
     }

     public void setDatAdmissao(String datAdmissao) {
         this.datAdmissao = datAdmissao;
     }

     public double getSalHorista() {
         return salHorista;
     }

     public void setSalHorista(double salHorista) {
         this.salHorista = salHorista;
     }

     @Override
     public String retornaDados() {

         String dados = "";

         dados += "\t      Nome: " + getNome() + "\n";
         dados += "\t      Genero: " + getSexo() + "\n";
         dados += "\t      Rg: " + getRg() + "\n";
         dados += "\t      CPF: " + getCpf() + "\n";
         dados += "\t      MATRICULA:  " + getMatriProfessor() + "\n";
         dados += "\t      Data de admissao: " + getMatriProfessor() + "\n";
         dados += "\t      Salario por hora: " + getSalHorista() + "\n";

         return dados;
     }
 }
