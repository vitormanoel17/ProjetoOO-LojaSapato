package Loja;
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
	
	public void listarProdutos() {
		for(Calcado c : calcado) {
			System.out.println("Categoria: "+ c.getCategoria() +"| Cor: "+ c.getCor() + 
							"| Tamanho: " + c.getTamanho() +"| Marca: "+ c.getMarca());
		}
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
