package FrinkiMania;

import java.util.Scanner;

public class Boleta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int categoria;
        System.out.println("Bienvenido a FrikiMania!");
        System.out.println(" CATEGORIA DE EVENTOS:");
        System.out.println("1. Torneo de videojuegos");
        System.out.println("2. Concurso de cosplay");
        System.out.println("3. Conferencias tech");
        System.out.println("4. Feria de coleccionismo");
        System.out.println("");
        
        System.out.print("Ingresa el numero de la categoria del evento: ");
        categoria = sc.nextInt();

        switch (categoria) {
            case 1: {
                double precioInicial, descuento, importeFinal;
                int paquetes, regalo, dscd;
                System.out.print("Ingresa la cantidad de paquetes por comprar: ");
                paquetes = sc.nextInt();

                if (paquetes < 2 && paquetes > 0) {
                    precioInicial = 150 * paquetes;
                    dscd = 0;
                    descuento = 0;
                    importeFinal = precioInicial - descuento;
                    regalo = 1 * paquetes;
                } else if (paquetes >= 2 && paquetes <= 4) {
                    precioInicial = 150 * paquetes;
                    dscd = 5;
                    descuento = precioInicial * (5.0 / 100);
                    importeFinal = precioInicial - descuento;
                    regalo = 1 * paquetes;
                } else if (paquetes >= 5 && paquetes <= 7) {
                    precioInicial = 150 * paquetes;
                    dscd = 10;
                    descuento = precioInicial * (10.0 / 100);
                    importeFinal = precioInicial - descuento;
                    regalo = 1 * paquetes;
                } else if (paquetes >= 8) {
                    precioInicial = 150 * paquetes;
                    dscd = 15;
                    descuento = precioInicial * (15.0 / 100);
                    importeFinal = precioInicial - descuento;
                    regalo = 1 * paquetes;
                } else {
                    System.out.println("Cantidad no válida.");
                    break;
                }

                System.out.println("");
                System.out.println("Resultado:");
                System.out.println("Precio sin el descuento aplicado: S/ " + precioInicial);
                System.out.println("Descuento (" + dscd + "%): S/ " + descuento);
                System.out.println("Precio con el descuento aplicado: S/ " + importeFinal);
                System.out.println("Regalo: " + regalo + " mouse gamer.");
                System.out.println("¡Muchas gracias por elegirnos!");
                break;
            }

            case 2: {
                double precioInicial, descuento, importeFinal;
                int paquetes, regalo, dscd;
                System.out.print("Ingresa la cantidad de paquetes por comprar: ");
                paquetes = sc.nextInt();

                if (paquetes < 2 && paquetes > 0) {
                    precioInicial = 130 * paquetes;
                    dscd = 0;
                    descuento = 0;
                    importeFinal = precioInicial - descuento;
                    regalo = 2 * paquetes;
                } else if (paquetes >= 2 && paquetes <= 4) {
                    precioInicial = 130 * paquetes;
                    dscd = 5;
                    descuento = precioInicial * (5.0 / 100);
                    importeFinal = precioInicial - descuento;
                    regalo = 2 * paquetes;
                } else if (paquetes >= 5 && paquetes <= 7) {
                    precioInicial = 130 * paquetes;
                    dscd = 10;
                    descuento = precioInicial * (10.0 / 100);
                    importeFinal = precioInicial - descuento;
                    regalo = 2 * paquetes;
                } else if (paquetes >= 8) {
                    precioInicial = 130 * paquetes;
                    dscd = 15;
                    descuento = precioInicial * (15.0 / 100);
                    importeFinal = precioInicial - descuento;
                    regalo = 2 * paquetes;
                } else {
                    System.out.println("Cantidad no válida.");
                    break;
                }
                System.out.println("");
                System.out.println("Resultado:");
                System.out.println("Precio sin el descuento aplicado: S/ " + precioInicial);
                System.out.println("Descuento (" + dscd + "%): S/ " + descuento);
                System.out.println("Precio con el descuento aplicado: S/ " + importeFinal);
                System.out.println("Regalo: " + regalo + " pines anime.");
                System.out.println("¡Muchas gracias por elegirnos!");
                break;
            }

            case 3: {
                double precioInicial, descuento, importeFinal;
                int paquetes, regalo, dscd;
                System.out.print("Ingresa la cantidad de paquetes por comprar: ");
                paquetes = sc.nextInt();

                if (paquetes < 2 && paquetes > 0) {
                    precioInicial = 120 * paquetes;
                    dscd = 0;
                    descuento = 0;
                    importeFinal = precioInicial - descuento;
                    regalo = 1 * paquetes;
                } else if (paquetes >= 2 && paquetes <= 4) {
                    precioInicial = 120 * paquetes;
                    dscd = 5;
                    descuento = precioInicial * (5.0 / 100);
                    importeFinal = precioInicial - descuento;
                    regalo = 1 * paquetes;
                } else if (paquetes >= 5 && paquetes <= 7) {
                    precioInicial = 120 * paquetes;
                    dscd = 10;
                    descuento = precioInicial * (10.0 / 100);
                    importeFinal = precioInicial - descuento;
                    regalo = 1 * paquetes;
                } else if (paquetes >= 8) {
                    precioInicial = 120 * paquetes;
                    dscd = 15;
                    descuento = precioInicial * (15.0 / 100);
                    importeFinal = precioInicial - descuento;
                    regalo = 1 * paquetes;
                } else {
                    System.out.println("Cantidad no válida.");
                    break;
                }
                System.out.println("");
                System.out.println("Resultado:");
                System.out.println("Precio sin el descuento aplicado: S/ " + precioInicial);
                System.out.println("Descuento (" + dscd + "%): S/ " + descuento);
                System.out.println("Precio con el descuento aplicado: S/ " + importeFinal);
                System.out.println("Regalo: " + regalo + " cable(s) USB-C.");
                System.out.println("¡Muchas gracias por elegirnos!");
                break;
            }

            case 4: {
                double precioInicial, descuento, importeFinal;
                int paquetes, regalo, dscd;
                System.out.print("Ingresa la cantidad de paquetes por comprar: ");
                paquetes = sc.nextInt();

                if (paquetes < 2 && paquetes > 0) {
                    precioInicial = 100 * paquetes;
                    dscd = 0;
                    descuento = 0;
                    importeFinal = precioInicial - descuento;
                    regalo = 3 * paquetes;
                } else if (paquetes >= 2 && paquetes <= 4) {
                    precioInicial = 100 * paquetes;
                    dscd = 5;
                    descuento = precioInicial * (5.0 / 100);
                    importeFinal = precioInicial - descuento;
                    regalo = 3 * paquetes;
                } else if (paquetes >= 5 && paquetes <= 7) {
                    precioInicial = 100 * paquetes;
                    dscd = 10;
                    descuento = precioInicial * (10.0 / 100);
                    importeFinal = precioInicial - descuento;
                    regalo = 3 * paquetes;
                } else if (paquetes >= 8) {
                    precioInicial = 100 * paquetes;
                    dscd = 15;
                    descuento = precioInicial * (15.0 / 100);
                    importeFinal = precioInicial - descuento;
                    regalo = 3 * paquetes;
                } else {
                    System.out.println("Cantidad no válida.");
                    break;
                }
                System.out.println("");
                System.out.println("Resultado:");
                System.out.println("Precio sin el descuento aplicado: S/ " + precioInicial);
                System.out.println("Descuento (" + dscd + "%): S/ " + descuento);
                System.out.println("Precio con el descuento aplicado: S/ " + importeFinal);
                System.out.println("Regalo: " + regalo + " stickers frikis");
                System.out.println("¡Muchas gracias por elegirnos!");
                break;
            }
            default:
                System.out.println("Por favor ingrese de forma correcta el número de la categoría.");
        }
        sc.close();
	}
}
