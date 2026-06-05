package org.example.Iterator;

import java.util.Iterator;


public class Censo {

    public static Integer contarClientesComConta(Padaria padaria){
        int quantidade = 0;
        for (Cliente cliente : padaria){
            if (cliente.isConta()){
                quantidade++;
            }
        }
        return quantidade;
    }

    public static Integer contatTotalClientes(Padaria padaria){
        int quantidade = 0;
        for (Iterator a = padaria.iterator(); a.hasNext();){
            quantidade++;
            a.next();
        }
        return quantidade;
    }
}
