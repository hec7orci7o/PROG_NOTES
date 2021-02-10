import java.io.Serializable;

// Al implementar serializable permite que estos objetos (PersonaEJ)
// puedan ser transformados a flujo de bits
public class PersonaEJ implements Serializable{
    private String nombre;
    private int edad;

    public PersonaEJ(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public void mostrarDatos() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: "   + edad);
        System.out.println("");
    }
}
