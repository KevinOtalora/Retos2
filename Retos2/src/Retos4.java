public class Retos4 {
    public static void main(String[] args) {
        char[][] matriz = new char[5][4];

        matriz[0] = new char[] {' ', ' ', ' ', ' '};
        matriz[1] = new char[] {'7', '8', '9', '/'};
        matriz[2] = new char[] {'4', '5', '6', '*'};
        matriz[3] = new char[] {'1', '2', '3', '-'};
        matriz[4] = new char[] {'0', 'C', '=', '+'};

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}
