import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;

// https://docs.oracle.com/javase/7/docs/api/

// Excepciones verificadas(IOException) y no verificadas(RunTimeException)

public class excepciones0 {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        /* Excepciones Verificadas (IOException)
            // Lectura de un archivo de texto (.txt) 
            BufferedReader bf = new BufferedReader(new FileReader("U:\\User\\PROG_NOTES\\java\\Learn The Basics\\7-Errores\\test.txt"));
            String linea;
            while((linea == bf.readLine()) != null) {
            System.out.println(linea);
            }
        */

        /* Excepciones NO Verificadas (RunTimeException)
            // Division entre cero
            int num1 = 5, num2 = 0;
            int resultado = num1 / num2;

            System.out.println(resultado);
        */
    }
}
