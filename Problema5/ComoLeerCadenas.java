package Problemas_Practica.Problema5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ComoLeerCadenas {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String a;
        System.out.println("favor introduzca una cadena: ");
        //asi es para leer o capturar una cadena junto con espacios.
        a = br.readLine();
        System.out.println("el valor almacenado en esta variable fue: "+a);

    }
}
