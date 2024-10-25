/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ud02Ejemplos;

import java.util.Scanner;

/**
 *
 * @author andres
 * 
 * Enunciado
 * El cálculo de la letra del Documento Nacional de Identidad (DNI) es un proceso matemático sencillo que se basa en obtener el resto de la división entera del número de DNI y el número 23.
 * A partir del resto de la división, se obtiene la letra seleccionándola dentro de un array de letras.
 * El array de letras es:
 * letra = ['T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E', 'T'];
 * Por tanto si el resto de la división es 0, la letra del DNI es la T y si el resto es 3 la letra es la A.
 * Con estos datos, elaborar un pequeño programa que:
 * Almacene en una variable entera el número de DNI indicado por el usuario y muestre su letra del DNI.
 */
public class Ejercicio029930DNI {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    char[] letra = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E', 'T'};
    Scanner teclado = new Scanner( System.in );
    String cadenaAuxiliar;
    int nroDNI;
    
    System.out.print("Introduce tu DNI (sin letra) : ");
    cadenaAuxiliar = teclado.nextLine(); 
    nroDNI = Integer.parseInt(cadenaAuxiliar);
    char letraDNI;
    int resto = nroDNI % 23;
    letraDNI = letra[resto];
    System.out.println("Tu DNI es " + nroDNI + " y la Letra es : " + letraDNI);
    
  }
}