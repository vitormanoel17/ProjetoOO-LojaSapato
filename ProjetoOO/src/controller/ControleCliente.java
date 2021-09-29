package controller;

import model.*;

public class ControleCliente {
    private Cliente[] c;

    public ControleCliente(ControleDados d) {
        c = d.getDados().getCliente();
    }

    public String[] getClienteNome(){
        String[] nomes = new String[10]; 
        for(int i = 0; i < 10; i++){
            nomes[i] = c[i].getNome();
        }
        return nomes;
    }

    public int getQtdCompras(int i){
        return c[i].getQuantCompras();
    }

    public Compra[] getCompra(int i){
        return c[i].getCompra();
    }

    public String getNome(int i){
        return c[i].getNome();
    }

    public Telefone getTelefone(int i){
        return c[i].getTelefone();
    }

    public Endereco getEndereco(int i){
        return c[i].getEndereco();
    }

    
}
