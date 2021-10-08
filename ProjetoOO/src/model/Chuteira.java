package model;

/**
 * Classe que modela o objeto chuteira por meio de suas características
 * @author Vitor manoel
 * @version 1.0
 */

public class Chuteira extends Calcado{
	
	private String superficie;
	private String tecnologia;
	private String linha;
	private String materialDoForro;
	private String fechamento;
	
	
	public Chuteira(String categoria, String cor, int tamanho, String marca, String material, float preco,
			String descricao, float custo) {
		super(categoria, cor, tamanho, marca, material, preco, descricao, custo);
		// TODO Auto-generated constructor stub
	}
	
	public String getSuperficie() {
		return superficie;
	}
	public void setSuperficie(String superficie) {
		this.superficie = superficie;
	}
	public String getTecnologia() {
		return tecnologia;
	}
	public void setTecnologia(String tecnologia) {
		this.tecnologia = tecnologia;
	}
	public String getLinha() {
		return linha;
	}
	public void setLinha(String linha) {
		this.linha = linha;
	}
	public String getMaterialDoForro() {
		return materialDoForro;
	}
	public void setMaterialDoForro(String materialDoForro) {
		this.materialDoForro = materialDoForro;
	}
	public String getFechamento() {
		return fechamento;
	}
	public void setFechamento(String fechamento) {
		this.fechamento = fechamento;
	}
}
