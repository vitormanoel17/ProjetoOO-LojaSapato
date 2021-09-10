package Loja;

public class Bota extends Calcado {
	private String lingueta;
	private String palmilha;
	private String fechamento;
	private String materialDoForro;
	private int alturaDoCano;
	
	public Bota(String categoria, String cor, int tamanho, int peso, String marca, 
				String material, float preco,String descricao, float custo, 
				Fornecedor fornecedor) {
		super(categoria, cor, tamanho, peso, marca, material, preco, descricao, custo, 
				fornecedor);
		
	}

	public String getLingueta() {
		return lingueta;
	}

	public void setLingueta(String lingueta) {
		this.lingueta = lingueta;
	}

	public String getPalmilha() {
		return palmilha;
	}

	public void setPalmilha(String palmilha) {
		this.palmilha = palmilha;
	}

	public String getFechamento() {
		return fechamento;
	}

	public void setFechamento(String fechamento) {
		this.fechamento = fechamento;
	}

	public String getMaterialDoForro() {
		return materialDoForro;
	}

	public void setMaterialDoForro(String materialDoForro) {
		this.materialDoForro = materialDoForro;
	}

	public int getAlturaDoCano() {
		return alturaDoCano;
	}

	public void setAlturaDoCano(int alturaDoCano) {
		this.alturaDoCano = alturaDoCano;
	}
	
	
	
}
