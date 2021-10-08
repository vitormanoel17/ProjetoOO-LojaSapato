package controller;

import java.util.Date;
import model.Endereco;
import model.Funcionario;
import model.Telefone;
import java.util.*;

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

    
    public String[] buscarNome(String nome){
        ArrayList<String> resultado = new ArrayList<>();
        
        for(Funcionario fun : f){
            if(nome.equals(fun.getNome())){
                resultado.add(fun.getNome());
            }
    
        }
        
        if(resultado.isEmpty()){
            resultado.add("Nome não encontrado");
        }   

        return resultado.toArray(new String[0]);
    }

    public int getIndexBusca(String [] busca){
        int index = 0;
        for(int i = 0; i< f.size(); i++ ){
            if(f.get(i).getNome().contains(busca[0])){
                index = i;
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
