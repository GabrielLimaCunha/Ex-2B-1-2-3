public class Ex01 {
    public static void main(String[] args) {
        System.out.println("Ler e mostrar a matriz 3x3");
        System.out.println("Digite os 9 numeros inteiros da matriz");
        System.out.println();
        int[][] m = new int[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                m[i][j] = Integer.parseInt(IO.readln("Posicao [" + i + "][" + j + "]: "));
            }
        }
        System.out.println();
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(m[i][j] + " ");
            }
            System.out.println();
        }
    }
}
