package CodigoFuente;

public class Cliente  extends Personas{
	public static int IDCliente;
	public static String Observaciones;

	public static int getIDCliente() {
		return IDCliente;
	}

	public static void setIDCliente(int iDCliente) {
		IDCliente = iDCliente;
	}

	public static String getObservaciones() {
		return Observaciones;
	}

	public static void setObservaciones(String observaciones) {
		Observaciones = observaciones;
	}
	
}
