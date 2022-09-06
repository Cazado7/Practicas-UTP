package Problemas_Practica.JAVA.ProblemasPracticaVivo.ProblemaTinaco;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

public class MainTinaco {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Tinaco objMetodos = new Tinaco();
        DecimalFormat dc = new DecimalFormat("####.##");
        double altura, radio;
        System.out.println("favor ingrese la altura del tinaco: ");
        altura = Double.parseDouble(br.readLine());
        System.out.println("favor ingrese el radio del tinaco: ");
        radio = Double.parseDouble(br.readLine());
        objMetodos.asignar(altura,radio);
        System.out.println("el volumen del tinaco es: "+ dc.format(objMetodos.calculoVolumen()));
    }
}
