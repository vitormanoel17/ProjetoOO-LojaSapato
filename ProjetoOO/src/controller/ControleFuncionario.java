package controller;

import java.util.Date;

import java.util.ArrayList;
import model.Endereco;
import model.Funcionario;
import model.Telefone;

public class ControleFuncionario {
    Funcionario[] f;
    
    public ControleFuncionario(ControleDados d){
        f = d.getFuncionarios();
    }

    public String[] getNomesFuncionarios(){
        String[] nomes = new String[10];
        for(int i = 0; i<10; i++){
            nomes[i] = f[i].getNome();
        }
        
        return nomes;
    }

    public Endereco getEndereco(int i){
        return f[i].getEndereco();
    }

    public Telefone getTelefone(int i){
        return f[i].getTelefone();
    }

    public String getCargo(int i){
        return f[i].getCargo();
    }

    public int getQuantVendas(int i){
        return f[i].getQuantDeVendas();
    }

    public float getSalario(int i){
        return f[i].getSalario();
    }

    public Date getIngresso(int i){
        return f[i].getIngresso();
    }


}
