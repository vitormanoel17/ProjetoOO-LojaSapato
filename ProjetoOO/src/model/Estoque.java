package model;
import java.util.*;

/**
 * Classe que representa um estoque, armazenando os calçados cadastrados
 * @author Vitor manoel
 * @version 1.0
 */
public class Estoque {
	private ArrayList<Calcado> calcado = new ArrayList<>();
	
	public Estoque(){
		super();
	}
	
	public Estoque(Calcado c) {
		super();
		calcado.add(c);
	}
	
	/**
	 * Método que lista os produtos cadastrados no sistema
	 * @return	vetor de Strings que lista os produtos cadastrados
	 */
	
	public String[] listarProdutos() {
		String[] detalhe = new String[calcado.size()];
		int i = 0;
		for(Calcado c : calcado) {
			detalhe[i] = "Categoria: "+ c.getCategoria() +"| Cor: "+ c.getCor() + 
							"| Tamanho: " + c.getTamanho() +"| Marca: "+ c.getMarca();
			i++;
		}
		return detalhe;
	}
	
	/**
	 * Método emite um alerta de estoque baixo, caso a quantidade de produtos seja menor do que 5
	 * @return verdadeiro ou falso, emitindo se o estoque está baixo ou não
	 */
	public boolean avisarEstoqueBaixo() {
		if(calcado.size() < 5) {
			System.out.println("Estoque esgotando! ");
			return true;
		}
		return false;
	}
	
	public ArrayList<Calcado> getCalcado() {
		return calcado;
	}
	
	
	public void setCalcado(Calcado c) {
		calcado.add(c);
	}

}
