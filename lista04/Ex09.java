import java.util.Scanner;

public class Ex09 {
    public static void main(String[] args) {
        System.out.println("Busca de produto");
        System.out.println("Digite o codigo do produto para ver o preco.");
        System.out.println("Codigos cadastrados: 101, 205, 310, 420 e 550.");
        System.out.println();
        Scanner sc = new Scanner(System.in);
        int[] codigos = {101, 205, 310, 420, 550};
        double[] precos = {4.50, 12.00, 7.90, 25.00, 3.20};
        System.out.print("Codigo do produto: ");
        int codigo = sc.nextInt();

        int posicao = -1;
        for (int i = 0; i < codigos.length; i++) {
            if (codigos[i] == codigo) {
                posicao = i;
                break;
            }
        }
        if (posicao != -1) {
            System.out.printf("Preco: R$ %.2f%n", precos[posicao]);
        } else {
            System.out.println("Produto nao encontrado.");
        }
        sc.close();
    }
}
