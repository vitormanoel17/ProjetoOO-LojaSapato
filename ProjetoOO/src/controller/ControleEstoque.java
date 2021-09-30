package controller;

import java.util.ArrayList;

import model.Calcado;
import model.Estoque;

public class ControleEstoque {
    Estoque estoque;

    public ControleEstoque(ControleDados d){
        estoque = d.getDados().getEstoque();
    }

    public Calcado getCalcado(int i){
        return estoque.getCalcado().get(i);
    }

    public Estoque getEstoque(){
        return estoque;
    }

    public void setCalcado(Calcado c){
        estoque.setCalcado(c);
    }
    
}
