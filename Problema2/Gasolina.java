package Problemas_Practica.Problema2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Gasolina {
    /*
    Resolver el problema que tienen en una gasolinera.
    Los repartidores registran lo que surten en galones, pero el precio de la gasolina está fijado en litros. El sistema debe calcular lo que debe cobrarse al cliente.
    */

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrecioLitroAGalon objCalculo = new PrecioLitroAGalon();
        double cantidad1, precio1;
        System.out.println("favor introduzca el la cantidad a surtir: ");
        cantidad1 = Double.parseDouble(br.readLine());
        System.out.println("favor introduzca el precio de la gasolina actual: ");
        precio1 = Double.parseDouble(br.readLine());
        objCalculo.asignar(cantidad1, precio1);
        System.out.println("el precio a cobrar al cliente es: "+objCalculo.calcularPrecio());
    }
    
}

