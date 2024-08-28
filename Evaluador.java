package C1427082024;

import java.util.Scanner;

public class Evaluador {

    public static void main(String[] args) {
        Scanner miScanner = new Scanner(System.in);
        Scanner miScanner2 = new Scanner(System.in);
        Scanner miScanner3 = new Scanner(System.in);

        System.out.println("Ingresa tu nota");

        int notas = miScanner.nextInt();
        while (notas >= 10 || notas <= 1) {
            System.out.println("La nota es invalida");



            System.out.println("Bienvenido a tu evaluador de notas, ingresa tu calificación de Quimica: ");
            int calificacionQuimica = miScanner.nextInt();

            System.out.println("por favor ingresa tu calificación de Ingles:");
            int calificacionIngles = miScanner2.nextInt();

            System.out.println("ahora tu calificacion de matematicas.");
            int calificacionMatematicas = miScanner3.nextInt();


            //QUIMICA//

            if (calificacionQuimica == 10) {
                System.out.println("Felicidades, aprobaste la materia");
            } else if (calificacionQuimica > 5 && calificacionQuimica <= 8) {
                System.out.println("Tienes una califición aceptable");
            } else if (calificacionQuimica > 3 && calificacionQuimica <= 5) {
                System.out.println("por poco, esta calificación es insuficiente");
            } else {
                System.out.println("No Aprobado");
            }

            //INGLEES//

            if (calificacionIngles == 10) {
                System.out.println("Felicidades, aprobaste la materia");
            } else if (calificacionIngles > 5 && calificacionIngles <= 8) {
                System.out.println("Tienes una calificación aceptable");
            } else if (calificacionIngles > 3 && calificacionIngles <= 5) {
                System.out.println("por poco, esta calificación es insuficiente");
            } else {
                System.out.println("No Aprobado");

                //MATEMATICA/
            }

            if (calificacionMatematicas == 10) {
                System.out.println("Felicidades, aprobaste la materia");
            } else if (calificacionMatematicas > 5 && calificacionQuimica <= 8) {
                System.out.println("Tienes una calificación aceptable");
            } else if (calificacionMatematicas > 3 && calificacionQuimica <= 5) {
                System.out.println("por poco, esta calificación es insuficiente");
            } else {
                System.out.println("No Aprobado");
            }

        }
    }
}