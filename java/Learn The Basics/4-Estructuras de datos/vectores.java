public class vectores {
    public static void main(String[] args) {
        final int MAX = 10;

        int[] numeros = new int[MAX];
        // int[] numeros = {1,2,3,4}    // Vector numeros tiene 4 elementos
        // numeros[0]    = 12           // La posicion 0 del vector tendra el valor 12

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = i;
            System.out.println(numeros[i]);
        }
    }
}
