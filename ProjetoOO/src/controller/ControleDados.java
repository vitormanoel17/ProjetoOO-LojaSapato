package controller;

import model.*;

public class ControleDados {
    
    private Dados dados = new Dados();

    public ControleDados(){
        dados.fileWithSomeData();
    }

    public Dados getDados() {
        return dados;
    }

    public Cliente[] getClientes(){
        return dados.getCliente();
    }

    public Funcionario[] getFuncionarios(){
        return dados.getFuncionario();
    }

    public void removerCliente(int i){
        dados.getCliente()[i].getClass();
    }
}
