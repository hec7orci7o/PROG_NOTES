import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.JOptionPane;

public class excepciones2 {
    public void leerArchivo() throws FileNotFoundException, IOException {
        File archivo  = new File("U:\\User\\PROG_NOTES\\java\\Learn The Basics\\7-Errores\\test.txt");
        FileReader fr = new FileReader(archivo);
        BufferedReader bf = new BufferedReader(fr);
        String linea;

        while((linea = bf.readLine()) != null) {
            System.out.println(linea);
            }
    }

    public void leerArchivo2() {
        // try catch para excepciones veriicadas

        try {
            leerArchivo();
        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "No se ha encontrado el archivo, verifica la ruta.");
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Ha ocurrido una excepcion verificada");
        } finally {
            System.out.println("El finally se ejecuta siempre");
        }
        
    }

    public static void main(String[] args) {
        excepciones2 test = new excepciones2();

        test.leerArchivo2();
    }
}
