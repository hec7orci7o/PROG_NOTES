import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ficherosBinarios {

    private void escribirBinario() {
        String file = "U:\\User\\PROG_NOTES\\java\\Learn The Basics\\5-Ficheros\\pruebas\\binarios.bin";
        
        try {
            FileOutputStream archivo     = new FileOutputStream(file);
            ObjectOutputStream escritura = new ObjectOutputStream(archivo);

            PersonaEJ persona1 = new PersonaEJ("Hector", 19);
            PersonaEJ persona2 = new PersonaEJ("Maria", 18);

            // escritura de objetos sobre el archivo binario
            escritura.writeObject(persona1);
            escritura.writeObject(persona2);

            // cerramos el flujo
            escritura.close();

        } catch (FileNotFoundException ex) {
            System.err.println("ERROR: " + ex);
        } catch (IOException ex) {
            System.err.println("ERROR: " + ex);
        }
    }

    private void leerBinario() {
        String file = "U:\\User\\PROG_NOTES\\java\\Learn The Basics\\5-Ficheros\\pruebas\\binarios.bin";
        PersonaEJ ObjetoPersonaEJ;
        try {
            FileInputStream archivo   = new FileInputStream(file);
            ObjectInputStream lectura = new ObjectInputStream(archivo);

            while (true) {
                ObjetoPersonaEJ = (PersonaEJ)lectura.readObject();
                ObjetoPersonaEJ.mostrarDatos();
            }

        } catch (EOFException ex){
            return; // Termina la lectura del fichero binario
        } catch (FileNotFoundException ex) {
            System.err.println("ERROR: " + ex);
        } catch (IOException ex) {
            System.err.println("ERROR: " + ex);
        } catch (ClassNotFoundException ex) {
            System.err.println("ERROR: " + ex);
        }
    }

    private void añadirBinario() {
        String file = "U:\\User\\PROG_NOTES\\java\\Learn The Basics\\5-Ficheros\\pruebas\\binarios.bin";
        
        try {
            FileOutputStream archivo  = new FileOutputStream(file, true);
            añadirContenido escritura = new añadirContenido(archivo);

            PersonaEJ persona1 = new PersonaEJ("Javi", 20);
            PersonaEJ persona2 = new PersonaEJ("Laura", 22);
            PersonaEJ persona3 = new PersonaEJ("Paola", 24);

            // escritura de objetos sobre el archivo binario
            escritura.writeObject(persona1);
            escritura.writeObject(persona2);
            escritura.writeObject(persona3);

            // cerramos el flujo
            escritura.close();

        } catch (FileNotFoundException ex) {
            System.err.println("ERROR: " + ex);
        } catch (IOException ex) {
            System.err.println("ERROR: " + ex);
        }
    }
    public static void main(String[] args) {
        ficherosBinarios archivos = new ficherosBinarios();

        // primero ejecutar los dos a la vez para que se sincronicen  sino puede que no lo lea bien
        archivos.escribirBinario();
        archivos.añadirBinario();
        archivos.leerBinario();
    }
}
