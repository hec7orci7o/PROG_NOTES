import java.util.Scanner;

public class operadores {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float num1, num2, suma, resta, mult, div, resto;

        System.out.print("Digite 2 numeros: ");
        num1 = entrada.nextFloat();
        num2 = entrada.nextFloat();

        entrada.close();

        suma  = num1 + num2;    // +    +=      suma  += 1   <=>   suma  = suma  + 1
        resta = num1 - num2;    // -    -=      resta -= 1   <=>   resta = resta - 1
        mult  = num1 * num2;    // *    *=      mult  *= 1   <=>   mult  = mult  * 1
        div   = num1 / num2;    // /    /=      div   /= 1   <=>   div   = div   / 1
        resto = num1 % num2;    // %    %=      resto %= 1   <=>   resto = resto % 1

        System.out.println("La suma es: " + suma);
        System.out.println("La resta es: " + resta);
        System.out.println("La mult es: " + mult);
        System.out.println("La div es: " + div);
        System.out.println("El resto es: " + resto);

        /* __OPERADORES_INCREMENTO_DECREMENTO__
         * int x = 10;
         * int y;
         * 
         * Es lo mismo con el operador decremento: "--"
         * y = x++; // valor de y = 10 y luego x valdra 11
         * y = ++x; // valor de y = 11 y luego x valdra 11
         */
    }
}
