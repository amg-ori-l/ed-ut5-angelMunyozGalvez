package UT5_Ejercicios;

public class UT5_Ejercicio5_Punto {

    //Declaramos las variables
    private int x;
    private int y;

    //Constructor para el punto
    public UT5_Ejercicio5_Punto(int x, int y) {
        this.x = x;
        this.y = y;
    }
    //Metodo para mostrar los puntos y su indice
    public void muestra(int indicePunto){
        System.out.println("Punto "+ indicePunto + " : X- " + x + "\t Y- " + y);
    }
}
