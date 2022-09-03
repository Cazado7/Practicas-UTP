package Problemas_Practica.Problema6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CambioMonedaMain {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double pesos;
        System.out.println("Ingrese la cantidad de pesos colombianos: ");
        pesos= Double.parseDouble(br.readLine());
        CambioMoneda cm = new CambioMoneda(pesos);
        System.out.println("el precio del cambio es:"+cm.cacularCambioMenda());



    }
}
