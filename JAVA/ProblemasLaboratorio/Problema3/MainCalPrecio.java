package Problemas_Practica.JAVA.ProblemasLaboratorio.Problema3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainCalPrecio {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        MetodosCalPrecio objEntrada = new MetodosCalPrecio();
        double precio;
        System.out.println("favor ingrese el precio del producto: ");
        precio = Double.parseDouble(br.readLine());
        objEntrada.setPrecio(precio);
        System.out.println("el porcentaje de descuento que se le realizo al producto fue del: "+objEntrada.getvDescuento()+"%");
        System.out.println("el precio final del producto es de: "+objEntrada.getvFinal());

    }
}
