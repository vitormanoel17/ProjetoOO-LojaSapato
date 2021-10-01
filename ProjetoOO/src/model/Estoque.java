package model;
import java.util.*;

public class Estoque {
	private ArrayList<Calcado> calcado = new ArrayList<>();
	
	public Estoque(){
		super();
	}
	
	public Estoque(Calcado c) {
		super();
		calcado.add(c);
	}
	
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
	
	
	public void avisoEstoqueBaixo() {
		if(calcado.size() > 5) {
			System.out.println("Estoque esgotando! ");
		}
	}
	
	public ArrayList<Calcado> getCalcado() {
		return calcado;
	}
	
	
	public void setCalcado(Calcado c) {
		calcado.add(c);
	}

}
