package Exercicio2;

import java.util.Scanner;

//A102) (1,0 ponto) O Índice de Massa Corporal (IMC) é calculado usando a fórmula:
// IMC = peso / (altura)2
//. Ex: peso = 70, altura = 1.75 IMC = 22.86 →
//Faça um programa que leia o peso, a altura e o sexo da pessoa (M para
//masculino, F para feminino) e retorne uma String indicando a condição
//corporal, conforme as tabelas abaixo:
//Condição Masculina Feminima
//Abaixo do peso Abaixo de 20 Abaixo de 19
//Normal 20 a 24,9 19 a 23,9
//Sobrepeso 25 a 29,9 24 a 28,9
//Obesidade 30 a 39,9 29 a 38,9
//Obesidade Mórbida 40 ou mais 39 ou mais
//Bonificação: classe CalculadoraIMC com método String classificarIMC(double peso,
//double altura, char sexo)
public class Main {
    public static void main(String[] args) {
        double peso=0.0, altura=0.0;
        String sexo="";
        int s=0;
        IMC imc = new IMC();
        Scanner sc = new Scanner(System.in);
        System.out.println("digite o seu peso: ");
        peso = sc.nextDouble();
        sc.nextLine();
        System.out.println("digite a sua altura: ");
        altura = sc.nextDouble();
        sc.nextLine();
        do {
            System.out.println("digite o seu sexo: \n1-M\n2-F\nescreva: ");
           s = sc.nextInt();
           sc.nextLine();
        }while (s != 1 && s != 2);
        if(s == 1){
            sexo = "m";
        }else if(s == 2){
            sexo = "f";
        }
        System.out.println("condicao: " + imc.calcularIMC(peso, altura, sexo));
    }
}
