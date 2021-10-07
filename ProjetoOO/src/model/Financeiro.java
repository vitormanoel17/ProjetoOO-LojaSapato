package model;
import java.util.*;

public class Financeiro {
	private float contasApagar;
	private int contasAreceber;
	private ArrayList <Venda> venda =new ArrayList<>();
	private float saldo;
	private Estoque estoque;
	
	public Financeiro(){
		super();
		this.contasAreceber = 0;
		this.contasApagar = 0;
		this.saldo = 0;
	
	}
	
	public Financeiro(Venda v) {
		super();
		venda.add(v);
		this.contasAreceber = 0;
		this.contasApagar = 0;
		this.saldo = 0;
	}
	
	public Financeiro(Estoque e) {
		super();
		this.estoque =  e;
		this.contasAreceber = 0;
		this.contasApagar = 0;
		this.saldo = 0;
	
	}
	
	public Financeiro(Venda v, Estoque e) {
		super();
		this.estoque = e;
		venda.add(v);
		this.contasAreceber = 0;
		this.contasApagar = 0;
		this.saldo = 0;
	}
	
	
	public void contasPagas() {
		
	}
	
	// calcula o valor a ser pago pelos produtos em estoque
	public String contasPendentes() {
		this.contasApagar = 0;
		for(int i = 0; i < estoque.getCalcado().size(); i++) {
			this.contasApagar += estoque.getCalcado().get(i).getCusto();
		}
		return "Valor pendente:" + " R$ " + this.contasApagar ;
	}
	
	// calcula o valor a receber pelas vendas
	public String contasAreceber() {
		this.contasAreceber = 0;
		for(Venda v : venda){
			this.contasAreceber += v.getValorTot();
		}
		return "Valor a Receber: " + " R$ " + this.contasAreceber;
	}
	
	// lista as vendas realizadas
	public String[] historicoVendas() {
		String[] vendas = new String[venda.size()];
		int i = 0;
		if(!venda.isEmpty()) {
		
			for(Venda v : venda) {
				vendas[i] = i + " - "+ v.toString();
				i++;
			}
		
		}else{
			System.out.println("nenhuma venda encontrada!");
		}
		return vendas;
	}
	
	// calcula o valor do saldo da loja
	public String calculoSaldo() {
		contasPendentes();
		this.saldo = this.contasAreceber - this.contasApagar;
		return "Saldo atual do estabelecimento: "+ this.saldo + " R$";
	}
	

	public float getContasApagar() {
		return contasApagar;
	}

	public void setContasApagar(int contasApagar) {
		this.contasApagar = contasApagar;
	}

	public int getContasAreceber() {
		return contasAreceber;
	}

	public void setContasAreceber(int contasAreceber) {
		this.contasAreceber = contasAreceber;
	}

	public void setVenda(Venda v) {
		venda.add(v);
	}

	public ArrayList<Venda> getVenda(){
		return venda;
	}

	public float getSaldo() {
		return saldo;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}
	
	public Estoque getEstoque() {
		return estoque;
	}
	
	public void setEstoque(Estoque estoque) {
		this.estoque = estoque;
	}
	
}
