public class MyClass {
    public static void main(String args[]) {
        int contador_fibo = 10;
        int fibo = 0;
        int i = 1;
        int j = 1;
        System.out.println("Calculando primeras " + contador_fibo + " secuencias de Fibonacci");
        while (contador_fibo > 0) {
            System.out.println("Fibonacci: " + fibo);
            fibo += j;
            j = i;
            i = fibo;
            contador_fibo--;
        }
  }
}
