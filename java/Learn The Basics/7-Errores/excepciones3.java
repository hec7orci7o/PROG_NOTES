import javax.swing.JOptionPane;

public class excepciones3 {
    public void operaciones() {
        int num1 = 5;
        int num2 = 0;
        int resultado = num1 / num2;
        System.out.print(resultado);
    }

    public void operaciones2() {
        // try catch para excepciones no verificadas

        try {
            operaciones();
            System.out.println("Programa terminado");
        } catch (ArithmeticException ex) {
            JOptionPane.showMessageDialog(null, "Error matematico");
        }
    }

    public static void main(String[] args) {
        
    }
}
