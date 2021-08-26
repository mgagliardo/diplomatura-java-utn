import java.util.Scanner;

public class AlternativaDoble {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.println ("Ingrese monto de la compra: ");
        double monto = input.nextDouble();
        System.out.println ("Ingrese tipo de pago: ");
        String tipoDePago = input.next();
        input.close();

        if (tipoDePago.equals("contado")) {
            monto = monto * 0.9;
        } else {
            System.out.println("No hay un descuento para el tipo de pago seleccionado.");
        }

        System.out.println("El pago final es de: $" + monto);
    }
}
