
import java.util.Scanner;


/** *
 * Determinar el tipo de operación matemática. Dado un número del 1 al 4 que}
 * representa una operación matemática básica (suma, resta, multiplicación,
 * división), muestra el nombre de la operación correspondiente. Por ejemplo,
 * si el usuario ingresa 1, debe mostrar "Suma"; si ingresa 2, debe mostrar
 * "Resta", y así sucesivamente.
 *
 * @author Juan Jose Calva
 */
public class Ejercicio5 {

    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);

        System.out.print("Ingrese un numero del 1 al 4 para obtener la operacion correspondiente: ");
        int numeroOperacion = tcl.nextInt();

        String nombreOperacion;
        switch (numeroOperacion) {
            case 1:
                nombreOperacion = "Suma";
                break;
            case 2:
                nombreOperacion = "Resta";
                break;
            case 3:
                nombreOperacion = "Multiplicacion";
                break;
            case 4:
                nombreOperacion = "Division";
                break;
            default:
                nombreOperacion = "Numero de operacion invalido. Debe ser entre 1 y 4.";
        }
        System.out.println("La operacion correspondiente es: " + nombreOperacion);
    }
}
/***
 * Ingrese un numero del 1 al 4 para obtener la operacion correspondiente: 3
 * La operacion correspondiente es: Multiplicacion
 */