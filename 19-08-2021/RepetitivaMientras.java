import java.util.Scanner;

public class RepetitivaMientras {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese el número del cual desea conocer la tabla de multiplicacion: ");
        int numero = input.nextInt();
        System.out.println("Ingrese el numero hasta donde desea conocer la tabla: ");
        int numeroTope = input.nextInt();
        input.close();
        int i = 1;
        int tabla = 0;

        while(numeroTope > tabla) {
            tabla = numero * i;
            System.out.println(tabla);
            i++;
        }
    }
}
