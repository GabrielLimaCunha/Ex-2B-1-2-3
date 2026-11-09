public class Ex03 {
    public static void main(String[] args) {
        System.out.println("Maior valor da matriz");
        System.out.println("Digite os 9 numeros inteiros da matriz 3x3");
        System.out.println();
        int[][] m = new int[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                m[i][j] = Integer.parseInt(IO.readln("Posicao [" + i + "][" + j + "]: "));
            }
        }
        int maior = m[0][0];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (m[i][j] > maior) {
                    maior = m[i][j];
                }
            }
        }
        System.out.println();
        System.out.println("Maior valor: " + maior);
    }
}
