package model;

/**
 * Classe que representa o objeto Tênis e suas caracteristicas fisicas
 * @author Vitor manoel
 * @version 1.0 
 */
public class Tenis extends Calcado{
	private String materialDoForro;
	private String pamilha;
	private String fechamento;
	private String pisada;
	private String alturaDoCano;
	private String indicacao;
	
	public Tenis(String categoria, String cor, int tamanho, String marca, 
			String material, float preco,String descricao, float custo) {
		super(categoria, cor, tamanho, marca, material, preco, descricao, custo);
	}
	
	public String getMaterialDoForro() {
		return materialDoForro;
	}
	
	public void setMaterialDoForro(String materialDoForro) {
		this.materialDoForro = materialDoForro;
	}
	
	public String getPamilha() {
		return pamilha;
	}
	
	public void setPamilha(String pamilha) {
		this.pamilha = pamilha;
	}
	
	public String getFechamento() {
		return fechamento;
	}
	
	public void setFechamento(String fechamento) {
		this.fechamento = fechamento;
	}
	
	public String getPisada() {
		return pisada;
	}
	
	public void setPisada(String pisada) {
		this.pisada = pisada;
	}
	
	public String getAlturaDoCano() {
		return alturaDoCano;
	}
	
	public void setAlturaDoCano(String alturaDoCano) {
		this.alturaDoCano = alturaDoCano;
	}
	
	public String getIndicacao() {
		return indicacao;
	}
	
	public void setIndicacao(String indicacao) {
		this.indicacao = indicacao;
	}
}
