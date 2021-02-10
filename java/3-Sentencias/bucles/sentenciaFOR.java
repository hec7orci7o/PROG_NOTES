package bucles;

import java.util.Scanner;

public class sentenciaFOR {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int contador;

        System.out.print("Digite cuantos numeros quiere en pantalla: ");
        contador = entrada.nextInt();

        entrada.close();

        for (int i = 1; i <= contador; i++) {
            System.out.println(i);
        }
    }
}
