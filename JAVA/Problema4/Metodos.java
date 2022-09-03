package Problemas_Practica.Problema4;

public class Metodos {
    //------Declaraci   on de variables----------
    private double areaCirculo, periCirculo, radio;


    public void setRadio(double radio) {

        this.radio = radio;
    }

    public double getAreaCirculo() {
        return areaCirculo;
    }

    public double getPeriCirculo() {
        return periCirculo;
    }
    //utilizando funciones entre funciones
    private double areaCir(){
        areaCirculo = Math.PI*Math.pow(radio,2);
        return areaCirculo;
    }
    /* -------------------------------------------------------------------------*/
    public double areaSemiCirculo(){
        return areaCir()/2;

    }
    //metodo para calular perimetro
    private double periCir(){
        periCirculo = 2*Math.PI*radio;
        return periCirculo;
    }
    public double periSemiCirculo(){
        return periCir()/2;
    }
}
