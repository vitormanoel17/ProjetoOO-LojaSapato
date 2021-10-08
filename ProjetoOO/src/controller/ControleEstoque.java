package controller;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import model.*;

/**
 * Classe que controla o estoque do estabelecimento
 * @author Vitor manoel
 * @version 1.0
 */
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
    
    /**
     * Método que lista os produtos cadastrados no sistema
     * @return retorna uma vetor de string com os produtos cadastrados
     */

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
    
    /**
     * Método para realizar busca por categoria de produto 
     * @param nome String que representa a categoria a ser buscado
     * @return retorna uma lista de nomes encontrados ou mensagem de não encontrado
     */
    public String[] buscarNome(String nome){
        ArrayList<String> resultado = new ArrayList<>();

        for(Calcado c : estoque.getCalcado()){

            if(nome.equals(c.getCategoria())){
                resultado.add(new String("Categoria: "+ c.getCategoria() +"| Cor: "+ c.getCor() + 
                                "| Tamanho: " + c.getTamanho() +"| Marca: "+ c.getMarca()));
            }
        }
        
        if(resultado.isEmpty()){
            resultado.add("Nome nÃ£o encontrado");
        }   

        return resultado.toArray(new String[0]);
    }
    
    /**
     * Método que busca o index da categoria encontrado na busca
     * @param busca recebe o resultado da busca por categoria
     * @return retorna um array com as posições nas quais a categoria pesquisado é encontrada
     */
    public int[] getIndexBusca(String [] busca){
        int[] index = new int[estoque.getCalcado().size()];
        int j = 0;
        int i = 0;
        for(Calcado c : estoque.getCalcado()){
            if(busca[0].contains("Categoria: "+ c.getCategoria() +"| Cor: "+ c.getCor() + 
                                "| Tamanho: " + c.getTamanho() +"| Marca: "+ c.getMarca())){
                index[j] = i;
                j++;
            }

        }   
        return index;
    }
    

    public void excluirProd(int i){
        estoque.getCalcado().remove(i);
    }
    
    /**
     * Método que exibe um alerta de estoque baixo na tela
     */
    public void mensagem(){
        if(estoque.avisarEstoqueBaixo()){
            JOptionPane.showMessageDialog(null, "Estoque esgotando", null, JOptionPane.INFORMATION_MESSAGE);
        }
    }
}
