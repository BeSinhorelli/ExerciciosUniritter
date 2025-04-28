public class Matriz {
    int [][] m = new int[4][4];
    public Matriz() {

    }
    public int somad(int[][]matriz, int l, int c) {
        int diagonal1 = 0;
        for (l = 0; l < matriz.length; l++) {
            for (c = 0; c < matriz.length; c++) {
                if (l == c) {
                    diagonal1 += matriz[l][c];
                }
            }
        }
        return diagonal1;
    }
    public String imprimir(int[][] matriz, int l, int c) {
        String msg="";
        for (l = 0; l < matriz.length; l++) {
            for (c = 0; c < matriz.length; c++) {
                msg += matriz[l][c] + " | ";
            }
            msg += "\n";
        }
        return msg;
    }
}

