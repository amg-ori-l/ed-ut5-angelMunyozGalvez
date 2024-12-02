package UT5_Ejercicios;

import java.util.Random;
import java.util.Scanner;

public class UT5_Ejercicio5_Array {
    public static void main(String[] args) {
        //Creamos el escaner para pedir los datos
        Scanner entrada = new Scanner(System.in);
        //Random para generar numeros aleatorios
        Random rand = new Random();

        //Pedimos los puntos
        System.out.println("Nº de puntos: ");
        int npuntos = entrada.nextInt();

        //Creamos el array de los puntos
        UT5_Ejercicio5_Punto[] puntos = new UT5_Ejercicio5_Punto[npuntos];

        //Bucle para crear los puntos con sus valores aleatorios y mostrarlos
        for (int i = 0; i < npuntos; i++) {
            int x = rand.nextInt(11);
            int y = rand.nextInt(11);
            puntos[i] = new UT5_Ejercicio5_Punto(x, y);
            puntos[i].muestra(i + 1);
        }
        //Cerramos el escaner
        entrada.close();
    }
}
