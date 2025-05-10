package Exercicio3;

import java.util.Scanner;
//A103) (1,5 ptos) Escreva um programa que leia dois números inteiros: um número base e
//um limite superior. Mostre todos os múltiplos do número base que são menores
//ou iguais ao limite.
//Ex: base = 4, limite = 20 Saída: 4 8 12 16 20 →
//Bonificação: classe Multiplos com um método mostrarMultiplos(int base, int
//limite)
public class Main {
    public static void main(String[] args) {
        int n1=0, n2=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("digite um numero base: ");
        n1 = sc.nextInt();
        sc.nextLine();
        System.out.println("digite um limite: ");
        n2 = sc.nextInt();
        //System.out.println(m.mostrarNumeros(n1,n2));
        String msg="";
        int div;
        int n3 = n2;
        int n4 = n1;
        System.out.print("multiplos: \n");
        int j=1;
        for( int i=n4; i < n3; i++){
            if(n2 % j == 0){
                System.out.print(j + " | ");
            }
            j++;
        }
    }
}
