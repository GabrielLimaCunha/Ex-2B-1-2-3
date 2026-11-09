import java.util.Scanner;

public class Ex10 {
    public static int fibonacci(int n) {
        if (n == 0) {
            return 0; 
        }
        if (n == 1) {
            return 1;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
    public static int somar(int[] v) {
        int soma = 0;
        for (int i = 0; i < v.length; i++) {
            soma += v[i];
        }
        return soma;
    }
    public static void exibir(int[] v) {
        for (int i = 0; i < v.length; i++) {
            System.out.print(v[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        System.out.println("Sequencia de Fibonacci");
        System.out.println("Digite quantos termos quer ver (de 1 a 30)");
        System.out.println();

        Scanner sc = new Scanner(System.in);
        System.out.print("N: ");
        int n = sc.nextInt();
        if (n < 1 || n > 30) {
            System.out.println("Quantidade invalida, praque tanto.");
            sc.close();
            return;
        }
        int[] sequencia = new int[n];
        for (int i = 0; i < n; i++) {
            sequencia[i] = fibonacci(i);
        }
        System.out.println();
        exibir(sequencia);
        System.out.println("Soma: " + somar(sequencia));
        sc.close();
    }
}
