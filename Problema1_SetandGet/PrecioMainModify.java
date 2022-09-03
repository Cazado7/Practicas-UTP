package Problemas_Practica.Problema1_SetandGet;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PrecioMainModify {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrecioMetodosModify objPrecio = new PrecioMetodosModify();
        double precio;
        System.out.println("favor ingrese el precio del producto: ");
        precio = Double.parseDouble(br.readLine());
        objPrecio.setPrecioProducto(precio);
        System.out.println("el precio del producto es: "+objPrecio.calculo());

    }
}
