package Problemas_Practica.ProblemasPracticaVivo.Problem3Solucio;

public class PerimetroTriangulo {
   //---------ATRIBUTOS----------
    private double xInicial, xFinal, yInicial, yFinal;

    public void asignar(double xI, double yI, double xF, double yF){
        xInicial=xI;
        yInicial=yI;
        xFinal=xF;
        yFinal=yF;
    }
    //-------METODOS----------
    //----Metodo para calcular la distancia-------
    public double calcularDistancia(){
        return Math.sqrt(Math.pow(xFinal-xInicial,2)+Math.pow(yFinal-yInicial,2));
    }
        //----Metodo en la espera de una variable en el main para retornar el resultado------
    public double perimetro(double distanciaA, double distanciaB, double distanciaC){
        return distanciaA+distanciaB+distanciaC;
    }
}
