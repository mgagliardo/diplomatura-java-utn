import java.util.Scanner;

public class EsPar {
    public static void main(String[] args) {
        System.out.println ("Ingrese un numero: ");

        Scanner input = new Scanner(System.in);
        int numeroIntroducido = input.nextInt();
        input.close()

        if (numeroIntroducido % 2 == 0) {
            System.out.println("El numero ingresado es par.");
        }
        else {
            System.out.println("El numero ingresado no es par.");
        }
    }
}
