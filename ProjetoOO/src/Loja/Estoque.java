package Loja;
import java.util.ArrayList;
public class Estoque {
	private ArrayList<Calcado> ListaProdutos = new ArrayList<>();
	
	public Estoque(ArrayList<Calcado> listaProdutos) {
		super();
		ListaProdutos = listaProdutos;
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
