public class matriz {
    public static void main(String[] args) {
        final int MAX = 3;

        //int matriz[][] = {{1,2,3},{4,5,6},{7,8,9}};
        int matriz[][] = new int[MAX][MAX];

        // Rellena la matriz
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                matriz[i][j] = i + j;
            }
        }

        // Imprime los elementos
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print("[" + matriz[i][j] + "]");
            }
            System.out.println("");
        }
    }
}
