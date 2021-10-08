package model;
import java.util.*;

/**
 * Classe que modela um cliente por meio de suas características
 * @author Vitor manoel
 * @version 1.0
 */

public class Cliente extends Pessoa {
	private Compra[] compra = new Compra[50];
	private int quantCompras;

	public Cliente(Endereco endereco, Telefone telefone, String nome) {
		super(endereco, telefone, nome);
		this.quantCompras = 0;
	}
	
	/**
	 * Aplica um desconto no preço de um determinado produto:
	 * (1) verifica se a quantidade de compra é maior do que 2 
	 * @param preco um inteiro que possui como valor o preço a ser pago por um produto
	 * @return o preço do produto com o desconto aplicado
	 */
	
	//cliente ganha 10% de desconto
	public float ganharDesconto(float preco) {
		if (this.quantCompras >= 2) {		
			preco = preco*0.9f;
		}
		return preco;
	}
	
	/**
	 * Lista as compras feitas por um cliente
	 */
	
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
