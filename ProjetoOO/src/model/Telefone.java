package model;

/**
 * Classe que representa um telefone de uma pessoa
 * @author Vitor manoel
 * @version 1.0
 */
public class Telefone {
	private int ddd;
	private int numero;
	
	public Telefone() {
		super();
	}
	
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
	
	@Override
	public String toString() {
		return "(" + ddd + ") "+ numero;
	}
}
