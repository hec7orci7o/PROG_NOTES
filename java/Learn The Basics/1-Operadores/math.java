import java.lang.Math;  // https://docs.oracle.com/javase/8/docs/api/java/lang/Math.html

public class math {
    public static void main(String[] args) {
        double raiz = Math.sqrt(9); // int raiz = (int)Math.sqrt(9)
        System.out.println(raiz);

        double base = 5, exp = 2;
        double resultado =  Math.pow(base, exp);
        System.out.println(resultado);

        double numero = 4.56;               // si es float usar int para redondear
        long resul = Math.round(numero);
        System.out.println(resul);

        double numero1 = Math.random();
        System.out.println(numero1);
    }
}
