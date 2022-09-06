package Problemas_Practica.JAVA.Metodos_Sobrecargados.Ejemplo1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainSumarNum {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        SumarNumeros objSum = new SumarNumeros();
        double num1, numm2, num3;
        System.out.println("favor ingrese el valor 1: ");
        num1 = Double.parseDouble(br.readLine());
        System.out.println("favor ingrese el valor 2: ");
        numm2 = Double.parseDouble(br.readLine());
        System.out.println("favor ingrese el valor 3: ");
        num3 = Double.parseDouble(br.readLine());
        System.out.println("la suma es: "+objSum.suma(num1,numm2));
        System.out.println("la suma es: "+objSum.suma(num1,numm2, num3));
    }


}
