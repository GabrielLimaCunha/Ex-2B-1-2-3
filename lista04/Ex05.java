import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        System.out.println("Desconto de 10%");
        System.out.println("Digite o preco de 5 produtos");
        System.out.println("Use VIRGULA nos decimais (exemplo: 12,90).");
        System.out.println();
        Scanner sc = new Scanner(System.in);
        double[] precos = new double[5];
        double[] comDesconto = new double[precos.length];
        for (int i = 0; i < precos.length; i++) {
            System.out.print("Preço do produto " + (i + 1) + ": ");
            precos[i] = sc.nextDouble();
            comDesconto[i] = precos[i] * 0.90;
        }
        for (int i = 0; i < precos.length; i++) {
            System.out.printf("Produto %d: original R$ %.2f | com desconto R$ %.2f%n",
                    i + 1, precos[i], comDesconto[i]);
        }
        sc.close();
    }
}
