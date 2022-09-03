package Problemas_Practica.ProblemasPracticaVivo.Problema3;

public class MetodosCalculo {

    //------ATRIBUTOS----------
    private double coordenadaX1, coordenadaY1, coordenadaX2, coordenadaY2, coordenadaX3, coordenadaY3;
    //---------------METODOS---------------

    //--------Metodo Asignar----------
    public void asignar(double p1, double p2, double p3, double p4, double p5, double p6){
        coordenadaX1 = p1;
        coordenadaY1 = p2;
        coordenadaX2 = p3;
        coordenadaY2 = p4;
        coordenadaX3 = p5;
        coordenadaY3 = p6;
    }
    //--------Metodo de calculo1, calculando la primera distancia---------
    public double calculoDistancia1(){
        double result;
        result=Math.pow((coordenadaX2-coordenadaX1),2)+Math.pow((coordenadaY2-coordenadaY1),2);
        result= Math.sqrt(result);
        return result;

    }
    //--------Metodo de calculo1, calculando la primera distancia---------
    public double calculoDistancia2(){
        double result2;
        result2=Math.pow((coordenadaX3-coordenadaX2),2)+Math.pow((coordenadaY3-coordenadaY2),2);
        result2= Math.sqrt(result2);
        return result2;
    }
    //--------Metodo de calculo1, calculando la primera distancia---------
    public double calculoDistancia3(){
        double result3;
        result3=Math.pow((coordenadaX3-coordenadaX1),2)+Math.pow((coordenadaY3-coordenadaY1),2);
        result3= Math.sqrt(result3);
        return result3;
    }

    //-----METODO CALCULO PERIMETRO---------
    public double perimetroTotal(){
        double resultP;
        resultP = calculoDistancia1()+calculoDistancia2()+calculoDistancia3();
        return resultP;
    }



}
