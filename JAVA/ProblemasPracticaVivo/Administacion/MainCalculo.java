package Problemas_Practica.JAVA.ProblemasPracticaVivo.Administacion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainCalculo {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        MetodosCalculoAdministracion objMetodos= new MetodosCalculoAdministracion();
        double sueldo;
        String nombre, id;
        System.out.println("Favor ingrese el nomnre del empleado: ");
        nombre = br.readLine();
        System.out.println("Favor ingrese la cedula o id del empleado: ");
        id = br.readLine();
        System.out.println("Favor ingrese el sueldo actual del empleado: ");
        sueldo = Double.parseDouble(br.readLine());
        objMetodos.asignar(sueldo,nombre,id);
        System.out.println("El empleado: "+nombre+"y numero de identidad: "+id+" tiene un nuevo aumento salarial de $"+objMetodos.calcularAumento());
        System.out.println("El nuevo sueldo seria: $"+objMetodos.calcularNuevoS());
    }
}
