package bucles;

import java.util.Scanner;

public class senteniaWHILE {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int i = 1, contador;

        System.out.print("Digite cuantos numeros quiere en pantalla: ");
        contador = entrada.nextInt();

        entrada.close();

        while (i <= contador) {
            System.out.println(i);
            i++;
        }
    }
}
