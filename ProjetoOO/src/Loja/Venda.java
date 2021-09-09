package Loja;
import java.util.Date;

public class Venda {
	private Estoque estoque;
	private Calcado calcado;
	private Cliente cliente;
	private Funcionario funcionario;
	private Date dataDaVenda;
	
	public Venda(Estoque estoque, Calcado calcado, Cliente cliente, 
			Funcionario funcionario, Date dataDaVenda) {
		super();
		this.estoque = estoque;
		this.calcado = calcado;
		this.cliente = cliente;
		this.funcionario = funcionario;
		this.dataDaVenda = dataDaVenda;
	}
	public Estoque getEstoque() {
		return estoque;
	}
	public void setEstoque(Estoque estoque) {
		this.estoque = estoque;
	}
	public Calcado getCalcado() {
		return calcado;
	}
	public void setCalcado(Calcado calcado) {
		this.calcado = calcado;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public Funcionario getFuncionario() {
		return funcionario;
	}
	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}
	public Date getDataDaVenda() {
		return dataDaVenda;
	}
	public void setDataDaVenda(Date dataDaVenda) {
		this.dataDaVenda = dataDaVenda;
	}
	
	
}
