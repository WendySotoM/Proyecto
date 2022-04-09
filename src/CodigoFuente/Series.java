/*MC. Juan Jaime Funtes Uriarte
 * Alunmnas:
 * Maria Fernanda Mendoza Castro (200100067)
 * Wendy Yasmin Soto Monzon (200100059)
 * Andrea Valdenegro Valles (200100076)
 * SC5-1
 */
package CodigoFuente;

public class Series extends Multimedia {// Inicio clase
	// Atributos y propiedades
	public static int IDSerie;
	public static int Cantidad_Temporadas;
	
	// Get y Set de cada uno de los atributos y propiedades
	public int getIDSerie() {// Inicio get
		return IDSerie;
	}// Fin set

	public void setIDSerie(int iDSerie) {// Inicio set
		IDSerie = iDSerie;
	}// Fin set

	public int getCantidad_Temporadas() {// Inicio get
		return Cantidad_Temporadas;
	}// Fin get

	public void setCantidad_Temporadas(int cantidad_Temporadas) {// Inicio set
		Cantidad_Temporadas = cantidad_Temporadas;
	}// Fin set

}// Fin clase