package Genericos;

import java.util.ArrayList;
import java.util.List;

public class Principal {
    public static void main(String [] args){

        List<String> num= new ArrayList<>();
        num.add("hola");
        num.add("que tal");
        num.add("como estas");
        Gen <String> gen = new Gen<>(num);
        System.out.println(gen);
    }
}
