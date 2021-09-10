package Loja;
import java.util.*;

public class Dados {
	private Cliente[] cliente = new Cliente[50];
	private Funcionario[] funcionario = new Funcionario[50];
	private Venda[] vendas = new Venda[50];
	private Telefone[] tel = new Telefone [50];
	private Endereco[] end = new Endereco[50];
	private Bota[] bota = new Bota[50];
	private Fornecedor[] fornecedor = new Fornecedor[50];
	private Estoque estoque = new Estoque();
	private Financeiro financeiro = new Financeiro(estoque);
	
	public void fileWithSomeData() {
		Date d = Calendar.getInstance().getTime();
		
		// instanciando os objetos
		for (int i = 0; i<10;i++) {
			tel[i] = new Telefone(11*i,11111111*i);
			
			end[i] = new Endereco("cidade"+i,"estado"+i,"12"+i,1+i,"bairro"+i,"logradouro"+i);
			
			cliente[i] = new Cliente(end[i],tel[i],"nome"+i);
			
			funcionario[i] = new Funcionario(end[i],tel[i],"Name"+i,"cargo"+1,d,1000*i);
			
			fornecedor[i] = new Fornecedor("noem"+i,end[i],tel[i]);
			
			bota[i] = new Bota("bota","cor"+i,30+i,"marca"+i,"material"+1,200+10*i,"descricao"+i,100+i);
			
			vendas[i] = new Venda(estoque,bota[i],cliente[i],funcionario[i],d);
	
			vendas[i].realizarVenda();
			
			estoque.setCalcado(bota[i]);
			
			financeiro.setVenda(vendas[i]);
		}
	}

	public Estoque getEstoque() {
		return estoque;
	}

	public void setEstoque(Estoque estoque) {
		this.estoque = estoque;
	}

	public Financeiro getFinanceiro() {
		return financeiro;
	}

	public void setFinanceiro(Financeiro financeiro) {
		this.financeiro = financeiro;
	}

	public Venda[] getVendas() {
		return vendas;
	}

	public Cliente getCliente(int i) {
		return cliente[i];
	}

	public void setCliente(Cliente[] cliente) {
		this.cliente = cliente;
	}

	public Funcionario[] getFuncionario() {
		return funcionario;
	}

	public void setFuncionario(Funcionario[] funcionario) {
		this.funcionario = funcionario;
	}

	public Venda getVendas(int i) {
		return vendas[i];
	}

	public void setVendas(Venda[] vendas) {
		this.vendas = vendas;
	}

	public Telefone[] getTel() {
		return tel;
	}

	public void setTel(Telefone[] tel) {
		this.tel = tel;
	}

	public Endereco[] getEnd() {
		return end;
	}

	public void setEnd(Endereco[] end) {
		this.end = end;
	}

	public Bota[] getBota() {
		return bota;
	}

	public void setBota(Bota[] bota) {
		this.bota = bota;
	}

	public Fornecedor[] getFornecedor() {
		return fornecedor;
	}

	public void setFornecedor(Fornecedor[] fornecedor) {
		this.fornecedor = fornecedor;
	}
	
}
