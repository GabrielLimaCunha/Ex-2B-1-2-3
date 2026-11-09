import java.util.Scanner;

public class Ex07 {
    public static String gerarIniciais(String nomeCompleto) {
        String[] partes = nomeCompleto.trim().split(" ");
        String iniciais = "";
        for (int i = 0; i < partes.length; i++) {
            if (partes[i].length() > 0) { 
                char letra = partes[i].charAt(0);
                iniciais += String.valueOf(letra).toUpperCase() + ".";
            }
        }
        return iniciais;
    }
    public static void exibirChamada(String[] nomes) {
        for (int i = 0; i < nomes.length; i++) {
            System.out.println((i + 1) + ". " + nomes[i].trim() + " (" + gerarIniciais(nomes[i]) + ")");
        }
    }
    public static void main(String[] args) {
        System.out.println("Lista de chamada");
        System.out.println("Digite o nome completo de 4 alunos");
        System.out.println();
        Scanner sc = new Scanner(System.in);
        String[] nomes = new String[4];
        for (int i = 0; i < nomes.length; i++) {
            System.out.print("Nome do aluno " + (i + 1) + ": ");
            nomes[i] = sc.nextLine();
        }
        System.out.println();
        exibirChamada(nomes);
        sc.close();
    }
}
