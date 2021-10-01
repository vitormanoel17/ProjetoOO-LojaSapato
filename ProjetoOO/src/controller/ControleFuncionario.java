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
        String[] nomes = new String[10];
        int i = 0;
        for(Funcionario func : f){
            nomes[i] = func.getNome();
            i++;
        }
        
        return nomes;
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
