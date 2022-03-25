package CodigoFuente;

public class Empleado extends Personas{
	public static float Sueldo;
	public static String RFC;
	
	public static float getSueldo() {
		return Sueldo;
	}
	public static void setSueldo(float sueldo) {
		Sueldo = sueldo;
	}
	public static String getRFC() {
		return RFC;
	}
	public static void setRFC(String rFC) {
		RFC = rFC;
	}
	
}
