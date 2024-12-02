package UT5_Ejercicios;
/*Crea un programa que lea por teclado una dirección de correo electrónico y compruebe si es una
dirección de correo de alumno válida para el dominio @alu.gva.es . Para ello deberá utilizar
expresiones regulares. */
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UT5_Ejercicio4 {
    public static void main(String[] args) {
        //Creamos el escaner
        Scanner entrada = new Scanner(System.in);

        //El usuario introduce el correo
        System.out.print("Ingrese el email: ");
        String email = entrada.nextLine();

        //Ceramos el pattern y el matcher, con la regex dentro del pattern
        Pattern pattern = Pattern.compile("^[a-zA-Z0-9._-]+@alu\\.gva\\.es$");
        Matcher matcher = pattern.matcher(email);

        //Imprimimos el resultado
        if(matcher.matches()) {
            System.out.println(email + " Es válido.");
        } else {
            System.out.println(email + " No es válido.");
        }
    }
}
