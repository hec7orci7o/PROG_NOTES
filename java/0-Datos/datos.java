/* DATOS: 
 * 		<data_type> <var_name>
 * DATOS CONSTANTES:
 * 		final <data_type> <var_name>
 */

// __DATOS_PRIMITIVOS__
/* __ENTEROS__
 * byte		size(8)		rango(-128 - 127)
 * short	size(16)	rango(-32.768 - 32.767)
 * int		size(32)	rango(-2.147.483.648 - 2.147.483.647)
 * long		size(64)	rango(-9.223.372.036.854.775.808 - 9.223.372.854.775.807)
 */

/* __REALES__
 * float	size(32)	rango(1.4e-045 - 3.4e+038)
 * double	size(64)	rango(4.9e-324 - 1.8e+308)
 */

/* __CARACTERES__
 * char
 */

// __DATOS_NO_PRIMITIVOS__
/* Pueden ser igualados a null para indicar que estan vacios
 * Los datos de tipo no primitivo tienen metodos
 * Integer
 * String
 */

public class datos {
	public static void main(String[] args) {
		// __PRIMITIVOS__
		// __ENTEROS__
		byte  enteroB	= 12;
		short enteroS	= 12;
		int   enteroI	= 12;
		long  enteroL	= 12;

		// __REALES__
		float  decimalF = 3.1415f;	// hay que poner una f al final sino da error
		double decimalD = 3.1415;

		// __CARACTERES__
		char caracter = 'a';

		// __BOOLEANO__
		boolean condicion = true;

		System.out.println("byte: "  + enteroB);
		System.out.println("short: " + enteroS);
		System.out.println("int: "   + enteroI);
		System.out.println("long: "  + enteroL);

		System.out.println("float: "  + decimalF);
		System.out.println("double: " + decimalD);

		System.out.println("char: " + caracter);

		System.out.println("booleano: " + condicion);

		// __NO_PRIMITIVOS__
		Integer numero = 12;
		numero.hashCode();	// ejemplo de metodo

		String cadena = "Hola mundo";
		System.out.println(cadena);
	}
}
