package Problemas_Practica.JAVA.Metodos_Sobrecargados.Ejemplo2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num1, num2, num3;
            System.out.println("Ingrese el valor 1: ");
            num1 = Integer.parseInt(br.readLine());
            System.out.println("Ingrese el valor 2: ");
            num2 = Integer.parseInt(br.readLine());
            System.out.println("Ingrese el valor 3: ");
            num3 = Integer.parseInt(br.readLine());
            //--------Utilizando el constructor----------
            SumarNumeros objSum1 = new SumarNumeros(num1, num2);
            SumarNumeros objSum2= new SumarNumeros(num1, num2, num3);
        System.out.println("La suma es: "+objSum1.suma1());
        System.out.println("La suma es: "+objSum2.suma2());
    }
}
