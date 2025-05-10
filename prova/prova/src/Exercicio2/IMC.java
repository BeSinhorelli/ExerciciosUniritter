package Exercicio2;

public class IMC {
    public IMC() {

    }

    public static String calcularIMC(double peso, double altura, String sexo){
        String cond="";
        double IMC = (double) peso / (altura*altura);
        if(sexo.equals("m")){
            if(IMC < 20.0){
                cond = "abaixo do peso";
            }else if(IMC >= 20.0 && IMC < 24.9){
                cond = "normal";
            }else if(IMC >= 25.0 && IMC < 29.9){
                cond = "sobrepeso";
            }else if(IMC >= 30 && IMC < 39.9){
                cond = "obesidade";
            }else if(IMC >=40){
                cond = "obesidade morbida";
            }
        }else if(sexo.equals("f")){
            if(IMC < 19.0){
                cond = "abaixo do peso";
            }else if(IMC >= 19.0 && IMC < 23.9){
                cond = "normal";
            }else if(IMC >= 24.0 && IMC < 28.9){
                cond = "sobrepeso";
            }else if(IMC >= 29 && IMC < 38.9){
                cond = "obesidade";
            }else if(IMC >=39){
                cond = "obesidade morbida";
            }
        }
        cond = "\ncalculo: " + IMC;
        return cond;
    }
}
