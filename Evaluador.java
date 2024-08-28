package C1427082024;

import java.util.Scanner;

public class Evaluador {

    public static void main(String[] args) {
        Scanner miScanner = new Scanner(System.in);

        System.out.println("Quimica");
        System.out.println("Ingresa tu nota: ");
        int notas = miScanner.nextInt();


        while (notas > 10 || notas < 1) {
            System.out.println("La nota es invalida");
            System.out.println("ingresa tu nota: ");
            notas = miScanner.nextInt();
        }
        int quimica = notas;

        System.out.println("ingles");
        System.out.println("ingresa tu nota:");
        notas = miScanner.nextInt();

        while (notas > 10 || notas < 1) {
            System.out.println("La nota es invalida");
            System.out.println("ingresa tu nota: ");
            notas = miScanner.nextInt();
        }

        int ingles = notas;

        System.out.println("matematica");
        System.out.println("ingresa tu nota:");
        notas = miScanner.nextInt();

        while (notas > 10 || notas < 1) {
            System.out.println("La nota es invalida");
            System.out.println("ingresa tu nota: ");
            notas = miScanner.nextInt();
        }
        int matematica = notas;




        //QUIMICA//

         if (quimica == 10) {
            System.out.println("Felicidades, aprobaste la materia");
         } else if (quimica > 5 && quimica <= 8) {
            System.out.println("Tienes una califición aceptable");
         } else if (quimica > 3 && quimica <= 5) {
            System.out.println("por poco, esta calificación es insuficiente");
         } else {
            System.out.println("No Aprobado");
         }

         //INGLEES//

         if (ingles == 10) {
            System.out.println("Felicidades, aprobaste la materia");
         } else if (ingles > 5 && ingles <= 8) {
            System.out.println("Tienes una calificación aceptable");
         } else if (ingles > 3 && ingles <= 5) {
            System.out.println("por poco, esta calificación es insuficiente");
         } else {
             System.out.println("No Aprobado");
         }

            //MATEMATICA/

         if (matematica == 10) {
            System.out.println("Felicidades, aprobaste la materia");
         } else if (matematica > 5 && matematica <= 8) {
            System.out.println("Tienes una calificación aceptable");
         } else if (matematica > 3 && matematica <= 5) {
            System.out.println("por poco, esta calificación es insuficiente");
         } else {
             System.out.println("No Aprobado" );
         }
        }
    }

