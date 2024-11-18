/***
 * Costo de envío de paquetes Un servicio de envío cobra diferentes tarifas
 * según la región y el peso del paquete. Si el peso es menor de 5 kg y la 
 * región es "local", el costo es de $5. Si pesa entre 5 y 10 kg, el costo es 
 * de $10 para la región "nacional". Para cualquier otro caso, el costo es de
 * $15.
 */
import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        
        System.out.print("Ingrese el peso del paquete en kg: ");
        double peso = tcl.nextDouble();

        System.out.print("Ingrese la region (local/nacional): ");
        String region = tcl.next();
        
        double costoEnvio;

        if (peso < 5 && region.equals("local")) {
            costoEnvio = 5.0;
        } else if (peso >= 5 && peso <= 10 && region.equals("nacional")) {
            costoEnvio = 10.0;
        } else {
            costoEnvio = 15.0;
        }
        System.out.println("El costo de envio es: $" + costoEnvio);
    }
}
/***
 *Ingrese el peso del paquete en kg: 10
 *Ingrese la region (local/nacional): local 
 * El costo de envio es: $15.0 
 */