public class PromedioArrayInt {
    public static void main(String[] args) {
        int[] miArray = {10, 20, 30, 40, 50};
        int sum = 0;
        for(int i = 0; i < miArray.length; i++) {
            sum = sum + miArray[i];
        }
        System.out.println("El promedio de los numeros del array es: " + sum / miArray.length);
    }
}
