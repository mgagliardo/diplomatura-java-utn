// Diseñar  un  algoritmo  que  permita  aplicar  un  
// descuento  del  10%  al monto total de una compra si laforma de pago empleada es de contado.
// El usuario deberáingresar el monto de la compra realizada yla forma de pago utilizada.
// Si es contado, deberáaplicar el descuento, sino se deberámostrar unmensaje informando que para dicha forma de pago no tiene descuento.

import java.util.Scanner;

public class EsPar {
    public static void main(String args[]) {

        Scanner input = new Scanner(System.in);
        System.out.println ("Ingrese cantidad de bancos en el aula: ");
        int bancosIntroducidos = input.nextInt();

        System.out.println ("Ingrese cantidad de alumnos inscriptos: ");
        int alumnosInscriptos = input.nextInt();
        input.close();

        int alcanzan = alumnosInscriptos - bancosIntroducidos;

        if (alcanzan > 0) {
            System.out.println("a cantidad de bancos faltantes es: " + alcanzan);
        }
        else {
            System.out.println("os bancos del aula son suficientes");
        }
    }
}
