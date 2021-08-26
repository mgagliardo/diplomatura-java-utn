import java.util.Scanner;

public class AlternativaMultiple {
    public static void main(String[] args) {
        System.out.println ("Ingrese un numero del 1 al 7: ");
        Scanner input = new Scanner(System.in);
        int numeroIntroducido = input.nextInt();
        input.close();
        String diaElegido = "";

        switch(numeroIntroducido) {
            case 1:
                diaElegido = "Lunes";
                break;

            case 2:
                diaElegido = "Martes";
                break;

            case 3:
                diaElegido = "Mirecoles";
                break;

            case 4:
                diaElegido = "Jueves";
                break;
        
            case 5:
                diaElegido = "Viernes";
                break;
        
            case 6:
                diaElegido = "Sabado";
                break;
        
            case 7:
                diaElegido = "Domingo";
                break;
        
            default:
                System.out.println("Se ingreso un numero incorrecto, por favor elija uno del 1 al 7");
                break;
        }

        if (diaElegido != "") {
            System.out.println("El dia elegido fue " + diaElegido + ".");
        }
    }
}
