/*MC. Juan Jaime Funtes Uriarte
 * Alunmnas:
 * Maria Fernanda Mendoza Castro (200100067)
 * Wendy Yasmin Soto Monzón (200100059)
 * Andrea Valdenegro Valles (200100076)
 * SC5-1
 */

package CodigoFuente;

public class Empleado extends Personas {// Inicio clase con extension
	// Atributos y propiedades
	public static int IDEmpleado;
	public static float Sueldo;
	public static String RFC;

	// Get y Set de cada uno de los atributos y propiedades
	public int getIDEmpleado() {// Inicio get
		return IDEmpleado;
	}// Fin get

	public void setIDEmpleado(int iDEmpleado) {// Inicio set
		IDEmpleado = iDEmpleado;
	}// Fin set

	public float getSueldo() { // Inicio get
		return Sueldo;
	}// Fin get

	public void setSueldo(float sueldo) {// Inicio set
		Sueldo = sueldo;
	}// Fin set

	public String getRFC() {// Inicio get
		return RFC;
	}// fin set

	public void setRFC(String rFC) {// Inicio set
		RFC = rFC;
	}// Fin set

}// Fin clase