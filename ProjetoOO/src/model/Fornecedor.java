package model;

/** 
 * Classe que representa o fornecedor de produtos do estabelecimento
 * @author Vitor manoel
 * @version 1.0
 */
public class Fornecedor {
	private String nome;
	private Endereco endereco;
	private Telefone telefone;
	
	public Fornecedor(String nome, Endereco endereco, Telefone telefone) {
		super();
		this.nome = nome;
		this.endereco = endereco;
		this.telefone = telefone;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
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
	
	
}
