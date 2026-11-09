import java.util.Scanner;

public class Ex05 {
    public static String paraBinario(int n) {
        if (n == 0) {
            return "0";
        }
        String binario = "";
        while (n > 0) {
            binario = (n % 2) + binario; 
            n = n / 2;
        }
        return binario;
    }
    public static void exibirTabela(int[] v) {
        for (int i = 0; i < v.length; i++) {
            System.out.println(v[i] + " = " + paraBinario(v[i]));
        }
    }
    public static void main(String[] args) {
        System.out.println("Decimal para binario");
        System.out.println("Digite 5 numeros inteiros nao negativos");
        System.out.println();
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[5];

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Numero " + (i + 1) + ": ");
            numeros[i] = sc.nextInt();
            while (numeros[i] < 0) {
                System.out.print("Numero negativo. NAO USE NEGATIVOS, digite denovo: ");
                numeros[i] = sc.nextInt();
            }
        }
        System.out.println();
        exibirTabela(numeros);
        sc.close();
    }
}
