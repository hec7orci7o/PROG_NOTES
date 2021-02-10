package bucles;

import java.util.Scanner;

public class sentenciaDOWHILE {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int i = 1, contador;

        System.out.print("Digite cuantos numeros quiere en pantalla: ");
        contador = entrada.nextInt();

        entrada.close();

        do {
            System.out.println(i);
            i++;
        } while (i <= contador);
        // Se diferencia del while en que como minimo se ejecuta una vez
    }
}
