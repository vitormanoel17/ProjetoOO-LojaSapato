package Loja;
import java.util.Date;

public class Funcionario extends Pessoa {
	private String cargo;
	private int numeroDeVendas;
	private Date ingresso;
	private float salario;
	
	public Funcionario(Endereco endereco, Telefone telefone, String nome, String cargo, 
						Date ingresso, float salario) {
		super(endereco, telefone, nome);
		this.cargo = cargo;
		this.numeroDeVendas = 0;
		this.ingresso = ingresso;
		this.salario = salario;
	}
	
	public String getCargo() {
		return cargo;
	}
	
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	
	public int getNumeroDeVendas() {
		return numeroDeVendas;
	}
	
	public void setNumeroDeVendas(int numeroDeVendas) {
		this.numeroDeVendas = numeroDeVendas;
	}
	
	public Date getIngresso() {
		return ingresso;
	}
	
	public void setIngresso(Date ingresso) {
		this.ingresso = ingresso;
	}
	
	public float getSalario() {
		return salario;
	}
	
	public void setSalario(float salario) {
		this.salario = salario;
	}
		
}

