/*MC. Juan Jaime Funtes Uriarte
 * Alumnas:
 * Maria Fernanda Mendoza Castro (200100067)
 * Wendy Yasmin Soto Monzón (200100059)
 * Andrea Valdenegro Valles (200100076)
 * SC5-1
 */
package CodigoFuente;

public class Multimedia {
	// Atributos y propiedades
	public static String Nombre;
	public static String Genero;
	public static int Año_estreno;
	public static String Clasificacion;
	public static float precio;

	// Get y Set de cada uno de los atributos y propiedades
	public float getPrecio() {// Inicio get
		return precio;
	}// Fin get

	public void setPrecio(float precio) {// Inicio set
		Multimedia.precio = precio;
	}// Fin set

	public static String getNombre() {// Inicio get
		return Nombre;
	}// Fin get

	public void setNombre(String nombre) {// Inicio set
		Nombre = nombre;
	}// Fin set

	public String getGenero() {// Inicio get
		return Genero;
	}// Fin get

	public void setGenero(String genero) {// Inicio set
		Genero = genero;
	}// Fin set

	public int getAño_estreno() {// Inicio get
		return Año_estreno;
	}// Fin get

	public void setAño_estreno(int año_estreno) {// Inicio set
		Año_estreno = año_estreno;
	}// Fin set

	public String getClasificacion() {// Inicio get
		return Clasificacion;
	}// Fin get

	public void setClasificacion(String clasificacion) {// Inicio set
		Clasificacion = clasificacion;
	}// Fin set
}// Fin clase
