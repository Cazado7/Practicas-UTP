package Problemas_Practica.JAVA.ProblemasLaboratorio.Problema2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainCalLuz {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader((System.in)));
        MetodosCalculoKw objCal = new MetodosCalculoKw();
        double kiloWatts;
        System.out.println("favor ingrese la cantidad de kilowatts consumidos: ");
        kiloWatts = Double.parseDouble(br.readLine());
        objCal.asignar(kiloWatts);
        System.out.println("la cantidad a pagar por los kilos watts consumidos es de: "+objCal.calculoImporte());
    }
}
