package tokioEjercicios;

import java.util.*;

public class Principal {
    public static void main(String []args) {
        Scanner teclado = new Scanner(System.in);
        List<Integer> lista = new ArrayList<>();
        int numeros = 1;
        String respuesta= "";

        System.out.println("Introduzca numeros para sumar y sacar media");
        do {
                System.out.print("Introduzca numeros: ");
                try {
                    numeros = teclado.nextInt();
                    lista.add(numeros);
                }catch (Exception ex){
                    System.out.println("el numero introducido no es el correcto");
                    break;
                }

            System.out.println("Quieres introducir otra vez");
           try {
               respuesta = teclado.next();
           }catch (Exception ex){
               System.out.println(" no es el correcto");
           }

            }
            while (respuesta.equals("si")) ;
            System.out.println(lista.size());
            System.out.println(suma(lista));
            System.out.println(media(lista));

    }
    public static double suma(List<Integer> lista){

        int suma=0;
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i) > 0) {

                suma += lista.get(i);
            }
        }
        return suma;
    }
    public static double media(List<Integer> lista){
       int media=0;
       int suma=0;
       int i =0;
        for (i =0; i< lista.size();i++) {
            if(lista.get(i)>0) {
                suma += lista.get(i);



                media = suma / lista.size();

            }

        }

        return media ;
    }


}
