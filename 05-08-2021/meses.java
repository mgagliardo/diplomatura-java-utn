// Programa que tome un input (del 1 al 12) e imprima el mes correspondiente en pantalla

import java.util.Scanner;

public class MyClass {
    public static void main(String args[]) {


        System.out.println ("Ingrese un mes (de 1 a 12): ");

        String mesElegido = "";
        Scanner input = new Scanner(System.in);
        int mesIntroducido = input.nextInt();

        switch(mesIntroducido) {
            case 1:
                mesElegido = "Enero";
                break;

            case 2:
                mesElegido = "Febrero";
                break;

            case 3:
                mesElegido = "Marzo";
                break;

            case 4:
                mesElegido = "Abril";
                break;
        
            case 5:
                mesElegido = "Mayo";
                break;
        
            case 6:
                mesElegido = "Junio";
                break;
        
            case 7:
                mesElegido = "Julio";
                break;
        
            case 8:
                mesElegido = "Agosto";
                break;
        
            case 9:
                mesElegido = "Septiembre";
                break;
        
            case 10:
                mesElegido = "Octubre";
                break;
        
            case 11:
                mesElegido = "Noviembre";
                break;
        
            case 12:
                mesElegido = "Diciembre";
                break;
        
            default:
                System.out.println("Ingrese un mes correcto, del 1 al 12");
                break;
        }
      
      System.out.println("El mes introducido fue " + mesElegido + ".");
      
    }
}
