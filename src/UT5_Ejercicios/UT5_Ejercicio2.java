package UT5_Ejercicios;

import java.util.Scanner;

/*Desarrolla una aplicación que ayude a gestionar las notas de un centro educativo. Los alumnos se
organizan en grupos compuestos por 5 personas. Leer las notas (números enteros) del primer,
segundo y tercer trimestre de un grupo. Debes mostrar al final la nota media del grupo en cada
trimestre y la media del alumno que se encuentra en una posición dada (que el usuario introduce
por teclado).
Para la realización del ejercicio necesitarás utilizar una matriz de tamaño 5x3. */
public class UT5_Ejercicio2 {
    public static void main(String[] args) {
        //Creamos el escaner para introducir datos
        Scanner entrada = new Scanner(System.in);

        //Creamos la matriz
        double[][] notas = new double[5][3];

        //Se introducen las notas
        System.out.println("Introduzca las notas (decimales con comas): ");
        for (int i = 0; i < 5; i++) { // Los 5 alumnos
            System.out.println("Alumno Nº " + (i + 1) + " : ");
            for (int j = 0; j < 3; j++) { // Los 3 trimestres
                System.out.println("Nota " + (j + 1) + " : ");
                notas[i][j] = entrada.nextDouble(); //La nota
            }
        }
        //Calcular la media
        System.out.println("Notas medias: ");
        for (int j = 0; j < 3; j++) { // Los trimestres
            double notaTrimestre = 0;
            for (int i = 0; i < 5; i++) {
                notaTrimestre += notas[i][j];// Se suman notas de los alumnos
            }
            double mediaTrimestre = notaTrimestre / 5;// Se calcula la media
            System.out.printf("Nota Trimestre %d: %.2f%n", (j+1) ,mediaTrimestre); //Printf para formato
        }
        //Solicitar el alumno
        System.out.println("Seleccione alumno: ");
        int alumno = entrada.nextInt();

        //Validamos el alumno
        if (alumno < 1|| alumno > 5) {
            System.out.println("Alumno no válido.");
        } else {
            int numAlumno = alumno - 1;
            double notaAlumno = 0;
            for (int j = 0; j < 3; j++) {
                notaAlumno += notas[numAlumno][j];
            }
            double mediaAlumno = notaAlumno / 3;
            System.out.printf("Nota media del alumno %d: %.2f%n", numAlumno, mediaAlumno);
        }
    }
}
