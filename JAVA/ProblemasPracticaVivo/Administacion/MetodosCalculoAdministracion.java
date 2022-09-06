package Problemas_Practica.JAVA.ProblemasPracticaVivo.Administacion;

public class MetodosCalculoAdministracion {
    //---------ATRIBUTOS---
    private String name, id;
    private double sueldo;

    //--------Asignar--------
    public void asignar(double salarioA, String nombre, String id){
        name = nombre;
        sueldo = salarioA;
        this.id= id;
    }

    //---------Metodos--------------
    public double calcularAumento(){
        double resp;
        resp = sueldo*0.09;
        return resp;
    }
    public double calcularNuevoS(){
        double resp;
        resp = sueldo+calcularAumento();
        return resp;
    }
}
