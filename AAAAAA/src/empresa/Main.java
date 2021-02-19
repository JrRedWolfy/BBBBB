  
package empresa;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner leer = new Scanner(System.in);
		String cliente = "";
		
		Ventas vVenta[] = new Ventas[10];
		String vCliente[] = {"", "", "", "", "", "", "", "", "", ""};
		
		IODatos.generarVector(vVenta);
		
		Ventas.nClientes(vVenta, vCliente);
		
		
		System.out.println("Escribe el nombre del cliente, te dire el total en euros a facturar de las ventas a dicho cliente.");
		cliente = leer.next();

		Ventas.calcularGanancia(cliente, vVenta);
	}

}