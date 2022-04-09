/*MC. Juan Jaime Funtes Uriarte
 * Alumnas:
 * Maria Fernanda Mendoza Castro (200100067)
 * Wendy Yasmin Soto Monzón (200100059)
 * Andrea Valdenegro Valles (200100076)
 * SC5-1
 */
package CodigoFuente;

public class Cliente extends Personas {// Inicio clase con extension
	// Atributos y propiedades
	public static int IDCliente;
	public static String Observaciones;

	// Get y Set de cada uno de los atributos y propiedades
	public int getIDCliente() {// Inicio get
		return IDCliente;
	}// Fin get

	public void setIDCliente(int iDCliente) {// Inicio set
		IDCliente = iDCliente;
	}// Fin set

	public String getObservaciones() {// Inicio get
		return Observaciones;
	}// Fin get

	public void setObservaciones(String observaciones) {// Inicio set
		Observaciones = observaciones;
	}// Fin set

}// Fin de la clase
