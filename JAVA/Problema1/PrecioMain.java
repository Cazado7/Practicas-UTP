package Problemas_Practica.Problema1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PrecioMain {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrecioMetodos objPrecio = new PrecioMetodos();
        double precioArticulo;
        //String descrip;
        System.out.println("Favor ingrese el precio del articulo: ");
        precioArticulo = Double.parseDouble(br.readLine());
        System.out.println("Favor ingrese el nombre del articulo: ");
        //-----------leer String-----------
        //----------||||||||||||||||||||||||----------
        objPrecio.asignar(precioArticulo);
        System.out.println("el precio de venta para el articulo es: "+objPrecio.calculoPrecio());

    }
}
