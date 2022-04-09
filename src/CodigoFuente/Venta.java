/*MC. Juan Jaime Funtes Uriarte
 * Alunmnas:
 * Maria Fernanda Mendoza Castro (200100067)
 * Wendy Yasmin Soto Monzón (200100059)
 * Andrea Valdenegro Valles (200100076)
 * SC5-1
 */

package CodigoFuente;

public class Venta {
	// Atributos y propiedades
	public static int IDEmpleado;
	public static String Cliente;
	public static String Fecha;
	public static String Tipo_Pago;
	public static String Multimedia;
	public static float precio;

	// Get y Set de cada uno de los atributos y propiedades
	public int getIDEmpleado() {// Inicio get
		return IDEmpleado;
	}// Fin get

	public void setIDEmpleado(int iDEmpleado) {// Inicio set
		IDEmpleado = iDEmpleado;
	}// Fin set

	public float getPrecio() {// Inicio get
		return precio;
	}// Fin get

	public void setPrecio(float precio) {// Inicio set
		Venta.precio = precio;
	}// Fin set

	public String getCliente() {// Inicio get
		return Cliente;
	}// Fin get

	public void setCliente(String cliente) {// Inicio set
		Cliente = cliente;
	}// Fin set

	public String getFecha() {// Inicio get
		return Fecha;
	}// Fin get

	public void setFecha(String fecha) {// Inicio set
		Fecha = fecha;
	}// Fin set

	public String getTipo_Pago() {// Inicio get
		return Tipo_Pago;
	}// Fin get

	public void setTipo_Pago(String tipo_Pago) {// Inicio set
		Tipo_Pago = tipo_Pago;
	}

	public String getMultimedia() {// Inicio get
		return Multimedia;
	}// Fin get

	public void setMultimedia(String multimedia) {// Inicio set
		Multimedia = multimedia;
	}// Fin set

}// Fin clases
