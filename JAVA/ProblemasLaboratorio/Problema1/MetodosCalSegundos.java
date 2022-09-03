package Problemas_Practica.JAVA.ProblemasLaboratorio.Problema1;

public class MetodosCalSegundos {
   /* Diseñe un POO que resuelva el siguiente caso; La cantidad de segundos que hay en un
    número determinado de días. Capture la cantidad de días e imprima la cantidad de segundos
    que contiene.*/

    //--------Atributos-------------
    private int dias;

    //----------Metodos--------
    public void asignar(int numDias){
         dias = numDias;
    }

    //-----Metodo de calculo---------
    public double calculoSegundos(){
        double segundos;
        segundos = dias*60*60*24;
        return segundos;
    }




}
