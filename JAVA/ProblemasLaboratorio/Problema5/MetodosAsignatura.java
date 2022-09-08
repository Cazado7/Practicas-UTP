package Problemas_Practica.JAVA.ProblemasLaboratorio.Problema5;

public class MetodosAsignatura {
    /*
    Queremos conocer los datos estadísticos de una asignatura, por lo tanto, necesitamos un
    POO que lea el número de reprobados, aprobados y sobresalientes de una asignatura, y nos
    devuelva:
    a. El tanto por ciento de alumnos que han superado la asignatura (aprobados más los
    sobresalientes).
    b. El tanto por ciento de reprobados, aprobados + sobresalientes de la asignatura de
    Desarrollo Software II*/

    //-------Atributos------------
    private double alumnosPass, alumOver, alumBad;

    //-----------Metodos------------
    public void asignar(double alumP,double alumB, double alumO){
        alumnosPass = alumP;
        alumBad = alumB;
        alumOver = alumO;
    }

    //------Metodo de calulo para aprobados--------
    public double calculoAprobados() {
        double res;
        res = (calculo11() * (alumnosPass + alumOver)) / calculo11();
        return res;
    }
    public double calculoReprobados() {
        double res;
        res = (calculo11() * alumBad) / calculo11();
        return res;
    }
    public double diferencia(){
        double res;
        res = calculoAprobados()+calculoReprobados();
        return res;
    }
    public double calculo11(){
        double res;
        res= alumnosPass + alumOver +alumBad;
        return res;
    }


}
