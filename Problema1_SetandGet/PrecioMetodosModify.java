package Problemas_Practica.Problema1_SetandGet;

public class PrecioMetodosModify {
    //-------Definicion de atributos
    private double precioProducto;
    //private String descripcionProducto;

    public double getPrecioProducto() {
        return precioProducto;
    }
    //-----Metodo----
    public double calculo(){
        precioProducto = (precioProducto*0.12)+precioProducto;
        precioProducto = (precioProducto*0.15)+precioProducto;
        return precioProducto;
    }

    public void setPrecioProducto(double precioProducto) {
        this.precioProducto = precioProducto;
    }

}
