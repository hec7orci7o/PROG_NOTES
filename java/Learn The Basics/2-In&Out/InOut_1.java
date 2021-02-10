import java.util.Scanner;

public class InOut_1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);   // Declaracion del scanner para detectar un dato por consola
        int numero;                                 // Variable donde se agregara el numero introducido
        
        System.out.print("Digite un numero: ");     // Imprime por pantalla
        numero = entrada.nextInt();                 // Usa el scanner para asociar el dato introducido a la variable "numero"
                                                    // next<EXTENSION>()    hay varios metodos para introducir cada tipo de dato

                                                    // letra = entrada.next().charAt(0); guarda en letra la primera letra de una sentencia hasta el primer espacio:
                                                    // Ej: Hola que tal.    ->    Hola    ->    H
        System.out.println("El numero introducido es: " + numero);  // Imprime por pantalla + salto de linea
        entrada.close();
    }
}