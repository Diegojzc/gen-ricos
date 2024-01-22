package Iteradores;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Principal {
    public static void main(String[] args) {

        List<Clientes> listaClientes = new ArrayList<>();
        Clientes clientes = new Clientes("Diego", "dfdgdfgd", 1200);
        Clientes clientes1 = new Clientes("Paloma", "dgdfhfgh", 1500);
        Clientes clientes2 = new Clientes("maya", "dfdfgfd", 0);
        listaClientes.add(clientes);
        listaClientes.add(clientes1);
        listaClientes.add(clientes2);

        Iterator<Clientes> it = listaClientes.iterator();
        while (it.hasNext()) {
            String nombre = it.next().getNombre();
            if (nombre.equals("Diego")) {
                it.remove();
            }
        }
        for (Clientes cli: listaClientes) {
            System.out.println(cli);
        }

        }
    }

