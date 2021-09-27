package model;

public class Sandalia extends Calcado{
	private int alturaDoSalto;
	private String tipoDeSalto;
	private String fechamento;
	
	public Sandalia(String categoria, String cor, int tamanho, String marca, 
					String material, float preco, String descricao, float custo) {
		super(categoria, cor, tamanho, marca, material, preco, descricao, custo);
	}
	
	public int getAlturaDoSalto() {
		return alturaDoSalto;
	}
	
	public void setAlturaDoSalto(int alturaDoSalto) {
		this.alturaDoSalto = alturaDoSalto;
	}
	
	public String getTipoDeSalto() {
		return tipoDeSalto;
	}
	
	public void setTipoDeSalto(String tipoDeSalto) {
		this.tipoDeSalto = tipoDeSalto;
	}
	
	public String getFechamento() {
		return fechamento;
	}
	
	public void setFechamento(String fechamento) {
		this.fechamento = fechamento;
	}
	
}
