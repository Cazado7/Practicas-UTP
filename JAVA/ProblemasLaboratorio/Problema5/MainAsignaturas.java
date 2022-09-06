package Problemas_Practica.JAVA.ProblemasLaboratorio.Problema5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainAsignaturas {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        MetodosAsignatura objEntrada = new MetodosAsignatura();
        double aprobados, reprobados, sobresalientes;
        System.out.println("favor ingrese la cantidad de estudiantes aprobados: ");
        aprobados = Double.parseDouble(br.readLine());
        System.out.println("favor ingrese la cantidad de estudiantes reprobados: ");
        reprobados = Double.parseDouble(br.readLine());
        System.out.println("favor ingres la cantidad de estudiantes sobresalientes: ");
        sobresalientes = Double.parseDouble(br.readLine());

        objEntrada.asignar(aprobados, reprobados, sobresalientes);

        System.out.println("la el porcentaje de alumnos aprobados fue del: "+objEntrada.calculoAprobados()+"%");
        System.out.println("la el porcentaje de alumnos reprobados fue del: "+objEntrada.calculoReprobados()+"%");
        System.out.println("la el porcentaje de alumnos sobresalientes fue del: "+objEntrada.calculoSobresalientes()+"%");
    }
}
