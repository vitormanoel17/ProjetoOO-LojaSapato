package Loja;
import java.util.*;

public class Financeiro {
	private int contasApagar;
	private int contasAreceber;
	private ArrayList <Venda> venda =new ArrayList<>();
	private float saldo;
	
	public Financeiro(){
		super();
	}
	public Financeiro(Venda v) {
		super();
		this.contasApagar = contasApagar;
		this.contasAreceber = contasAreceber;
		venda.add(v);
		this.saldo = saldo;
	}

	
	public void contasPagas() {
		
	}
	
	public void contasPendentes() {
		
	}
	
	public void contasAreceber() {
		
	}
	
	public void historicoVendas() {
		if(!venda.isEmpty()) {
			System.out.println("--------------------VENDAS-------------------\n");
			for(Venda v : venda) {
				System.out.println((venda.indexOf(v)+1)+ " - "+ v.toString());
			}
		}else{
			System.out.println("nenhuma venda encontrada!");
		}
	}
	


	public void calculoLucro() {
		
	}
	

	public int getContasApagar() {
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

	public float getSaldo() {
		return saldo;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}
	
}
