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

    public String[] buscarNome(String nome){
        ArrayList<String> resultado = new ArrayList<>();

        for(Cliente cl : c){
            if(nome.equals(cl.getNome())){
                resultado.add(cl.getNome());
            }
        }
        
        if(resultado.isEmpty()){
            resultado.add("Nome não encontrado");
        }   
        return resultado.toArray(new String[0]);
    }

    public int getIndexBusca(String [] busca){
        int index = 0;
        
        for(int i = 0; i< c.size(); i++ ){
            if(c.get(i).getNome().contains(busca[0])){
                index = i;
            }

        }   
        return index;
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
