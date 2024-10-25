package ud02Ejemplos;
/**
 *
 * @author andres
 * Enunciado :
 * Hacer un programa que almacene los datos de una familia del Padre, la madre, el hijo mayor y la hija utilizando arrays.
 * Inicializar los datos dentro del programa, de acuerdo a su tipo y visualizarlos de manera directa (print) y con formato (printf)
 * Considerar El nombre completo, edad, altura y DNI.
 */
public class Ejercicio029920Arrays {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    //Declaración en dos pasos
    String [] nombre;      // Declaración del array.
    nombre = new String[4]; //Creación del array reservando para el un espacio en memoria.
    //Declaración en un paso.
    int[] edad = new int[4]; // Declaración y creación en un mismo lugar.
    double[] altura = new double[4];
    String[] dni = new String[4];

    //Datos del padre==========================
    nombre[0] = "Juan Perez Jimenez"; edad[0] = 40; altura[0] = 1.78; dni[0]="08970223H";
    //Resto datos
    nombre[1] = "Maria López López"; edad[1] = 34; altura[1] = 1.65; dni[1]="08972334T";
    nombre[2] = "José Pérez López";  edad[2] = 12; altura[2] = 1.60; dni[2]="08876544K";
    nombre[3] = "Maria Pérez López"; edad[3] = 8;  altura[3] = 1.41; dni[3]="";

    //Salida sin formato========================
    System.out.println("Datos sin Formato======================================");
    System.out.println(nombre[0] + " " + edad[0] + " " + altura[0] + " " + dni[0]);
    System.out.println(nombre[1] + " " + edad[1] + " " + altura[1] + " " + dni[1]);
    System.out.println(nombre[2] + " " + edad[2] + " " + altura[2] + " " + dni[2]);
    System.out.println(nombre[3] + " " + edad[3] + " " + altura[3] + " " + dni[3]);

    //Salida con formato========================
    System.out.println("Datos con Formato======================================");
    System.out.printf("%20s %2d %4.2f %9s \n", nombre[0], edad[0], altura[0], dni[0] );
    System.out.printf("%20s %2d %4.2f %9s \n", nombre[1], edad[1], altura[1], dni[1] );
    System.out.printf("%20s %2d %4.2f %9s \n", nombre[2], edad[2], altura[2], dni[2] );
    System.out.printf("%20s %2d %4.2f %9s \n", nombre[3], edad[3], altura[3], dni[3] );
    //Salida con definición del formato común
    System.out.println("Datos con Formato Común================================");
    String formato = "%20s %2d años %4.2fm. DNI : %9s \n";
    System.out.printf( formato, nombre[0], edad[0], altura[0], dni[0] );
    System.out.printf( formato, nombre[1], edad[1], altura[0], dni[1] );
    System.out.printf( formato, nombre[2], edad[2], altura[0], dni[2] );
    System.out.printf( formato, nombre[3], edad[3], altura[0], dni[3] );
  }
}