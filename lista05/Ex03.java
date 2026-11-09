import java.util.Scanner;

public class Ex03 {
    public static boolean ehPrimo(int numero) {
        if (numero < 2) {
            return false;
        }
        for (int i = 2; i * i <= numero; i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static int contarPrimos(int[] v) {
        int contador = 0;
        for (int i = 0; i < v.length; i++) {
            if (ehPrimo(v[i])) {
                contador++;
            }
        }
        return contador;
    }
    public static void exibirPrimos(int[] v) {
        System.out.print("Primos: ");
        for (int i = 0; i < v.length; i++) {
            if (ehPrimo(v[i])) {
                System.out.print(v[i] + " ");
            }
        }
        System.out.println();
    }
    public static void main(String[] args) {
        System.out.println("Numeros primos");
        System.out.println("Digite 8 numeros inteiros");
        System.out.println();
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[8];

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Numero " + (i + 1) + ": ");
            numeros[i] = sc.nextInt();
        }
        System.out.println();
        exibirPrimos(numeros);
        System.out.println("Quantidade de primos encontrados: " + contarPrimos(numeros));
        sc.close();
    }
}
