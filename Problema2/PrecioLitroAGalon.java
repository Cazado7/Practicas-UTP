package Problemas_Practica.Problema2;

public class PrecioLitroAGalon {
    //declaracion de variable y su nivel de seguridad o privacidad
    private double precioLitro, cantidadSurtida;

    //METODO1: declaracion de metodos y sus atributos(osea las variables dentro)
    public void asignar (double precio, double cantidad){
        precioLitro= precio;
        cantidadSurtida=cantidad;

    }
    //METODO2: declaracion de metodo y sus atributos
    public double calcularPrecio(){
        double precioAPagar;
        precioAPagar = precioLitro*cantidadSurtida;
        return precioAPagar;
    }
    
}
