import java.util.Scanner;
//A105) (1,5 ptos) Criar uma função/método que verifique se um número é primo. Faça um programa
//principal que teste a função desenvolvida. Um número primo é todo número que é apenas divisível por ele
//mesmo e o número um. Ex: 7
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("digite um numero: ");
        int numero = sc.nextInt();
                boolean primo = true;
                if (numero <= 1) {
                    primo = false;
                } else {
                    for (int i = 2; i <= Math.sqrt(numero); i++) {
                        if (numero % i == 0) {
                            primo = false;
                            break;
                        }
                    }
                }
                if (primo) {
                    System.out.println(numero + " é um numero primo");
                } else {
                    System.out.println(numero + " não é um numero primo");
                }
            }
        }