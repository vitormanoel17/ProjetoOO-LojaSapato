package model;
import java.util.Date;

public class Funcionario extends Pessoa {
	private String cargo;
	private int quantDeVendas;
	private Date ingresso;
	private float salario;
	
	public Funcionario(Endereco endereco, Telefone telefone, String nome, String cargo, 
						Date ingresso, float salario) {
		super(endereco, telefone, nome);
		this.cargo = cargo;
		this.quantDeVendas = 0;
		this.ingresso = ingresso;
		this.salario = salario;
	}
	
	
	public String getCargo() {
		return cargo;
	}
	
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	
	public int getQuantDeVendas() {
		return quantDeVendas;
	}


	public void setQuantDeVendas(int quantDeVendas) {
		this.quantDeVendas = quantDeVendas;
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

