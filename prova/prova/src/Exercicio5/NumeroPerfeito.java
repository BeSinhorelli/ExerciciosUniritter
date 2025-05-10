package Exercicio5;

public class NumeroPerfeito {
    public NumeroPerfeito(){

    }
    public String numeroPerfeito(int n){
        String msg="";
        int div, soma=0;
       int n1 = n;
        System.out.print("divisores: \n");
        for(div=1; div < n; div++){
            if(n % div == 0){
                System.out.print(div + " | ");
                soma += div;
            }
        }
        if(soma == n1){
            msg = "\né um numero perfeito ";
        }else{
            msg = "\nnão é um numero perfeito";
        }
        return msg;
    }
}
