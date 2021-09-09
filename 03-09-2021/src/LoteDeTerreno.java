import java.util.Scanner;

// 1. Si un lote de terreno tiene X metros de frente por Y metros de fondo:
// calcular e imprimir la cantidad de metros de alambre para cercarlo (X e Y serán leídos al comenzar el programa). 

public class LoteDeTerreno {
    public static void main(String[] args) {
        System.out.println ("Ingrese los metros de frente del terreno: ");
        Scanner input = new Scanner(System.in);
        double frente = (double) input.nextInt();

        System.out.println ("Ingrese los metros de fondo del terreno: ");
        double fondo = (double) input.nextInt();
        input.close();

        double metrosDeAlambre = frente * 2 + fondo * 2;
        System.out.println ("Se necesitan " + metrosDeAlambre + " metros de alambre para cercar el terreno son");
    }
}
