public class Ex05 {
    public static void main(String[] args) {
        System.out.println("Diagonal principal");
        System.out.println("Digite os 9 numeros inteiros da matriz 3x3");
        System.out.println();
        int[][] m = new int[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                m[i][j] = Integer.parseInt(IO.readln("Posicao [" + i + "][" + j + "]: "));
            }
        }
        System.out.println();
        System.out.print("Diagonal principal: ");
        for (int i = 0; i < 3; i++) {
            System.out.print(m[i][i] + " ");
        }
        System.out.println();
    }
}
