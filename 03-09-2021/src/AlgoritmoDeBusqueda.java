import java.util.Arrays;

public class AlgoritmoDeBusqueda {
    public static void main(String[] args) {
        int[] miArray = {50, 20, 30, 60, 10, 80};
        System.out.println("El array desordenado es es: " + Arrays.toString(miArray));
        bubbleSort(miArray);
        System.out.println("El array ordenado es es: " + Arrays.toString(miArray));
    }

    public static void bubbleSort(int[] array) {
        int tmp;
        int arrayLength = array.length;
        for (int i = 0; i < arrayLength - 1; i++) {
            for (int j = 0; j < arrayLength - i - 1; j++) {
                if (array[j] > array[j+1]) {
                    tmp = array[j];
                    array[j] = array[j + 1];
                    array[j+1] = tmp;
                }
            }
        }
    } 
}
