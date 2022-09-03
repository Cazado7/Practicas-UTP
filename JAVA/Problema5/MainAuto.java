package Problemas_Practica.Problema5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

public class MainAuto {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        CalculoAuto objCosto = new CalculoAuto();
        DecimalFormat df = new DecimalFormat("####.##");
        double costoVehiculo;
        System.out.println("favor introduzca el precio del vehiculo: ");
        costoVehiculo = Double.parseDouble(br.readLine());
        objCosto.asignar(costoVehiculo);
        System.out.println("El costo final del vehiculo a vender es: "+df.format(objCosto.calculoCostoVehiculo()));

    }
}
