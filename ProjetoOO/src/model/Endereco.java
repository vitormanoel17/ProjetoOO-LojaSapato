package model;
/**
 * Classe que representa um Endereço de uma pessoa
 * @author Vitor manoel
 * @version 1.0
 */
public class Endereco {
	private String cidade;
	private String estado;
	private String cep;
	private int numero;
	private String bairro;
	private String logradouro;
	
	public Endereco(String cidade, String estado, String cep, int numero, String bairro, String logradouro) {
		super();
		this.cidade = cidade;
		this.estado = estado;
		this.cep = cep;
		this.numero = numero;
		this.bairro = bairro;
		this.logradouro = logradouro;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public String getLogradouro() {
		return logradouro;
	}
	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}
	
	@Override
	public String toString() {
		return "cidade= " + cidade + ", estado= " + estado + 
				", cep=" + cep + ", numero= " + numero + ", bairro= "
				+ bairro + ", logradouro= " + logradouro;
	}
	
}
