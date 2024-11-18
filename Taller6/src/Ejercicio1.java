/***
 * Facturación de 2 productos: La empresa Amazon.com le contrata como
 * desarrollador de Sistemas Informáticos para programar su sistema de compras 
 * online, el cual calcule el precio total de la compra para un cliente. Para 
 * ello, se necesita utilizar estructuras secuenciales y de selección 
 * (if simple, doble y/o anidadas), sin aplicar ciclos repetitivos.

 * Requisitos:

 * La empresa inicialmente venderá solo 2 tipos de productos distintos, a costos
 * variantes.
 * Al costo total de la factura, se debe incluir los gastos por concepto de 
 * transporte/envío del paquete, del cual no se aplican ningún tipo de descuentos
 * o impuestos dada la excepción descrita en el punto 3.b.
 * El objetivo es presentar al usuario los detalles de su compra: costos, 
 * impuestos, descuentos, monto final dadas las siguientes condiciones: a. 
 * Si el subtotal de la compra (sin descuentos o gastos de envío), supera los
 * $1000, se le otorga un 20% de descuento; y si es al menos los $1000 el 
 * descuento es como mínimo 5%. b. Adicional, si la compra es mayor a $5000,
 * el envío será gratuito. c. El IVA del 10% se debe aplicar a todos los 
 * artículos antes de agregar cualquier tipo de descuesto o promoción.
 */
import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        double costopro1, costopro2, iva, costoenvio, descuento, subtotal, costofinal;
        System.out.print("Dame 2 costos: ");
        costopro1 = tcl.nextDouble();
        costopro2 = tcl.nextDouble();
        System.out.print("Dame el costo de envio: ");
        costoenvio = tcl.nextDouble();
        
        subtotal = costopro1 + costopro2;
        iva = subtotal * 0.10;
        subtotal += iva;
        
        if (subtotal > 1000) {
            descuento = subtotal * 0.20;
        } else if (subtotal == 1000) {
            descuento = subtotal * 0.05;
        } else {
            descuento = 0;
        }
        costofinal = subtotal - descuento;
        if (subtotal > 5000) {
            costoenvio = 0;
        }
        costofinal += costoenvio;
        System.out.println("Subtotal (con IVA): " + subtotal);
        System.out.println("Descuento aplicado: " + descuento);
        System.out.println("Costo de envio: " + costoenvio);
        System.out.println("Costo final a pagar: " + costofinal);
            }

        }
/***
 * Dame 2 costos: 1000 2000
 * Dame el costo de envio: 500
 * Subtotal (con IVA): 3300.0
 * Descuento aplicado: 660.0
 * Costo de envio: 500.0
 * Costo final a pagar: 3140.0
 */
