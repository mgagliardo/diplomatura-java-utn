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
