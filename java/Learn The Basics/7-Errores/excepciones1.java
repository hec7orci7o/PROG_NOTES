// Declaracion de las excepciones de un metodo

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class excepciones1 {
    // usamos el throw para indicar que podria darse un error y que se capturara en el metodo en el que se llame a este.
    public void leerArchivo() throws FileNotFoundException {
        File archivo  = new File("U:\\User\\PROG_NOTES\\java\\Learn The Basics\\7-Errores\\test.txt");
        FileReader fr = new FileReader(archivo);
    }

    public void leerArchivo() throws IOException {
        leerArchivo();
    }

    public static void main(String[] args) {
        
    }
}
