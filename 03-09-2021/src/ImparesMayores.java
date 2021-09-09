import java.util.concurrent.ThreadLocalRandom;

// 14. De una serie de 20 valores, se quiere saber cuántos cumplen con la condición de ser impares mayores que cincuenta y menores que cien.

public class ImparesMayores {
    public static void main(String[] args) {
        int maxElements = 20;
        int min = 1;
        int max = 200;
        int[] array = new int[50];

        // Lleno el array
        for (int i = 0; i < maxElements; i++) {
            array[i] = ThreadLocalRandom.current().nextInt(min, max + 1);
        }

        // Recorro el array y verifico
        for (int i = 0; i < maxElements; i++) {
            if (array[i] % 2 != 0 && array[i] > 50 && array[i] < 100) {
                System.out.println("El numero " + array[i] + " cumple con la condicion");
            } else {
                System.out.println("El numero " + array[i] + " no cumple con la condicion");
            }
        }
    }
}
