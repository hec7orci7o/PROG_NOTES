import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

// Usamos esta clase para añadir contenido a ficheros binarios.

// la clase añádirConetido hereda todo  lo que tiene la clase ObjectOutputStream
public class añadirContenido extends ObjectOutputStream {

    // Constructores...
    public añadirContenido(OutputStream out) throws IOException{
        super(out);
    }

    public añadirContenido() throws IOException, SecurityException{
        
    }

    // Ñapa de la cabecera
    @Override
    public void writeStreamHeader() throws IOException {    // metodo que pone la cabecera al añadir cada vez
        reset();    // Hace que al añádir al archivo binario ya no ponga una cabecera nueva
    }
}
