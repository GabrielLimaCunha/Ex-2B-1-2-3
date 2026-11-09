public class Ex04 {
    public static void main(String[] args) {
        System.out.println("Contar pares");
        System.out.println("Digite os 6 numeros inteiros da matriz 2x3 (2 linhas e 3 colunas)");
        System.out.println();
        int[][] m = new int[2][3];
        int pares = 0;

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                m[i][j] = Integer.parseInt(IO.readln("Posicao [" + i + "][" + j + "]: "));
                if (m[i][j] % 2 == 0) {
                    pares++;
                }
            }
        }
        System.out.println();
        System.out.println("Quantidade de pares: " + pares);
    }
}
