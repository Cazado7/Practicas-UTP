package Problemas_Practica.Problema1;

public class PrecioMetodos {
    //-------Definicion de atributos
    private double precioProducto;
    //private String descripcionProducto;

    //-----METODOS--------
    //-------------METODO1 obtencion de datos--------------
    public void asignar (double precioP){
        precioProducto = precioP;
        //descripcionProducto =descrip;
    }

    //------------METODO2 utilizacion de datos----------------
    public double calculoPrecio(){
        double result;
        result = (precioProducto*0.12)+precioProducto;
        result = (result*0.15)+precioProducto;
        return result;
    }
}
