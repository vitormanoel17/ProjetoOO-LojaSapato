package controller;

import model.*;
import java.util.*;

public class ControleDados {
    
    private Dados dados = new Dados();

    public ControleDados(){
        dados.fileWithSomeData();
    }

    public Dados getDados() {
        return dados;
    }

    public ArrayList<Cliente> getClientes(){
        return dados.getCliente();
    }

    public ArrayList<Funcionario> getFuncionarios(){
        return dados.getFuncionario();
    }

    public void removerCliente(int i){
        dados.getCliente().remove(i);
    }
    public void removerFuncionanrio(int i){
        dados.getFuncionario().remove(i);
    }

    public int getQtdVendas(){
        return dados.getFinanceiro().getVenda().size();
    }

    public Financeiro getfFinanceiro(){
        return dados.getFinanceiro();
    }

    public Estoque getEstoque(){
        return dados.getEstoque();
    }

    public void inserirEditarCliente(String[] newDados,int pos){
        getClientes().get(pos).setNome(newDados[0]);
        getClientes().get(pos).setEndereco(new Endereco(newDados[1], newDados[2], newDados[3], 
                                            Integer.parseInt(newDados[4]), newDados[5], newDados[6]));
      
        getClientes().get(pos).setTelefone(new Telefone(Integer.parseInt(newDados[7]),
                                                        Integer.parseInt(newDados[8])));
        }

    public void inserirEditarFuncionario(String[] newDados,int pos){
        getFuncionarios().get(pos).setNome(newDados[0]);
        getFuncionarios().get(pos).setEndereco(new Endereco(newDados[1], newDados[2], newDados[3], 
                                            Integer.parseInt(newDados[4]), newDados[5], newDados[6]));
      
        getFuncionarios().get(pos).setTelefone(new Telefone(Integer.parseInt(newDados[7]),
                                                        Integer.parseInt(newDados[8])));

    }

    public void inserirVenda(int prod,int cl,int f){
        Venda v = new Venda(getEstoque(),getEstoque().getCalcado().get(prod),
                            getClientes().get(cl),getFuncionarios().get(f),dados.getDate());
        System.out.println(getEstoque().getCalcado().get(prod).getCategoria() +
        getClientes().get(cl).getNome() + getFuncionarios().get(f).getNome());
        v.realizarVenda();
        dados.inserirVenda(v, getfFinanceiro().getVenda().size() + 1);
        getClientes().get(cl).listarCompras();
        System.out.println(getClientes().get(cl).getQuantCompras());
    } 


}
