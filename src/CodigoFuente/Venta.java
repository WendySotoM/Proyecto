package CodigoFuente;

import java.util.Date;

public class Venta {
	public static String Empleado;
	public static String Cliente;
	public static Date Fecha;
	public static String Tipo_Pago;
	public static String Producto;
	
	public static String getEmpleado() {
		return Empleado;
	}
	public static void setEmpleado(String empleado) {
		Empleado = empleado;
	}
	public static String getCliente() {
		return Cliente;
	}
	public static void setCliente(String cliente) {
		Cliente = cliente;
	}
	public static Date getFecha() {
		return Fecha;
	}
	public static void setFecha(Date fecha) {
		Fecha = fecha;
	}
	public static String getTipo_Pago() {
		return Tipo_Pago;
	}
	public static void setTipo_Pago(String tipo_Pago) {
		Tipo_Pago = tipo_Pago;
	}
	public static String getProducto() {
		return Producto;
	}
	public static void setProducto(String producto) {
		Producto = producto;
	}
	
}
