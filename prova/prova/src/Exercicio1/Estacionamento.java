package Exercicio1;

public class Estacionamento {

    public Estacionamento() {

    }

    public static String calcular(double taxa2, double taxa, int horasex){
        String t="";
        double total=0.0;
        for(int i=1; i < horasex; i++){
            taxa2 += taxa2;
        }
        total = taxa2 + taxa;
        t = "valor total: " + total + "\nvalor total da taxa por hora: " + taxa2;
        return t;
    }
}
