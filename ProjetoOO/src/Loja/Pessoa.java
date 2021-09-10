package Loja;

abstract public class Pessoa {
	private Endereco endereco;
	private Telefone telefone;
	private String nome;
	
	public Pessoa(Endereco endereco, Telefone telefone, String nome) {
		super();
		this.endereco = endereco;
		this.telefone = telefone;
		this.nome = nome;
	}
	
	public Endereco getEndereco() {
		return endereco;
	}
	
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
	public Telefone getTelefone() {
		return telefone;
	}
	
	public void setTelefone(Telefone telefone) {
		this.telefone = telefone;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
}
