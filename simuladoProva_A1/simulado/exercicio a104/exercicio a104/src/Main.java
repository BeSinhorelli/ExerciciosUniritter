public class Main {
    public static void main(String[] args) {
        int[][] matriz = new int[7][7];
        int n=1;
        Matriz m = new Matriz();
        for(int l=0; l < 7; l++){
            for(int c =0; c < 7;c++){
                matriz[l][c] = (int) n;
                n++;
            }
        }
        System.out.print("Matriz:\n"+m.imprimir(matriz,7,7)+ "\nsoma diagonal principal: " +m.somad(matriz, 7, 7));
    }
}