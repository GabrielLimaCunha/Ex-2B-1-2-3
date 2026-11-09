public class Ex02 {
    public static void main(String[] args) {
        System.out.println("Soma de todos os elementos");
        System.out.println("Digite os 9 numeros inteiros da matriz 3x3");
        System.out.println();
        int[][] m = new int[3][3];
        int soma = 0;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                m[i][j] = Integer.parseInt(IO.readln("Posicao [" + i + "][" + j + "]: "));
                soma += m[i][j];
            }
        }
        System.out.println();
        System.out.println("Soma: " + soma);
    }
}
