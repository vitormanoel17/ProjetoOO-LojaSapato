package controller;

import model.*;
import java.util.*;

/**
 * Classe que controla os Clientes cadastrados no sistema
 * @author Vitor manoel
 * @version 1.0
 */

public class ControleCliente {
    private ArrayList<Cliente> c ;

    public ControleCliente(ControleDados d) {
        c = d.getClientes();
    }
    
    /**
     * Método para retornar o nome dos clientes cadastrados
     * @return vetor de String contendo a lista de nomes de clientes cadastrados
     */

    public String[] getClienteNome(){
        String[] nomes = new String[c.size()]; 
        int i = 0;
        for(Cliente cl : c){
            nomes[i] = cl.getNome();
            i++;
        }
        return nomes;
    }
    
    /**
     * Método para realizar busca por nome de cliente 
     * @param nome String que representa o nome a ser buscado
     * @return retorna uma lista de nomes encontrados ou mensagem de não encontrado
     */

    public String[] buscarNome(String nome){
        ArrayList<String> resultado = new ArrayList<>();

        for(Cliente cl : c){
            if(nome.equals(cl.getNome())){
                resultado.add(cl.getNome());
            }
        }
        
        if(resultado.isEmpty()){
            resultado.add("Nome nÃ£o encontrado");
        }   
        return resultado.toArray(new String[0]);
    }
    
    /**
     * Método que busca o index do nome encontrado na busca
     * @param busca recebe o resultado da busca por nome
     * @return retorna um array com as posições nas quais o nome pesquisado é encontrado
     */
    
    /*retorna um array com diferentes index de posição, para que seja possivel carregar os dados do cliente correto,
    caso tenha varios clientes com o mesmo nome*/
    public int[] getIndexBusca(String [] busca){
        int[] index = new int[c.size()];
        int j = 0;

        for(int i = 0; i< c.size(); i++ ){
            if(c.get(i).getNome().contains(busca[0])){
                index[j] = i;
                j++;
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
