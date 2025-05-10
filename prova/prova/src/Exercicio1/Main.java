package Exercicio1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Estacionamento e = new Estacionamento();
        double taxa=5.0, taxa2=3.0, total=0.0;
        int horasex=0;
        System.out.println("digite as horas que o seu carro ficou estacionado\n(o valor da taxa é de 3R$ por hora e 5R$ fixo): ");
        horasex = sc.nextInt();
        System.out.println(e.calcular(taxa2, taxa, horasex));
    }

}
