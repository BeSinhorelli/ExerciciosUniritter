import java.util.Scanner;

//A103) (1,5 ptos) Escreva um programa que leia um valor inteiro, calcule e mostre o seu fatorial. Fatorial
//de um número natural n, representado por n!, é o produto de todos os inteiros positivos menores ou
//iguais a n. Exemplo: 3! = 6, ou seja, 1 x 2 x 3 = 6.
public class Main {
    public static void main(String[] args) {
        int n = 0, n1=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("digite um numero: ");
        n = sc.nextInt();
        n1 = n ;
        do{
            n1 = n1 *(n-1);
            n--;
        } while (n > 1);
        System.out.println("Fatorial: " + n1);
    }
}