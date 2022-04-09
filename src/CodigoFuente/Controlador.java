/*MC. Juan Jaime Funtes Uriarte
 * Alunmnas:
 * Maria Fernanda Mendoza Castro (200100067)
 * Wendy Yasmin Soto Monzon (200100059)
 * Andrea Valdenegro Valles (200100076)
 * SC5-1
 */

package CodigoFuente;

//Importaciones de java
import java.util.ArrayList;
import java.util.Scanner;

public class Controlador { // Inicio clase controlador

	public static ArrayList<Sucursal> Lista_Sucursales = new ArrayList<Sucursal>();
	public static ArrayList<Empleado> Lista_Empleados = new ArrayList<Empleado>();
	public static ArrayList<Cliente> Lista_Clientes = new ArrayList<Cliente>();
	public static ArrayList<Peliculas> Lista_Peliculas = new ArrayList<Peliculas>();
	public static ArrayList<Series> Lista_Series = new ArrayList<Series>();
	public static ArrayList<Venta> Lista_Ventas = new ArrayList<Venta>();

	public Controlador() { // Paquete controlador

	}// Paquete controlador

	public static void main(String[] args) {// Inicio del método
		// Declaracion de variables
		Scanner Teclado = new Scanner(System.in);
		Scanner TecladoS = new Scanner(System.in);
		Scanner TecladoE = new Scanner(System.in);
		Scanner TecladoC = new Scanner(System.in);
		Scanner TecladoV = new Scanner(System.in);
		Scanner TecladoP = new Scanner(System.in);
		Scanner TecladoSe = new Scanner(System.in);
		String Nombre = " ";
		String RFC = " ";
		float precio = 0;
		String Ubicacion = " ";
		float Sueldo = 0;
		String Sexo = " ";
		int Edad = 0;
		String Telefono = "";
		String Direccion = " ";
		int IDCliente = 0;
		String Observaciones;
		String Genero = " ";
		int Año_estreno = 0;
		String Clasificacion = " ";
		int Cantidad_Temporadas = 0;
		int Duracion = 0;
		int opc = 0;

		boolean respuestaic = false;
		boolean respuestap = false;
		boolean respuestaS = false;

		int IDEmpleado = 0;
		String Fecha = "";
		String Tipo_Pago;
		String Multimedia;
		String Cliente = "";
		int IDPelicula = 0;
		int IDSerie = 0;

		do { // Inicio condición while
			System.out.println("-----------------------------------------");
			System.out.println("Selecciona una opccion");
			System.out.println("1.- Registra sucursal");
			System.out.println("2.- Registra empleado");
			System.out.println("3.- Registra cliente");
			System.out.println("4.- Registra la pelicula");
			System.out.println("5.- Registra la serie");
			System.out.println("6.- Registra la venta");
			System.out.println("Introduzca 0 para salir ");
			opc = Teclado.nextInt();

			switch (opc) { // Switch para selcción de instrucciones
			case 1:

				// Datos guardados con el set
				Sucursal ObjetoSucursal = new Sucursal();
				System.out.println("Captura el nombre de la sucursal");
				Nombre = TecladoS.next();
				ObjetoSucursal.setNombre(Nombre);

				System.out.println("Captura el RFC de la sucursal");
				RFC = TecladoS.next();
				ObjetoSucursal.setRFC(RFC);

				System.out.println("Captura la ubicacion de la sucursal");
				Ubicacion = TecladoS.next();
				ObjetoSucursal.setUbicacion(Ubicacion);

				Lista_Sucursales.add(ObjetoSucursal);// Se agrega los datos a la lista
				break;

			case 2:

				// Datos guardados en set
				Empleado ObjetoEmpleado = new Empleado();
				System.out.println("Captura el ID del empleado");
				IDEmpleado = TecladoE.nextInt();
				ObjetoEmpleado.setIDEmpleado(IDEmpleado);

				System.out.println("Captura el nombre del empleado");
				Nombre = TecladoE.next();
				ObjetoEmpleado.setNombre(Nombre);

				System.out.println("Captura el RFC del empleado");
				RFC = TecladoE.next();
				ObjetoEmpleado.setRFC(RFC);

				System.out.println("Captura el sueldo del empleado");
				Sueldo = TecladoE.nextFloat();
				ObjetoEmpleado.setSueldo(Sueldo);

				System.out.println("Captura el sexo del empleado");
				Sexo = TecladoE.next();
				ObjetoEmpleado.setSexo(Sexo);

				System.out.println("Captura la edad del empleado");
				Edad = TecladoE.nextInt();
				ObjetoEmpleado.setEdad(Edad);

				System.out.println("Captura el telefono del empleado");
				Telefono = TecladoE.next();
				ObjetoEmpleado.setTelefono(Telefono);

				System.out.println("Captura la direccion del empleado");
				Direccion = TecladoE.next();
				ObjetoEmpleado.setDireccion(Direccion);

				Lista_Empleados.add(ObjetoEmpleado);// Se agrega los datos a la lista
				break;
			case 3:
				// Datos guardados con el set
				Cliente ObjetoCliente = new Cliente();
				System.out.println("Captura el nombre del cliente");
				Nombre = TecladoC.next();
				ObjetoCliente.setNombre(Nombre);

				System.out.println("Captura el sexo del cliente");
				Sexo = TecladoC.next();
				ObjetoCliente.setSexo(Sexo);

				System.out.println("Captura la edad del cliente");
				Edad = TecladoC.nextInt();
				ObjetoCliente.setEdad(Edad);

				System.out.println("Captura el telefono del cliente");
				Telefono = TecladoC.next();
				ObjetoCliente.setTelefono(Telefono);

				System.out.println("Captura la direccion del cliente");
				Direccion = TecladoC.next();
				ObjetoCliente.setDireccion(Direccion);

				System.out.println("Captura el id del cliente");
				IDCliente = TecladoC.nextInt();
				ObjetoCliente.setIDCliente(IDCliente);

				System.out.println("Captura observaciones del cliente");
				Observaciones = TecladoC.next();
				ObjetoCliente.setObservaciones(Observaciones);

				Lista_Clientes.add(ObjetoCliente);// Se agrega los datos a la lista
				break;
			case 4:
				// Datos guardados con el set
				Peliculas ObjetoPeliculas = new Peliculas();
				System.out.println("Captura el ID de la pelicula");
				IDPelicula = TecladoP.nextInt();
				ObjetoPeliculas.setIDPelicula(IDPelicula);

				System.out.println("Captura el nombre de la pelicula");
				Nombre = TecladoP.next();
				ObjetoPeliculas.setNombre(Nombre);

				System.out.println("Captura el genero de la pelicula");
				Genero = TecladoP.next();
				ObjetoPeliculas.setGenero(Genero);

				System.out.println("Captura el año de estreno de la pelicula");
				Año_estreno = TecladoP.nextInt();
				ObjetoPeliculas.setAño_estreno(Año_estreno);

				System.out.println("¿Cual es la clasificacion de la pelicula?");
				Clasificacion = TecladoP.next();
				ObjetoPeliculas.setClasificacion(Clasificacion);

				System.out.println("Captura la duración de la pelicula en minutos");
				Duracion = TecladoP.nextInt();
				ObjetoPeliculas.setDuracion(Duracion);

				System.out.println("Captura el precio de la pelicula");
				precio = TecladoP.nextFloat();
				ObjetoPeliculas.setPrecio(precio);

				Lista_Peliculas.add(ObjetoPeliculas);// Se agrega los datos a la lista
				break;
			case 5:
				// Datos guardados con el set
				Series ObjetoSeries = new Series();
				System.out.println("Captura el ID de la serie");
				IDSerie = TecladoSe.nextInt();
				ObjetoSeries.setIDSerie(IDSerie);

				System.out.println("Captura el nombre de la serie");
				Nombre = TecladoSe.next();
				ObjetoSeries.setNombre(Nombre);

				System.out.println("Captura el genero de la serie");
				Genero = TecladoSe.next();
				ObjetoSeries.setGenero(Genero);

				System.out.println("Captura el año de estreno de la serie");
				Año_estreno = TecladoSe.nextInt();
				ObjetoSeries.setAño_estreno(Año_estreno);

				System.out.println("¿Cual es la clasificacion de la serie?");
				Clasificacion = TecladoSe.next();
				ObjetoSeries.setClasificacion(Clasificacion);

				System.out.println("Captura la cantidad de temporadas de la serie");
				Cantidad_Temporadas = TecladoSe.nextInt();
				ObjetoSeries.setCantidad_Temporadas(Cantidad_Temporadas);

				System.out.println("Captura el precio de la serie");
				precio = TecladoSe.nextFloat();
				ObjetoSeries.setPrecio(precio);

				Lista_Series.add(ObjetoSeries);// Se agrega los datos a la lista
				break;
			case 6:

				System.out.println("Catura el id del empleado");
				IDEmpleado = TecladoV.nextInt();
				respuestaic = ValidaEmpleado(IDEmpleado, Lista_Empleados);

				if (respuestaic == true) {// Inicio if
					Venta ObjetoVenta = new Venta();
					ObjetoVenta.setIDEmpleado(IDEmpleado);
					// Datos guardados con el set
					System.out.println("Captura el nombre del cliente ");
					Cliente = TecladoV.next();
					ObjetoVenta.setCliente(Cliente);

					// Se cambio la variable date por string porque las instrucciones se juntaban
					System.out.println("Captura la fecha de esta manera (00/00/0000) ");
					Fecha = TecladoV.next();
					ObjetoVenta.setFecha(Fecha);

					System.out.println("Que profucto de desea vender Pelicula (1) / Serie (2) ");
					int respuesta = TecladoV.nextInt();

					if (respuesta == 1) {// Inicio if
						System.out.println("Dime el id de la pelicula");
						IDPelicula = TecladoV.nextInt();
						respuestap = ValidaPelicula(IDPelicula, Lista_Peliculas);
						if (respuestap == true) {// Inicio if
							System.out.println("Dime el Nombre de la pelicula");
							Multimedia = TecladoV.next();
							ObjetoVenta.setMultimedia(Multimedia);

							System.out.println("Captura el precio de la pelicula");
							precio = TecladoV.nextFloat();
							ObjetoVenta.setPrecio(precio);

							System.out.println("Captura el tipo de pago");
							Tipo_Pago = TecladoV.next();
							ObjetoVenta.setTipo_Pago(Tipo_Pago);

							System.out.println("Se realizo la venta");

							Lista_Ventas.add(ObjetoVenta);// Se agrega los datos a la lista
							break;

						} else {// Inicio else y fin if
							System.out.println("ID incorrecto o no se encuentra registrado");

						} // Fin else

					} else {// Inicio else y fin if
						System.out.println("Dime el id de la Serie");
						IDSerie = TecladoV.nextInt();
						respuestaS = ValidaSerie(IDSerie, Lista_Series);
						if (respuestaS == true) {// Inicio if

							System.out.println("Dime el Nombre de la Serie");
							Multimedia = TecladoV.next();
							ObjetoVenta.setMultimedia(Multimedia);

							System.out.println("Captura el precio de la serie");
							precio = TecladoV.nextFloat();
							ObjetoVenta.setPrecio(precio);

							System.out.println("Captura el tipo de pago");
							Tipo_Pago = TecladoV.next();
							ObjetoVenta.setTipo_Pago(Tipo_Pago);

							System.out.println("Se realizo la venta");
							Lista_Ventas.add(ObjetoVenta);// Se agrega los datos a la lista
							break;
						} else {// Inicio else y fin if
							System.out.println("ID incorrecto o no se encuentra registrado");

						} // Fin else
					} // Fin else

				} else {// Fin if e inicio else
					respuestaic = false;
					System.out.println("ID invalido ");
				} // Fin else
			}// Fin switch
		} while (opc != 0); // Fin método While

		Teclado.close();
		TecladoS.close();
		TecladoE.close();
		TecladoC.close();
		TecladoV.close();
		TecladoP.close();
		TecladoSe.close();

	}// Fin método

	public static boolean ValidaEmpleado(int idEmpleado, ArrayList<Empleado> obcli) {// Inicio del método Valida
																						// empleado
		boolean Resultado = false;
		for (int x = 0; x < obcli.size(); x++) {// Inicio for
			if (obcli.get(x).getIDEmpleado() == idEmpleado) {// Inicio if
				Resultado = true;
			} // Fin if
		} // Fin for
		return Resultado;
	}// Fin del método Valida empleado

	public static boolean ValidaPelicula(int idPelicula, ArrayList<Peliculas> pelis) {// Inicio del método Valida
																						// pelicula

		boolean Resultado = false;
		for (int x = 0; x < pelis.size(); x++) {// Inicio for
			if (pelis.get(x).getIDPelicula() == idPelicula) {// Inicio if
				Resultado = true;
			} // Fin if
		} // Fin for
		return Resultado;
	}// Fin del método Valida pelicula

	public static boolean ValidaSerie(int idSerie, ArrayList<Series> serie) {// Inicio del método Valida serie

		boolean Resultado = false;
		for (int x = 0; x < serie.size(); x++) {// Inicio for
			if (serie.get(x).getIDSerie() == idSerie) {// Inicio if
				Resultado = true;
			} // Fin if
		} // Fin for
		return Resultado;
	}// Fin del método Valida serie
}// Fin Clase controlador