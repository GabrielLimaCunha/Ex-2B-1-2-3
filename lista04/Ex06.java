import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {
        System.out.println("Juros simples do emprestimo");
        System.out.println("Digite o valor do emprestimo e depois a taxa de juros mensal em porcentagem.");
        System.out.println("Exemplo: valor 1000 e taxa 2 (para 2% ao mes).");
        System.out.println();
        Scanner sc = new Scanner(System.in);
        System.out.print("Valor do emprestimo: ");
        double valor = sc.nextDouble();
        System.out.print("Taxa de juros mensal (%): ");
        double taxa = sc.nextDouble();
        double[] devido = new double[12];
        for (int mes = 1; mes <= devido.length; mes++) {
            devido[mes - 1] = valor + valor * taxa / 100 * mes;
        }
        for (int i = 0; i < devido.length; i++) {
            System.out.printf("Mês %d: R$ %.2f%n", i + 1, devido[i]);
        }
        sc.close();
    }
}
