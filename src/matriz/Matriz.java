package matriz;

public class Matriz {
    public static void main(String[] args) {

        int[][] mat = {{1, 2, 3, 4}, {5, 6}};


        for (int i = 0; i < mat.length; i++) {

            System.out.printf("%d linha: ", (i + 1));
            for (int j = 0; j < mat.length; j++) {

                System.out.printf("%d valor da coluna: ", mat[i][j]);
            }

            System.out.println("\n");
        }
    }
}
