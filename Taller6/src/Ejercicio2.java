/***
 * Clasificación de un triángulo Dado tres valores que representan las 
 * longitudes de los lados de un triángulo, determinar su tipo. Las reglas
 * son:

 * Si todos los lados son iguales, mostrar "Triángulo equilátero".
 * Si dos lados son iguales, mostrar "Triángulo isósceles".
 * Si todos los lados son diferentes, mostrar "Triángulo escaleno".
 * Si la suma de dos lados no es mayor que el tercer lado, mostrar "No es un 
 * triángulo".
 */
import java.util.Scanner;


public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        
        System.out.print("Ingrese el lado 1: ");
        double lado1 = tcl.nextDouble();

        System.out.print("Ingrese el lado 2: ");
        double lado2 = tcl.nextDouble();

        System.out.print("Ingrese el lado 3: ");
        double lado3 = tcl.nextDouble();
        
        if ((lado1 + lado2 > lado3) && (lado1 + lado3 > lado2) && (lado2 + lado3 > lado1)) {
            if (lado1 == lado2 && lado2 == lado3) {
                System.out.println("Triangulo equilatero");
            } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
                System.out.println("Triangulo isosceles");
            } else {
                System.out.println("Triangulo escaleno");
            }
        } else {
            System.out.println("No es un triangulo");
        }
    }
        }
/***
 * Ingrese el lado 1: 5
 * Ingrese el lado 2: 5
 * Ingrese el lado 3: 10
 * No es un triangulo
 */