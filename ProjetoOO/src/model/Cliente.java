package model;
import java.util.*;

public class Cliente extends Pessoa {
	private Compra[] compra = new Compra[50];
	private int quantCompras;

	public Cliente(Endereco endereco, Telefone telefone, String nome) {
		super(endereco, telefone, nome);
		this.quantCompras = 0;
	}
	
	//cliente ganha 10% de desconto
	public float ganharDesconto(float preco) {
		if (this.quantCompras >= 2) {		
			preco = preco*0.9f;
		}
		return preco;
	}
	
	//lista as compras associadas ao cliente
	public void listarCompras() {
		for(int i = 0; i< quantCompras; i++) {
			System.out.println(this.compra[i].toString());
		}
	}

	public Compra[] getCompra() {
		return compra;
	}


	public void setCompra(Calcado calcado,Date data) {
		this.compra[quantCompras] = new Compra(calcado,data);
	}


	public int getQuantCompras() {
		return quantCompras;
	}


	public void setQuantCompras(int quantCompras) {
		this.quantCompras = quantCompras;
	}


	@Override
	public String toString() {
		return "Nome=" + getNome() + "\nEndereco: " + getEndereco().toString();
	}
	
	
}
