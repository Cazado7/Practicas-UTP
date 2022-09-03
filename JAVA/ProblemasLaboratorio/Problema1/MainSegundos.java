package Problemas_Practica.JAVA.ProblemasLaboratorio.Problema1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

public class MainSegundos {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        MetodosCalSegundos objCalculo = new MetodosCalSegundos();
        DecimalFormat df = new DecimalFormat("####.##");
        double dias, total;
        System.out.println("favor ingrese la cantidad de dias: ");
        dias = Double.parseDouble(br.readLine());
        objCalculo.asignar((int) dias);
        total = objCalculo.calculoSegundos();
        System.out.println("la cantidad de segundos en este numero de dias fue: "+df.format(total)+" segundos");


    }
}
