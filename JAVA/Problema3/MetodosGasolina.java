package Problemas_Practica.Problema3;

public class MetodosGasolina {
    //declaracion de variables
    private double precioLitros, precioGalon, cantidadtotal;

    //METODO1:
    //recibimos la informacion
    public void asignar(double cantidad, double precio, double galon) {
        cantidadtotal=cantidad;
        precioLitros = precio;
        precioGalon= galon;

    }
    //METODO2:
    //Calculamos el precio a litros
    public double calcular(){
        double calculoT = 0;
        calculoT = cantidadtotal*precioLitros;
        return calculoT;
    }

    //METODO3:
    //Calculamos el total de galones consumidos.
    public double totalGalones(){
        double calculo =0;
        calculo = calculo* precioGalon;
        return calculo;
    }


    


}
