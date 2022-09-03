package Problemas_Practica.ProblemasInternet.Problema1;

public class Cuenta {

   //------Atributos-------
    private String titular;
    private double cantidad;

    //---------Constructores-----------
    public Cuenta(String titular){
        this.titular=titular;

        //------condicional------
        if(titular==null){
            System.out.println("favor ingrese un nombre titular");
        }
    }
    public Cuenta(double cantidad){
        this.cantidad=cantidad;

        //----condicional-----


    }


    //------Metodos get and set---------


    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    //---------Metodo toString----


    @Override
    public String toString() {
        return "el saldo total del usuario: " +titular + " en la cuenta es: " + cantidad;
    }

    //------Metodos Especiales-----------
    public void ingresar(double cantidad){
        if (cantidad>0){
            this.cantidad=cantidad+=cantidad;
        }
    }

    public void retirar(double cantidad) {
        if (this.cantidad - cantidad < 0) {
            this.cantidad = 0;
        } else {
            this.cantidad -= cantidad;
        }
    }
}
