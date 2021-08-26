public class Fibonacci {
    public static void main(String[] args) {
        int contadorFibo = 10;
        int fibo = 0;
        int i = 1;
        int j = 1;
        System.out.println("Calculando primeras " + contadorFibo + " secuencias de Fibonacci");
        while (contadorFibo > 0) {
            System.out.println("Fibonacci: " + fibo);
            fibo += j;
            j = i;
            i = fibo;
            contadorFibo--;
        }
  }
}
