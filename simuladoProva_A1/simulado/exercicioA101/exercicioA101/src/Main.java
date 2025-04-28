import java.util.Scanner;

//A101) (0,5 pontos) Embrulhar um presente de aniversário custa X reais. O presente de aniversário
//custa Y reais a mais que o preço para embrulhá-lo. Quanto custará para comprar e embrulhar o presente?
//Faça um programa que responda automaticamente a questão apresentada. O valor X e Y do problema
//devem ser lidos e são valores reais.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x=0, y=0, t=0;
        System.out.println("digite o valor do embrulho: ");
        x = sc.nextDouble();
        y = x + x;
        t = x + y;
        System.out.println("valor do presente: " + y + "\nvalor total: " + t);
    }
}