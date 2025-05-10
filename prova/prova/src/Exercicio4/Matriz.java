package Exercicio4;

public class Matriz {
    public Matriz() {

    }
    public double media(int[][]matriz, int l, int c) {
        double media = 0;
        int soma=0, cont=0;
        for (l = 0; l < matriz.length; l++) {
            for (c = 0; c < matriz.length; c++) {
                soma = soma + matriz[l][c];
                cont++;
            }
        }
        media = soma / cont;
        return media;
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
