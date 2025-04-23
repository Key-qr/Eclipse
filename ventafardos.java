package miempresa.alpaca;

import java.util.Scanner;

public class VentaDeAlpaca {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner1 = new Scanner(System.in);
		String opciones;
		System.out.println("Bienvenido querido cliente, calcularemos tu boleta de pago por tu compra");
		System.out.println("Escribe la calidad de fardos que comprarás:");
		System.out.println("Alpaca Baby");
		System.out.println("Alpaca Suri");
		System.out.println("Alpaca Superfina");
		System.out.println("Alpaca Fleece");

		opciones = scanner1.nextLine();
		// Convertir a mayúsculas
		opciones = opciones.toUpperCase();

		switch (opciones) {
		case "ALPACA BABY":
			int cantidadFardos1, obsequio1;
			double importecompra1, descuento1, importefinal1;
			System.out.println("¿Cuantos fardos de 20 kilos compraras?");
			cantidadFardos1 = scanner1.nextInt();

			if (cantidadFardos1 < 5) {
				importecompra1 = 409.9 * cantidadFardos1;
				descuento1 = 0;
				importefinal1 = importecompra1;
				obsequio1 = 4 * cantidadFardos1;
				System.out.println("El importe de tu compra es de: " + importecompra1);
				System.out.println("No obtuviste descuento, por lo tanto, tienes el " + descuento1 + "%");
				System.out.println("El importe a pagar es de: " + importefinal1);
				System.out.println("Por tu compra, recibes " + obsequio1 + " cuadernos");
			} else if (cantidadFardos1 >= 5 && cantidadFardos1 < 10) {
				importecompra1 = 409.9 * cantidadFardos1;
				descuento1 = 5;
				importefinal1 = importecompra1 * 0.95;
				obsequio1 = 4 * cantidadFardos1;
				System.out.println("El importe de tu compra es de: " + importecompra1);
				System.out.println("El descuento que obtuviste es de: " + descuento1 + "%");
				System.out.println("El importe a pagar es de: " + importefinal1);
				System.out.println("Por tu compra, recibes " + obsequio1 + " cuadernos");
			} else if (cantidadFardos1 >= 10 && cantidadFardos1 < 15) {
				importecompra1 = 409.9 * cantidadFardos1;
				descuento1 = 7;
				importefinal1 = importecompra1 * 0.93;
				obsequio1 = 4 * cantidadFardos1;
				System.out.println("El importe de tu compra es de: " + importecompra1);
				System.out.println("El descuento que obtuviste es de: " + descuento1 + "%");
				System.out.println("El importe a pagar es de: " + importefinal1);
				System.out.println("Por tu compra, recibes " + obsequio1 + " cuadernos");
			} else {
				importecompra1 = 409.9 * cantidadFardos1;
				descuento1 = 9;
				importefinal1 = importecompra1 * 0.91;
				obsequio1 = 4 * cantidadFardos1;
				System.out.println("El importe de tu compra es de: " + importecompra1);
				System.out.println("El descuento que obtuviste es de: " + descuento1 + "%");
				System.out.println("El importe a pagar es de: " + importefinal1);
				System.out.println("Por tu compra, recibes " + obsequio1 + " cuadernos");
			}
			break;

		case "ALPACA SURI":
			System.out.println("¿Cuantos fardos de 20 kilos compraras?");
			cantidadFardos1 = scanner1.nextInt();

			if (cantidadFardos1 < 5) {
				importecompra1 = 279.9 * cantidadFardos1;
				descuento1 = 0;
				importefinal1 = importecompra1;
				obsequio1 = 3 * cantidadFardos1;
				System.out.println("El importe de tu compra es de: " + importecompra1);
				System.out.println("No obtuviste descuento, por lo tanto, tienes el " + descuento1 + "%");
				System.out.println("El importe a pagar es de: " + importefinal1);
				System.out.println("Por tu compra, recibes " + obsequio1 + " cuadernos");
			} else if (cantidadFardos1 >= 5 && cantidadFardos1 < 10) {
				importecompra1 = 279.9 * cantidadFardos1;
				descuento1 = 5;
				importefinal1 = importecompra1 * 0.95;
				obsequio1 = 3 * cantidadFardos1;
				System.out.println("El importe de tu compra es de: " + importecompra1);
				System.out.println("El descuento que obtuviste es de: " + descuento1 + "%");
				System.out.println("El importe a pagar es de: " + importefinal1);
				System.out.println("Por tu compra, recibes " + obsequio1 + " cuadernos");
			} else if (cantidadFardos1 >= 10 && cantidadFardos1 < 15) {
				importecompra1 = 279.9 * cantidadFardos1;
				descuento1 = 7;
				importefinal1 = importecompra1 * 0.93;
				obsequio1 = 3 * cantidadFardos1;
				System.out.println("El importe de tu compra es de: " + importecompra1);
				System.out.println("El descuento que obtuviste es de: " + descuento1 + "%");
				System.out.println("El importe a pagar es de: " + importefinal1);
				System.out.println("Por tu compra, recibes " + obsequio1 + " cuadernos");
			} else {
				importecompra1 = 279.9 * cantidadFardos1;
				descuento1 = 9;
				importefinal1 = importecompra1 * 0.91;
				obsequio1 = 3 * cantidadFardos1;
				System.out.println("El importe de tu compra es de: " + importecompra1);
				System.out.println("El descuento que obtuviste es de: " + descuento1 + "%");
				System.out.println("El importe a pagar es de: " + importefinal1);
				System.out.println("Por tu compra, recibes " + obsequio1 + " cuadernos");
			}
			break;

		case "ALPACA SUPERFINA":
			System.out.println("¿Cuantos fardos de 20 kilos compraras?");
			cantidadFardos1 = scanner1.nextInt();

			if (cantidadFardos1 < 5) {
				importecompra1 = 209.9 * cantidadFardos1;
				descuento1 = 0;
				importefinal1 = importecompra1;
				obsequio1 = 5 * cantidadFardos1;
				System.out.println("El importe de tu compra es de: " + importecompra1);
				System.out.println("No obtuviste descuento, por lo tanto, tienes el " + descuento1 + "%");
				System.out.println("El importe a pagar es de: " + importefinal1);
				System.out.println("Por tu compra, recibes " + obsequio1 + " cuadernos");
			} else if (cantidadFardos1 >= 5 && cantidadFardos1 < 10) {
				importecompra1 = 209.9 * cantidadFardos1;
				descuento1 = 5;
				importefinal1 = importecompra1 * 0.95;
				obsequio1 = 5 * cantidadFardos1;
				System.out.println("El importe de tu compra es de: " + importecompra1);
				System.out.println("El descuento que obtuviste es de: " + descuento1 + "%");
				System.out.println("El importe a pagar es de: " + importefinal1);
				System.out.println("Por tu compra, recibes " + obsequio1 + " cuadernos");
			} else if (cantidadFardos1 >= 10 && cantidadFardos1 < 15) {
				importecompra1 = 209.9 * cantidadFardos1;
				descuento1 = 7;
				importefinal1 = importecompra1 * 0.93;
				obsequio1 = 5 * cantidadFardos1;
				System.out.println("El importe de tu compra es de: " + importecompra1);
				System.out.println("El descuento que obtuviste es de: " + descuento1 + "%");
				System.out.println("El importe a pagar es de: " + importefinal1);
				System.out.println("Por tu compra, recibes " + obsequio1 + " cuadernos");
			} else {
				importecompra1 = 209.9 * cantidadFardos1;
				descuento1 = 9;
				importefinal1 = importecompra1 * 0.91;
				obsequio1 = 5 * cantidadFardos1;
				System.out.println("El importe de tu compra es de: " + importecompra1);
				System.out.println("El descuento que obtuviste es de: " + descuento1 + "%");
				System.out.println("El importe a pagar es de: " + importefinal1);
				System.out.println("Por tu compra, recibes " + obsequio1 + " cuadernos");
			}
			break;

		case "ALPACA FLEECE":
			System.out.println("¿Cuantos fardos de 20 kilos compraras?");
			cantidadFardos1 = scanner1.nextInt();

			if (cantidadFardos1 < 5) {
				importecompra1 = 229.9 * cantidadFardos1;
				descuento1 = 0;
				importefinal1 = importecompra1;
				obsequio1 = 3 * cantidadFardos1;
				System.out.println("El importe de tu compra es de: " + importecompra1);
				System.out.println("No obtuviste descuento, por lo tanto, tienes el " + descuento1 + "%");
				System.out.println("El importe a pagar es de: " + importefinal1);
				System.out.println("Por tu compra, recibes " + obsequio1 + " cuadernos");
			} else if (cantidadFardos1 >= 5 && cantidadFardos1 < 10) {
				importecompra1 = 229.9 * cantidadFardos1;
				descuento1 = 5;
				importefinal1 = importecompra1 * 0.95;
				obsequio1 = 3 * cantidadFardos1;
				System.out.println("El importe de tu compra es de: " + importecompra1);
				System.out.println("El descuento que obtuviste es de: " + descuento1 + "%");
				System.out.println("El importe a pagar es de: " + importefinal1);
				System.out.println("Por tu compra, recibes " + obsequio1 + " cuadernos");
			} else if (cantidadFardos1 >= 10 && cantidadFardos1 < 15) {
				importecompra1 = 229.9 * cantidadFardos1;
				descuento1 = 7;
				importefinal1 = importecompra1 * 0.93;
				obsequio1 = 3 * cantidadFardos1;
				System.out.println("El importe de tu compra es de: " + importecompra1);
				System.out.println("El descuento que obtuviste es de: " + descuento1 + "%");
				System.out.println("El importe a pagar es de: " + importefinal1);
				System.out.println("Por tu compra, recibes " + obsequio1 + " cuadernos");
			} else {
				importecompra1 = 229.9 * cantidadFardos1;
				descuento1 = 9;
				importefinal1 = importecompra1 * 0.91;
				obsequio1 = 3 * cantidadFardos1;
				System.out.println("El importe de tu compra es de: " + importecompra1);
				System.out.println("El descuento que obtuviste es de: " + descuento1 + "%");
				System.out.println("El importe a pagar es de: " + importefinal1);
				System.out.println("Por tu compra, recibes " + obsequio1 + " cuadernos");
			}
			break;

		default:
			System.out.println("Porfavor ingresa de forma valida el nombre de la calidad de fardos");
			break;
		}

		scanner1.close(); // Cerramos el Scanner al final del programa.
	}

}
