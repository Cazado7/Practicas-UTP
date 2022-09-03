package Problemas_Practica.JAVA.Problema4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.text.DecimalFormat;

public class AreaCirculo {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Problemas_Practica.Problema4.Metodos objAreaP = new Problemas_Practica.Problema4.Metodos();
        //esto es una instancia para poder formatear los numeros decimales
        DecimalFormat df = new DecimalFormat("#####.##");
        double radio;
        System.out.println("favor ingrese el valor del radio: ");
        radio = Double.parseDouble(br.readLine());
        objAreaP.setRadio(radio);
        System.out.println("el valor obtenido fue: "+objAreaP.areaSemiCirculo());
        System.out.println("el valor del perimetro obtenido fue: "+objAreaP.periSemiCirculo());
        System.out.println("el valor del area del circulo fue: "+objAreaP.getAreaCirculo());
        System.out.println("el valor del perimetro del ciculo fue: "+objAreaP.getPeriCirculo());
    }
}
