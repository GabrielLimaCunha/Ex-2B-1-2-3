import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        System.out.println("Total da compra");
        System.out.println("Digite o preco de 5 produtos, um por vez, e aperte Enter apos cada um.");
        System.out.println("Use virgula nos decimais (exemplo: 12,90).");
        System.out.println();
        Scanner sc = new Scanner(System.in);
        double[] precos = new double[5];
        double total = 0;
        for (int i = 0; i < precos.length; i++) {
            System.out.print("Preco do produto " + (i + 1) + ": ");
            precos[i] = sc.nextDouble();
            total += precos[i];
        }
        System.out.println("Precos lidos:");
        for (int i = 0; i < precos.length; i++) {
            System.out.printf("Produto %d: R$ %.2f%n", i + 1, precos[i]);
        }
        System.out.printf("Total da compra: R$ %.2f%n", total);
        sc.close();
    }
}
