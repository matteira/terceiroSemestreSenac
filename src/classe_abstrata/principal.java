package classe_abstrata;

public class principal {
    public static void main(String[] args) {

        Aluno a1 = new Aluno("12/02/2021", "Design de Animacao", 3500, 7);
        Professor p1 = new Professor(3908, "05/01/2022", 65.50);

        a1.setNome("DOVAKIN");
        a1.setSexo('M');
        a1.setRg(505468372);
        a1.setCpf(622339329);

        p1.setNome("ADUKHAIN");
        p1.setSexo('?');
        p1.setRg(567483921);
        p1.setCpf(524342172);

        System.out.println("\t    - Dados do Aluno: " + a1.getNome() + " -\n");
        System.out.println(a1.retornaDados());
        System.out.println("");
        System.out.println("=================================================");
        System.out.println("");
        System.out.println("\t    - Dados do Professor: " + p1.getNome() + " -\n");
        System.out.println(p1.retornaDados());

    }
}
