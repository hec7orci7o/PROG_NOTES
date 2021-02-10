package condicionales;

import javax.swing.JOptionPane;

public class sentenciaTERNARIO {
    public static void main(String[] args) {
        int numero;
        String mensaje;

        numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduzca un numero: "));
        mensaje = (numero % 2 == 0) ? "Es par" : "Es impar";
        JOptionPane.showMessageDialog(null, mensaje);
    }
}
