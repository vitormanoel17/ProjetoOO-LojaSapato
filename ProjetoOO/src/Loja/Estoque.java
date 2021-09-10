package Loja;
import java.util.ArrayList;

public class Estoque {
	private ArrayList<Calcado> ListaProdutos = new ArrayList<>();
	
	public Estoque(){
		super();
	}
	public Estoque(Calcado listaProdutos) {
		super();
		ListaProdutos.add(listaProdutos);
	}
	public void avisoEstoqueBaixo() {
		
	}
	
	public ArrayList<Calcado> getListaProdutos() {
		return ListaProdutos;
	}
	public void setListaProdutos(ArrayList<Calcado> listaProdutos) {
		ListaProdutos = listaProdutos;
	}

}
