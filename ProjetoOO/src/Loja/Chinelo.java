package Loja;

public class Chinelo extends Calcado {
	
	private String materialTira;
	private String solado;
	
	public Chinelo(String categoria, String cor, int tamanho, int peso, String marca, String material, float preco,
			String descricao, float custo, Fornecedor fornecedor) {
		super(categoria, cor, tamanho, peso, marca, material, preco, descricao, custo, fornecedor);
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
