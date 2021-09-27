package model;

public class SapatoSocial extends Calcado{
	private String materialDoForro;
	private String tipoDeBico;
	private int alturaDoSalto;
	private String palmilha;
	
	public SapatoSocial(String categoria, String cor, int tamanho, String marca,
			String material, float preco,String descricao, float custo) {
		super(categoria, cor, tamanho, marca, material, preco, descricao, custo);
	}
	
	public String getMaterialDoForro() {
		return materialDoForro;
	}
	
	public void setMaterialDoForro(String materialDoForro) {
		this.materialDoForro = materialDoForro;
	}
	
	public String getTipoDeBico() {
		return tipoDeBico;
	}
	
	public void setTipoDeBico(String tipoDeBico) {
		this.tipoDeBico = tipoDeBico;
	}
	
	public int getAlturaDoSalto() {
		return alturaDoSalto;
	}
	
	public void setAlturaDoSalto(int alturaDoSalto) {
		this.alturaDoSalto = alturaDoSalto;
	}
	
	public String getPalmilha() {
		return palmilha;
	}
	
	public void setPalmilha(String palmilha) {
		this.palmilha = palmilha;
	}

}
