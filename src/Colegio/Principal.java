package Colegio;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Principal {
    public static void main(String [] args){

        HashMap<String, String > alumnos = new HashMap<>();
        addAlumnos(alumnos);
        mostrarDatos(alumnos);

    }
    public static void addAlumnos(HashMap<String, String > alumnos ){
        Scanner teclado = new Scanner(System.in);
        String nombre;
        String nacionalidad;
        String respuesta="";
        do {
            System.out.print("Introduzca nombre del alumno: ");
            nombre=teclado.next();
            System.out.print("Introduzca nacionalidad del alumno: ");
            nacionalidad=teclado.next();
            System.out.println("Quieres introducir mas nombres?");
            respuesta= teclado.next();

        }
        while (respuesta.equals("si"));
        System.out.println("nombres guardados");

        alumnos.put(nombre,nacionalidad);

    }
    public static void mostrarDatos(HashMap<String, String > alumnos){
        for (Map.Entry<String, String> mapa: alumnos.entrySet()){
            System.out.println(mapa);
        }

    }
}
