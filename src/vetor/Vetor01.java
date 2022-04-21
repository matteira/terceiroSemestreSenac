package vetor;

public class Vetor01 {
    public static void main(String[] args) {
        int n = 10;

        int vet[] = new int[n];

        for (int i = 0; i < vet.length; i++) {
            vet[i] = i;
            System.out.println(vet[i] * 2);
        }
    }
}
