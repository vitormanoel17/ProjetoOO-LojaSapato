package controller;

import java.util.Date;
import model.Endereco;
import model.Funcionario;
import model.Telefone;
import java.util.*;

/**
 * Classe que controla os Funcionários cadastrados no sistema
 * @author Vitor manoel
 * @version 1.0
 */
public class ControleFuncionario {
    ArrayList<Funcionario> f;
    
    public ControleFuncionario(ControleDados d){
        f = d.getFuncionarios();
    }

    public String[] getNomesFuncionarios(){
        String[] nomes = new String[f.size()];
        int i = 0;
        for(Funcionario func : f){
            nomes[i] = func.getNome();
            i++;
        }
        
        return nomes;
    }
    
    /**
     * Método para realizar busca por nome de funcionário 
     * @param nome String que representa o nome a ser buscado
     * @return retorna uma lista de nomes encontrados ou mensagem de não encontrado
     */
    
    public String[] buscarNome(String nome){
        ArrayList<String> resultado = new ArrayList<>();
        
        for(Funcionario fun : f){
            if(nome.equals(fun.getNome())){
                resultado.add(fun.getNome());
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
    caso tenha varios funcionarios com o mesmo nome*/
    public int[] getIndexBusca(String [] busca){
        int[] index = new int[f.size()];
        int j = 0;

        for(int i = 0; i< f.size(); i++ ){
            if(f.get(i).getNome().contains(busca[0])){
                index[j] = i;
                j++;
            }

        }   
        return index;
    }

    public String getNome(int i){
        return f.get(i).getNome();
    }

    public Endereco getEndereco(int i){
        return f.get(i).getEndereco();
    }

    public Telefone getTelefone(int i){
        return f.get(i).getTelefone();
    }

    public String getCargo(int i){
        return f.get(i).getCargo();
    }

    public int getQuantVendas(int i){
        return f.get(i).getQuantDeVendas();
    }

    public float getSalario(int i){
        return f.get(i).getSalario();
    }

    public Date getIngresso(int i){
        return f.get(i).getIngresso();
    }


}
