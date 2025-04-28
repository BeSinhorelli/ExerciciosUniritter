import java.util.Scanner;

//A102) (1,0 ponto) O IAC (Índice de Adiposidade Corporal) é uma fórmula que indica a condição de peso
//de um adulto. A fórmula para calcular o IAC é:
//Desenvolver um programa que leia a circunferência do quadril (cm), a altura (m) e o sexo. Calcule o
//IAC e escreva na tela a condição que o mesmo encontra-se, conforme a tabela abaixo: ((c / (a * Math.sqrt(a)) - 18)
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double c=0, a=0;
        int sexo;
        System.out.println("digite a sua circunferencia: ");
        c = sc.nextDouble();
        System.out.println("digite a sua altura: ");
        a = sc.nextDouble();
        sc.nextLine();
        System.out.println("digite:\n1-Masculino\n2-Feminino\nescreva:  ");
        sexo = sc.nextInt();
        double res=0;
        String msg="";
        res = (double) ((c / (a * Math.sqrt(a))) - 18);
        if (sexo == 1) {
            if (res < 8) {
                msg = "abaixo do peso: " + res;;
            } else if (res > 8 && res <= 20) {
                msg = "normal: ";
            } else if (res > 21 && res < 25){
                msg = "sobrepeso: ";
            }else if(res > 25){
                msg = "obesidade: ";
            }
        }else if(sexo == 2){
            if (res < 20) {
                msg = "abaixo do peso: " + res;
            } else if (res > 21 && res <= 32) {
                msg = "normal: ";
            } else if (res > 33 && res < 38){
                msg = "sobrepeso: ";
            }else if(res > 38){
                msg = "obesidade: ";
            }
        }else{
            System.out.println("algo deu errado");
        }
        System.out.printf("resultado: %.2f" , res );
        System.out.println("\n condição: "+msg);
    }
}