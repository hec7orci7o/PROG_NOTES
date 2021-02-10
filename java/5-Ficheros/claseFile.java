import java.io.File;    // https://docs.oracle.com/javase/7/docs/api/java/io/File.html

public class claseFile {
    public static void main(String[] args) {
        // Ruta absoluta: U:\\User\\PROG_NOTES\\java\\Learn The Basics\\5-Ficheros\\pruebas\\pruebas.txt
        // Rura relativa: pruebas.txt
        File archivo = new File("U:\\User\\PROG_NOTES\\java\\Learn The Basics\\5-Ficheros\\pruebas\\prueba.txt");

        if (archivo.exists()) {
            System.out.println("El archivo existe");
            System.out.println("Ruta absoluta: " + archivo.getAbsolutePath());
        } else {
            System.out.println("El archivo no existe");
        }

        File directorio = new File("U:\\User\\PROG_NOTES\\java\\Learn The Basics\\5-Ficheros\\prueba");

        if (directorio.exists()) {
            System.out.println("El directorio existe");
            System.out.println("Ruta absoluta: " + directorio.getAbsolutePath());
        } else {
            System.out.println("El directorio no existe");
        }
    }
}
