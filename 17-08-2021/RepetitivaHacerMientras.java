import java.util.Scanner;

public class RepetitivaMientras {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String opcion = "si";

        do {
            System.out.println("Ingrese el número del cual desea conocer la tabla de multiplicacion: ");
            int numero = input.nextInt();
            System.out.println("Ingrese el numero hasta donde desea conocer la tabla: ");
            int numeroTope = input.nextInt();
            int i = 1;
            int tabla = 0;
            do {
                tabla = numero * i;
                System.out.println(tabla);
                i++;
            } while(numeroTope > tabla);
            System.out.println("Desea imprimir otra tabla? Ingrese Si o No: ");
            opcion = input.next().toLowerCase();
        } while(opcion.equals("si"));
        input.close();
    }
}
