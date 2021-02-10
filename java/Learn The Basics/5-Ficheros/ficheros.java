import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ficheros {
    File archivo;

    private void crearArchivo() {
        archivo = new File("U:\\User\\PROG_NOTES\\java\\Learn The Basics\\5-Ficheros\\pruebas\\test.txt");

        try {
            if (archivo.createNewFile()){
                System.out.println("Se ha creao el archivo");
            }
        } catch (IOException ex) {
            System.err.println("No se pudo crear el archivo");
        }

    }

    private void crearDirectorio() {
        archivo = new File("U:\\User\\PROG_NOTES\\java\\Learn The Basics\\5-Ficheros\\pruebas");

        if (archivo.mkdir()){
            System.out.println("Se ha creao el directorio");
        } else {
            System.err.println("No se pudo crear el archivo");
        }

    }

    private void escribirFichero() {
        try {
            FileWriter escribir = new FileWriter(archivo);
            escribir.write("Hola que tal?");
            escribir.write("\r\nMuy bien");
            escribir.close();
        } catch (IOException ex) {
            System.err.println("Error, "+ ex);
        }
    }

    private void añadirTexto() {
        try {
            FileWriter escribir = new FileWriter(archivo,true);
            escribir.write(", y tu?");
            escribir.write("\r\nMuy bien tambien");
            escribir.close();
        } catch (IOException ex) {
            System.err.println("Error, "+ ex);
        }
    }

    private void leerFichero() {
        String cadena;

        try {
            FileReader lector = new FileReader(archivo);
            BufferedReader lectura = new BufferedReader(lector);
            
            cadena = lectura.readLine();
            while (cadena != null) {
                System.out.println(cadena);     // Si se escribe despues se imprime el null
                cadena = lectura.readLine();
            }
            lectura.close();
        } catch (FileNotFoundException ex) {
            System.err.println("Error, "+ ex);
        } catch (IOException ex) {
            System.err.println("Error, "+ ex);
        }
    }

    public static void main(String[] args) {
        ficheros archivos = new ficheros();
        archivos.crearDirectorio();
        archivos.crearArchivo();
        archivos.escribirFichero();
        archivos.añadirTexto();
        archivos.leerFichero();
    }
}
