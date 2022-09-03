package Problemas_Practica.ProblemasPracticaVivo.Problema3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.text.DecimalFormat;

public class MainPerimetro {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        MetodosCalculo objCalculo = new MetodosCalculo();
        DecimalFormat dc = new DecimalFormat("####.##");
        double coord1, coord2, coord3, coord4, coord5, coord6;
        System.out.println("favor ingrese las coordenadas del primer vertice, Ingrese primero X y luego Y: "); //
        coord1 = Double.parseDouble(br.readLine());
        coord2 = Double.parseDouble(br.readLine());
        System.out.println("favor ingrese las coordenadas del segundo vertice Ingrese primero X y luego Y: ");
        coord3 = Double.parseDouble(br.readLine());
        coord4 = Double.parseDouble(br.readLine());
        System.out.println("favor ingrese las coordenadas del tercero vertice Ingrese primero X y luego Y: ");
        coord5 = Double.parseDouble(br.readLine());
        coord6 = Double.parseDouble(br.readLine());
        //----Insertando valores al metodo asignar----
        objCalculo.asignar(coord1,coord2,coord3,coord4,coord5,coord6);
        //-----Imprimiendo el perimetro-------
        System.out.println("El perimetro del triangulo es: "+dc.format(objCalculo.perimetroTotal()));
    }
}
