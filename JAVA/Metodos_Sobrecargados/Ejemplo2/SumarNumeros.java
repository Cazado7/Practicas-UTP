package Problemas_Practica.JAVA.Metodos_Sobrecargados.Ejemplo2;

public class SumarNumeros {
    private int num1,num2,num3;
//---------Sobre carga de constructores----------------
    public SumarNumeros(int num1, int num2, int num3) {
        this.num1 = num1;
        this.num2 = num2;
        this.num3 = num3;
    }

    public SumarNumeros(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;

    }


    //--------------metodos comunes----------
    public int suma1(){
        return num1+num2;
    }
    public int suma2(){
        return num1+num2+num3;
    }
}
