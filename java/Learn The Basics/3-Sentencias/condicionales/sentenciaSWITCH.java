package condicionales;

import javax.swing.JOptionPane;

public class sentenciaSWITCH {
    public static void main(String[] args) {
        int dato;
        dato = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite un numero"));

        switch(dato) {
            case 1: JOptionPane.showMessageDialog(null, "dato = " + dato); break;
            case 2: JOptionPane.showMessageDialog(null, "dato = " + dato); break;
            case 3: JOptionPane.showMessageDialog(null, "dato = " + dato); break;
            case 4: JOptionPane.showMessageDialog(null, "dato = " + dato); break;
            case 5: JOptionPane.showMessageDialog(null, "dato = " + dato); break;
            default: JOptionPane.showMessageDialog(null, "dato no esta en el rango 1-5"); break;
        }
    }
}
