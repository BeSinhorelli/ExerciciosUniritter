package Exercicio4;
//1,5 ptos) Escreva um algoritmo que leia ou preencha de qualquer forma uma
//matriz quadrada de terceira ordem M(3,3), 3 linhas e 3 colunas, e faça a média de
//todos os valores desta matriz. Depois de calculado mostre a média da matriz. A
//média é a soma de todos os elementos dividido pela quantidade de posições da
//matriz. Ex: matriz = {{1,2,3},{1,2,3},{1,2,3}} Total = 18, portanto a média é →
//18/9 = 2
//Bonificação: com a seguinte estrutura sugerida de classe
public class Main {
    public static void main(String[] args) {
        int[][] matriz = new int[3][3];
        int n = 1;
        Matriz m = new Matriz();
        for (int l = 0; l < 3; l++) {
            for (int c = 0; c < 3; c++) {
                matriz[l][c] = (int) n;
                n++;
            }
        }
        System.out.print("Matriz:\n" + m.imprimir(matriz, 3, 3) + "\nMedia: " + m.media(matriz, 3, 3));
    }
}