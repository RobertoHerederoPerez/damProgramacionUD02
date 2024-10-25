package tema02;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        // Creamos un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Pedimos al usuario que ingrese los cinco números de entrada
        System.out.println("Introduce cinco números de entrada separados por espacios:");

        // Leemos la línea completa de entrada
        String input = scanner.nextLine();

        // Dividimos la entrada en partes separadas por espacio y las guardamos en un array
        String[] numeros = input.split(" ");

        // Verificamos que el usuario ha ingresado exactamente cinco números
        if (numeros.length != 5) {
            System.out.println("Debes ingresar exactamente tres números.");
            return; // Termina el programa si no hay tres entradas
        }

        // Creamos un StringBuilder para almacenar la salida final
        StringBuilder resultado = new StringBuilder();

        // Recorremos cada número, verificamos si es par o impar y asignamos la grada correspondiente
        for (String num : numeros) {
            int numero = Integer.parseInt(num); // Convertimos el texto en número

            // Verificamos si el número es par o impar
            if (numero % 2 == 0) {
                resultado.append("VERDE "); // Si es par, va a la grada VERDE (Sur)
            } else {
                resultado.append("AZUL "); // Si es impar, va a la grada AZUL (Norte)
            }
        }

        // Eliminamos el último espacio sobrante y mostramos el resultado
        System.out.println(resultado.toString().trim());
    }
}
