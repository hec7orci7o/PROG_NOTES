import java.util.Scanner;

// uso de throw para excepciones personalizadas

public class excepciones4 {
    private int numero;
    private Scanner entrada;

    public void introducirNumeros() throws Except_0{
        entrada = new Scanner(System.in);

        do {
            System.out.print("Digite un numero: ");
            numero = entrada.nextInt();

            if (numero == 0) {
                throw new Except_0();
            }
        } while (numero != 0 && numero != 1);

        System.out.println("Fin del programa");
    }

    public static void main(String[] args) {
        excepciones4 test = new excepciones4();

        try {
            test.introducirNumeros();
        } catch (Except_0 ex) {
            System.out.println("Se ha introducido un 0");
        }
        
    }
}
