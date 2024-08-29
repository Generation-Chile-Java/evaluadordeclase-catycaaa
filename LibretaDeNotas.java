package C1427082024;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class LibretaDeNotas {

    public static void main(String[] args) {
        Scanner miScanner = new Scanner(System.in);

        //Utiliza un HashMap para almacenar las calificaciones de los estudiantes, donde la llave es el nombre del estudiante y el valor es un ArrayList de notas.

        HashMap<String, ArrayList<Float>> calificaciones = new HashMap<>();
        ArrayList<Float> notas = new ArrayList<>();

        //Solicita al usuario que ingrese la cantidad de alumnos y la cantidad de notas por alumno.

        System.out.println("Bienvenido, por favor ingrese la cantidad de alumnos. ");
        int cantidadAlumnos = miScanner.nextInt();


        System.out.println("ingresa la cantidad de notas por alumno");
        int cantidadDeNotas = miScanner.nextInt();

        //Solicita el nombre de cada alumno y las notas correspondientes, almacenándolas en el HashMap.

        for (int i = 1; i <= cantidadAlumnos; i++) {
            ArrayList<Float> nota = new ArrayList<>();
            System.out.println("Ingrese el nombre del alumno" + i + ":");
            String nombreAlumno = miScanner.next();
            for (int j = 1; j <= cantidadDeNotas; j++) {
                System.out.println("Ingresa notas del alumno" + nombreAlumno + j + ":");
                int notaAlumno = miScanner.nextInt();
                notas.add((float) notaAlumno);
            }
            calificaciones.put(nombreAlumno, nota);
        }
        System.out.println(calificaciones);


        for (String nombreAlumno : calificaciones.keySet()) {
            ArrayList<Float> nota = calificaciones.get(nombreAlumno);
            System.out.println(nota);
            Double promedio = 0D;
            for (Float notaAlumno : nota) {
                promedio += notaAlumno;
            }
            promedio = promedio / nota.size();
            System.out.println(promedio);
            System.out.println("La nota mas alta es" + Collections.max(nota));
            System.out.println("La nota mas baja es" + Collections.min(nota));
        }
        System.out.println("Ingresa una opción del menu" + '\n' +
                "1. Mostrar el Promedio de Notas por Estudiante." + '\n' +
                "2. Mostrar si la Nota es Aprobatoria o Reprobatoria por Estudiante." + '\n' +
                "3. Mostrar si la Nota está por Sobre o por Debajo del Promedio del Curso por Estudiante." + '\n' +
                " 0. Salir del Menú.");

        //menu de opciones
        int menu = miScanner.nextInt();
        switch (menu) {
            case 1:
                for (String nombreAlumno : calificaciones.keySet()) {
                    ArrayList<Float> nota = calificaciones.get(nombreAlumno);
                    System.out.println(nota);
                    Double promedio = 0D;
                    for (Float notaAlumno : nota) {
                        promedio += notaAlumno;
                    }
                    promedio = promedio / nota.size();
                    System.out.println(promedio);
                    System.out.println("Mostrar el Promedio de Notas por Estudiante.");
                }

        }


    }
}

