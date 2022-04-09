/*MC. Juan Jaime Funtes Uriarte
 * Alunmnas:
 * Maria Fernanda Mendoza Castro (200100067)
 * Wendy Yasmin Soto Monzón (200100059)
 * Andrea Valdenegro Valles (200100076)
 * SC5-1
 */
package CodigoFuente;

public class Sucursal {// Inicio clase
	// Atributos y propiedades
	public static String Nombre;
	public static String RFC;
	public static String Ubicacion;

	// Get y Set de cada uno de los atributos y propiedades
	public String getNombre() {// Inicio get
		return Nombre;
	}// Fin get

	public void setNombre(String nombre) {// Inicio set
		Nombre = nombre;
	}// Fin set

	public String getRFC() {// Inicio get
		return RFC;
	}// Fin get

	public void setRFC(String rFC) {// Inicio set
		RFC = rFC;
	}// Fin set

	public String getUbicacion() {// Inicio get
		return Ubicacion;
	}// Fin get

	public void setUbicacion(String ubicacion) {// Inicio set
		Ubicacion = ubicacion;
	}// Fin set

}// Fin clase