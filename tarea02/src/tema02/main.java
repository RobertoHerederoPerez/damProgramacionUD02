package tema02;

/*importo la libreria scanner*/
import java.util.Scanner;

/*lo llamo AzulVerdeV3, porque ha habido dos versiones previas y en esta incluyo las mejoras de ambas*/
public class main {

	public static final String PAR = " VERDE ";
	public static final String IMPAR = " AZUL ";

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		System.out.println("Cuantos Numeros desea Ingresar: ");
		/* declaro el array para que almacene los numeros introducidos por teclado */
		int miArray[] = new int[entrada.nextInt()];

		// llenando el Array, con las entradsa por teclado inroducidas en el metodo
		// anterior
		for (int e = 0; e < miArray.length; e++) {
			System.out.println("Ingrese el " + (e + 1) + "º numero: ");
			miArray[e] = entrada.nextInt();

		}

		entrada.close();

		// ordenando
		/*
		 * for (int i = 0; i < miArray.length; i++) { int min = i; for (int j = i + 1; j
		 * < miArray.length; j++) { if (miArray[j] < miArray[min]) { min = j; } } if (i
		 * != min) { int aux = miArray[i]; miArray[i] = miArray[min]; miArray[min] =
		 * aux; } }
		 */
		// FIXME añadido por mi
		/* arreglo para que me ayude a trabajar con los valores introducidos */
		for (int i = 0; i < (miArray.length - 1); i++) {
			for (int j = i + 1; j < miArray.length; j++) {
				if (miArray[i] > miArray[j]) {
					// Intercambiamos valores
					int aux = miArray[i];
					miArray[i] = miArray[j];
					miArray[j] = aux;
				}
			}
		}
		/*
		 * con este array mostrariamos los numeros de entrada introducidos en orden
		 * numerico, por ahora lo dejo como un comentario
		 * System.out.println("Mostrando array ordenado:"); for (int i = 0; i <
		 * (miArray.length - 1); i++) { System.out.print(miArray[i]+" "); }
		 */
		System.out.println("");
		// mostrando pares
		System.out.println("Numeros Pares: ");
		boolean checkPares = false;
		for (int i = 0; i < miArray.length; i++) {
			/*
			 * para saber si el numero es par lo divido entre dos los valores dados en el
			 * array, con este bucle los recorrera todos los dados
			 */
			if (miArray[i] % 2 == 0) {
				System.out.println(miArray[i]);
				checkPares = true;
			}
		}
		/*
		 * sino hay numero pares lo indicare como control para saber que le programa lo
		 * lee correctamente
		 */
		if (!checkPares) {
			System.out.println("No se ingresaron numeros pares!");
		}

		// mostrando impares
		System.out.println("Numeros Impares: ");
		boolean checkImpares = false;
		for (int i = 0; i < miArray.length; i++) {
			/*
			 * para saber si el numero es impar lo divido entre dos los valores dados en el
			 * array, con este bucle los recorrera todos los dados
			 */
			if (miArray[i] % 2 != 0) {
				System.out.println(miArray[i]);
				checkImpares = true;
			}
		}
		/*
		 * sino hay numero impares lo indicare como control para saber que le programa
		 * lo lee correctamente
		 */
		if (!checkImpares) {
			System.out.println("No se ingresaron numeros impares!");
		}

		// mostrando enunciado
		System.out.println("Dirijase a la grada: ");
		for (int i = 0; i < miArray.length; i++) {
			if (miArray[i] % 2 == 0) {
				System.out.print(PAR);
			} else {
				System.out.print(IMPAR);
			}
		}

	}
}