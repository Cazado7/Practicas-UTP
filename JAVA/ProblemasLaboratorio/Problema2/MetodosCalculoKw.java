package Problemas_Practica.JAVA.ProblemasLaboratorio.Problema2;

public class MetodosCalculoKw {
    /* Empresa de Transmisión Eléctrica (ETESA) cobra el suministro de energía con una tarifa fija
    por kilowatt/hora (kwh) consumido y desea una aplicación orientada a objetos para hacer el
    cálculo del importe a pagar, recuerde un 1kwh=0.19181 */
    //-----ATRIBUTOS------+
    private double kwatts;

    //------metodo asignar---------
    public void asignar(double calPagar){
        kwatts = calPagar;
    }

    //---------metodos--------
    public double calculoImporte(){
        double calImporte;
        calImporte = kwatts * 0.19181;
        return calImporte;
    }
}
