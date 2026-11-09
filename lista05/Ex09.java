import java.util.Scanner;

public class Ex09 {
    public static long potencia(int base, int expoente) {
        if (expoente == 0) {
            return 1;
        }
        return base * potencia(base, expoente - 1);
    }
    public static void exibirPotencias(int[] bases, int expoente) {
        for (int i = 0; i < bases.length; i++) {
            System.out.println(bases[i] + "^" + expoente + " = " + potencia(bases[i], expoente));
        }
    }
    public static void main(String[] args) {
        System.out.println("Potencia recursiva");
        System.out.println("Primeiro digite o expoente (0 ou maior).");
        System.out.println("Depois digite 5 bases");
        System.out.println();
        Scanner sc = new Scanner(System.in);
        System.out.print("Expoente: ");
        int expoente = sc.nextInt();
        while (expoente < 0) {
            System.out.print("Expoente negativo. Digite de novo: ");
            expoente = sc.nextInt();
        }
        int[] bases = new int[5];
        for (int i = 0; i < bases.length; i++) {
            System.out.print("Base " + (i + 1) + ": ");
            bases[i] = sc.nextInt();
        }
        System.out.println();
        exibirPotencias(bases, expoente);
        sc.close();
    }
}
