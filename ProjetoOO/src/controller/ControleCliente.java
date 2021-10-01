package controller;

import model.*;
import java.util.*;

public class ControleCliente {
    private ArrayList<Cliente> c ;

    public ControleCliente(ControleDados d) {
        c = d.getClientes();
    }

    public String[] getClienteNome(){
        String[] nomes = new String[c.size()]; 
        int i = 0;
        for(Cliente cl : c){
            nomes[i] = cl.getNome();
            i++;
        }
        return nomes;
    }

    public int getQtdCompras(int i){
        return c.get(i).getQuantCompras();
    }

    public Compra[] getCompra(int i){
        return c.get(i).getCompra();
    }

    public String getNome(int i){
        return c.get(i).getNome();
    }

    public Telefone getTelefone(int i){
        return c.get(i).getTelefone();
    }

    public Endereco getEndereco(int i){
        return c.get(i).getEndereco();
    }

    
}
