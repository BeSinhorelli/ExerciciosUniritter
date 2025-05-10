package Exercicio5;

import java.util.ArrayList;
import java.util.Scanner;

//A105) (1,5 ptos) Verifique se um número é perfeito. Um número é perfeito quando a
//soma de seus divisores próprios (excluindo ele mesmo) é igual ao próprio
//número. Ex: 6 divisores: 1, 2, 3 1 + 2 + 3 = 6 número perfeito → → →
//Bonificação: classe NumeroPerfeito com método boolean ehPerfeito(int n)
public class Main {
    public static void main(String[] args) {
        int n=0, div=0, n1=0;
        int soma=0;
        String st="";
        Scanner sc = new Scanner(System.in);
        System.out.println("digite um numero: ");
        n = sc.nextInt();
        sc.nextLine();
        NumeroPerfeito np = new NumeroPerfeito();
        System.out.println(np.numeroPerfeito(n));
    }
}
