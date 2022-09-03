package Problemas_Practica.Problema5;

public class CalculoAuto {
    /*
    El costo de un automóvil nuevo para el consumidor es la suma total del costo del vehículo, del porcentaje de ganancia del vendedor y de los impuestos locales o estatales aplicables (sobre el precio de venta).
    Supóngase una ganancia del vendedor del 12% en todas las unidades y un impuesto del 6%.
    Diséñese un sistema para leer el costo del automóvil e imprimir el costo final para el consumidor.*/

    //----------------Declaracion de variables/Atributos --------------
    private double costoVehiculo;

    //---------------METODOS--------------------
    public void asignar(double costoV){
        costoVehiculo = costoV;

    }
    public double calculoCostoVehiculo(){
        double res;
        res = costoVehiculo*0.12+costoVehiculo*0.06+costoVehiculo;
        return res;

    }


}

