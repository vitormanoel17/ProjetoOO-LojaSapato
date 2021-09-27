package model;

public abstract class Calcado {
	private String categoria;
	private String cor;
	private int tamanho;
	private int peso;
	private String marca;
	private String material;
	private float preco;
	private String descricao;
	private float custo;
	private Fornecedor fornecedor;
	
	public Calcado(String categoria, String cor, int tamanho, String marca, 
			String material, float preco,String descricao, float custo) {
		super();
		this.categoria = categoria;
		this.cor = cor;
		this.tamanho = tamanho;
		this.marca = marca;
		this.material = material;
		this.preco = preco;
		this.descricao = descricao;
		this.custo = custo;
	}
	
	public String getCategoria() {
		return categoria;
	}
	
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	
	public String getCor() {
		return cor;
	}
	
	public void setCor(String cor) {
		this.cor = cor;
	}
	
	public int getTamanho() {
		return tamanho;
	}
	
	public void setTamanho(int tamanho) {
		this.tamanho = tamanho;
	}
	
	public int getPeso() {
		return peso;
	}
	
	public void setPeso(int peso) {
		this.peso = peso;
	}
	
	public String getMarca() {
		return marca;
	}
	
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	public String getMaterial() {
		return material;
	}
	
	public void setMaterial(String material) {
		this.material = material;
	}
	
	public float getPreco() {
		return preco;
	}
	
	public void setPreco(float preco) {
		this.preco = preco;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public float getCusto() {
		return custo;
	}
	
	public void setCusto(float custo) {
		this.custo = custo;
	}
	
	public Fornecedor getFornecedor() {
		return fornecedor;
	}
	
	public void setFornecedor(Fornecedor fornecedor) {
		this.fornecedor = fornecedor;
	}
	
}
