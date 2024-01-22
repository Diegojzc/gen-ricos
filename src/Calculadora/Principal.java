package Calculadora;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
    public static void main(String []args){
        Scanner teclado = new Scanner(System.in);
        int entrada=0;
        ArrayList<Integer> numeros = new ArrayList<>();
        while (entrada != -1) {
            System.out.print("Introduzca numeros. Para terminar introduzca -1: ");
            entrada = teclado.nextInt();
            numeros.add(entrada);

        }
        System.out.println("La suma es: " + suma(numeros));
        System.out.println("La media es: " + media(numeros));
        System.out.println("Los numeros mayores que la media son: " +mayores(numeros));
    }
    public static int suma(ArrayList<Integer> numeros){
        int suma=0;
        for (int i = 0; i < numeros.size() ; i++) {
            if (numeros.get(i) > 0) {
                suma += numeros.get(i);
            }
        }
        return suma;
    }
    public static int media(ArrayList<Integer> numeros){
        int suma=0;
        int media=0;
        for (Integer e: numeros) {
            suma += e;
            media = suma/ numeros.size();
        }

        return media;
    }
    public static int mayores(ArrayList<Integer> numeros){
        int cont=0;
        for (Integer i:numeros) {
            if (i>= media(numeros)){
                cont++;
            }
        }

        return cont;
    }
}
