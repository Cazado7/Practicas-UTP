package Problemas_Practica.JAVA.ProblemasLaboratorio.Problema4;

public class MetodosMetrosPulgadas {
    /*
    Una modista, para realizar sus prendas de vestir, encarga las telas al extranjero. Para cada
    pedido, tiene que proporcionar las medidas de la tela en pulgadas, pero ella generalmente las
    tiene en metros. Realice un POO para ayudar a resolver el problema, determinando cuántas
    pulgadas debe pedir con base en los metros que requiere. Nota: (1 pulgada = 0.0254 m)
    */

    //-------atributos-------
    private double metros, pulgadas;

    //--------metodo get and set------

    //metodo set para modificar el valor de metros
    public void setMetros(double metros) {
        this.metros = metros;
    }

    //metodo get para mostrar las pulgadas


    public double getPulgadas() {
        this.pulgadas= this.metros*39.370;
        return pulgadas;
    }
}

