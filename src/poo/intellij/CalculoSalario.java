package poo.intellij;;

public class CalculoSalario {
    int salario;
    int desconto;
    int Sliquido;

    public CalculoSalario(int x, int y) {
        this.salario = x;
        this.desconto = y;
    }

    public int SeuSalario() {
        Sliquido = salario - desconto;
        return Sliquido;
    }
}
