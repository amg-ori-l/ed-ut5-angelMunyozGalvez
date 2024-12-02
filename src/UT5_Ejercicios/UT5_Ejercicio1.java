package UT5_Ejercicios;
/*El ayuntamiento de tu localidad te ha encargado una aplicación que ayude a realizar encuestas
estadísticas para conocer el nivel adquisitivo de los habitantes del municipio. Para ello, tendrás
que preguntar el sueldo a cada persona encuestada. A priori, no conoces el número de
encuestados. Por ello primero se solicitará por teclado dicho número. Posteriormente se
procederá a solicitar por teclado los sueldos de cada encuestado.
Una vez terminada la entrada de datos, muestra la siguiente información:
• Todos los sueldos introducidos ordenados de manera decreciente.
• El sueldo máximo y mínimo.
• La media de los sueldos.
Para la ordenación de un array se puede utilizar el método estático sort, disponible en la clase
Arrays. Para más información puedes acceder a la documentación de la API de Java. */
import java.util.Arrays;
import java.util.Scanner;

public class UT5_Ejercicio1 {
    public static void main(String[] args) {
        //Creamos el escaner para introducir los datos
        Scanner entrada = new Scanner(System.in);

        //Solicitar el número de personas
        System.out.print("Ingrese el número de encuestados: ");
        int numEncuestados = entrada.nextInt();

        //Crear el array
        double[] sueldos = new double[numEncuestados];

        //Solicitamos los sueldos con un bucle
        for (int i = 0; i < numEncuestados; i++) {
            System.out.print("Introduce el sueldo: ");
            sueldos[i] = entrada.nextDouble();
        }

        //Ordenamos los sueldos de menor a mayor
        Arrays.sort(sueldos);
        //Intenté usar reverseOrder() pero eso es con listas y no me aclaré
        // Mostrar los sueldos en orden decreciente
        System.out.println("\nSueldos de mayor a menor:");
        for (int i = sueldos.length - 1; i >= 0; i--) {
            System.out.println(sueldos[i]);
        }

        //Calcular el máximo, medio y mínimo
        double sueldoMax = sueldos[sueldos.length - 1];
        double sueldoMin = sueldos[0];
        //sum() solo a partir de JAVA 8 creo
        double sueldoTotal = Arrays.stream(sueldos).sum();
        double sueldoMid = sueldoTotal / sueldos.length;

        // Imprimir los resultados
        System.out.println("Sueldo máximo: " + sueldoMax);
        System.out.println("Sueldo mínimo: " + sueldoMin);
        System.out.println("Media de los sueldos: " + sueldoMid);

        //Cerramos el escaner
        entrada.close();
    }
}
