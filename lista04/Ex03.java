import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        System.out.println("Media do aluno");
        System.out.println("Digite as 4 notas do aluno");
        System.out.println("Use VIRGULA nos decimais (exemplo: 7,5).");
        System.out.println();
        Scanner sc = new Scanner(System.in);
        double[] notas = new double[4];
        double soma = 0;
        for (int i = 0; i < notas.length; i++) {
            System.out.print("Nota " + (i + 1) + ": ");
            notas[i] = sc.nextDouble();
            soma += notas[i];
        }
        double media = soma / notas.length;
        System.out.printf("Media: %.2f%n", media);
        if (media >= 6) {
            System.out.println("Situations: aprovado");
        } else {
            System.out.println("Situations: reprovado");
        }
        sc.close();
    }
}
