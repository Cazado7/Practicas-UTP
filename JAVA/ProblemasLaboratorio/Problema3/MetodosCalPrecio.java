package Problemas_Practica.JAVA.ProblemasLaboratorio.Problema3;

public class MetodosCalPrecio {
    /*
     Una tienda ofrece un descuento del 15% sobre el total de la compra y un cliente desea saber
    cuánto deberá pagar finalmente por su compra. Haga un algoritmo que le indique al cliente el
    valor del descuento y el pago final de su compra.
    */
    //-------Atributos-------
    private double vDescuento = 0.15, precio;
    //----Metodos set and get----------


    //---metodo para mostrar el porcentaje de descuento-----
    public double getvDescuento() {
        return vDescuento;
    }

    //-----metodo get final para mostrar el precio final en el main---
    public double getvFinal() {
        return calculoprecio();
    }

    //---metodo set para configurar el precio en el main---
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    //----Metodo de calculo------
    public double calculoprecio(){
        double res;
        res = this.precio*0.15+this.precio;
        return res;
    }
}
