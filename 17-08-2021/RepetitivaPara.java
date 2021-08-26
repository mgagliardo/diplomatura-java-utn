import java.util.Scanner;

public class RepetitivaMientras {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double sum = 0.0;
        for(int i = 0; i < 4; i++) {
            System.out.println("Ingrese un numero: ");
            double numero = (double) input.nextInt();
            sum = sum + numero;
        }
        input.close();
        System.out.println("El promedio de los 4 numeros ingresados es: " + sum / 4);
    }
}
