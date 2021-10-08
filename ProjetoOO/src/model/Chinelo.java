package model;

/**
 * Classe que modela o objeto chinelo por meio de suas características
 * @author Vitor manoel
 * @version 1.0
 */

public class Chinelo extends Calcado {
	
	private String materialTira;
	private String solado;
	
	public Chinelo(String categoria, String cor, int tamanho, String marca, String material, float preco,
			String descricao, float custo) {
		super(categoria, cor, tamanho, marca, material, preco, descricao, custo);
		// TODO Auto-generated constructor stub
	}
	
	public String getMaterialTira() {
		return materialTira;
	}
	public void setMaterialTira(String materialTira) {
		this.materialTira = materialTira;
	}
	public String getSolado() {
		return solado;
	}
	public void setSolado(String solado) {
		this.solado = solado;
	}
	
}
