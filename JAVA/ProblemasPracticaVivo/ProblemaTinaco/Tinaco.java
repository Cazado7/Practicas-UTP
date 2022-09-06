package Problemas_Practica.JAVA.ProblemasPracticaVivo.ProblemaTinaco;

public class Tinaco {
    private double altura, radio;

    public void asignar(double h, double r){
        altura = h;
        radio =r;
    }

    public double calculoVolumen(){
        double resp;
        resp = Math.PI*Math.pow(radio,2);
        return resp;
    }

}
