package Loja;

public class Telefone {
	int ddd;
	int numero;
	
	public Telefone(int ddd, int numero) {
		super();
		this.ddd = ddd;
		this.numero = numero;
	}
	public int getDdd() {
		return ddd;
	}
	public void setDdd(int ddd) {
		this.ddd = ddd;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	
}
