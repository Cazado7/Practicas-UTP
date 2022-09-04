package Problemas_Practica.JAVA.ProblemasLaboratorio.Problema4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainConversor {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        MetodosMetrosPulgadas objMetros = new MetodosMetrosPulgadas();
        double metros;
        System.out.println("favor ingrese la cantidad de metros que desea encargar: ");
        metros = Double.parseDouble(br.readLine());
        objMetros.setMetros(metros);
        System.out.println("la cantidad de pulgadas que debe encargar son: "+objMetros.getPulgadas());
    }
}
