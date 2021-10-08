package controller;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import model.*;

public class ControleEstoque {
    Estoque estoque;

    public ControleEstoque(ControleDados d){
        estoque = d.getEstoque();
    }

    public Calcado getCalcado(int i){
        return estoque.getCalcado().get(i);
    }

    public Estoque getEstoque(){
        return estoque;
    }

    public String[] listarProdutos() {
		String[] detalhe = new String[estoque.getCalcado().size()];
		int i = 0;
		for(Calcado c : estoque.getCalcado()) {
			detalhe[i] = "Categoria: "+ c.getCategoria() +"| Cor: "+ c.getCor() + 
							"| Tamanho: " + c.getTamanho() +"| Marca: "+ c.getMarca();
			i++;
		}
		return detalhe;
	}

    public String[] buscarNome(String nome){
        ArrayList<String> resultado = new ArrayList<>();

        for(Calcado c : estoque.getCalcado()){

            if(nome.equals(c.getCategoria())){
                resultado.add(new String("Categoria: "+ c.getCategoria() +"| Cor: "+ c.getCor() + 
                                "| Tamanho: " + c.getTamanho() +"| Marca: "+ c.getMarca()));
            }
        }
        
        if(resultado.isEmpty()){
            resultado.add("Nome não encontrado");
        }   

        return resultado.toArray(new String[0]);
    }
    
    public int getIndexBusca(String [] busca){
        int index = 0;
        
        for(int i = 0; i< estoque.getCalcado().size(); i++ ){
            System.out.println(estoque.getCalcado().get(i).getCategoria());
            if(busca[0].equals("Categoria: "+ estoque.getCalcado().get(i).getCategoria() +"| Cor: "+ estoque.getCalcado().get(i).getCor() + 
                         "| Tamanho: " + estoque.getCalcado().get(i).getTamanho() +"| Marca: "+ estoque.getCalcado().get(i).getMarca())){
                index = i;
            }

        }   
        return index;
    }


    public void excluirProd(int i){
        estoque.getCalcado().remove(i);
    }
    
    public void mensagem(){
        if(estoque.avisarEstoqueBaixo()){
            JOptionPane.showMessageDialog(null, "Estoque esgotando", null, JOptionPane.INFORMATION_MESSAGE);
        }
    }
}
