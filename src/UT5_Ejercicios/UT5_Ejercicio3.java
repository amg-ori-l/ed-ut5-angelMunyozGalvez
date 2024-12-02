package UT5_Ejercicios;

import java.util.Scanner;

/*Crea un programa que permita comprobar el funcionamiento de 10 métodos de la clase String. En
los apuntes de la UT tienes información sobre algunos de los métodos. En la documentación de la
API de la clase String tienes información más detallada. 2 de los 10 métodos probados no deben
aparecer en los apuntes de la UT*/
public class UT5_Ejercicio3 {
    public static void main(String[] args) {
        //Creamos el escaner
        Scanner entrada = new Scanner(System.in);
        //Pedimos 2 strings al usuario
        System.out.println("Ingrese el primer string: ");
        String string1 = entrada.nextLine();
        System.out.println("Ingrese el segundo string: ");
        String string2 = entrada.nextLine();

        //Metodo 1 length() //Mide la longitud
        System.out.println("Length: " + string1 + " " + string1.length());

        //Metodo 2 equals() //Compara si son iguales
        System.out.println("Equals: " + string1.equals(string2));
        entrada.close();

        //Metodo 3 equalsIgnoreCase() //Lo mismo pero ignorando diferencias entre mayusculas y minusculas
        System.out.println("EqualsIgnoreCase: " + string1.equalsIgnoreCase(string2));
        entrada.close();

        //Metodo 4 join() //Junta los strings con un separador
        String yoin = String.join(" _ _ _ ", string1, string2, string1);
        System.out.println("Join:" + yoin);

        //Metodo 5 charAt() //Devuelve el caracter que hay en esa posicion
        System.out.println("CharAt(0): " + string1.charAt(0));

        //Metodo 6 toUpperCase() //Transforma el string a mayusculas
        System.out.println("toUpperCase: " + string1.toUpperCase());

        //Metodo 7 toLowerCase() //Lo mismo pero a minusculas
        System.out.println("toLowerCase: " + string1.toLowerCase());

        //Metodo 8 startsWith() //Comprueba si empieza con x
        System.out.println("startsWith(a): " + string1.startsWith("a"));

        //Metodo 9 endsWith() //Igual pero si acaba con x
        System.out.println("endsWith(a): " + string1.endsWith("a"));

        //Metodo 10 isEmpty() //Comprueba si es un string vacío
        System.out.println("isEmpty(): " + string1.isEmpty()); //Siempre es falso porque se introducen datos por el escaner

        entrada.close();
    }
}
