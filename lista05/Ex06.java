import java.util.Scanner;

public class Ex06 {
    public static int contarVogais(String texto) {
        String minusculo = texto.toLowerCase();
        int contador = 0;
        for (int i = 0; i < minusculo.length(); i++) {
            char c = minusculo.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                contador++;
            }
        }
        return contador;
    }
    public static void exibirContagem(String[] frases) {
        int indiceMaior = 0;
        for (int i = 0; i < frases.length; i++) {
            int vogais = contarVogais(frases[i]);
            System.out.println("Frase " + (i + 1) + ": \"" + frases[i] + "\" - " + vogais + " vogais");
            if (vogais > contarVogais(frases[indiceMaior])) {
                indiceMaior = i;
            }
        }
        System.out.println("Frase com mais vogais: \"" + frases[indiceMaior] + "\"");
    }
    public static void main(String[] args) {
        System.out.println("Contagem de vogais");
        System.out.println("Digite 3 frases");
        System.out.println();
        Scanner sc = new Scanner(System.in);
        String[] frases = new String[3];
        for (int i = 0; i < frases.length; i++) {
            System.out.print("Frase " + (i + 1) + ": ");
            frases[i] = sc.nextLine();
        }
        System.out.println();
        exibirContagem(frases);
        sc.close();
    }
}
