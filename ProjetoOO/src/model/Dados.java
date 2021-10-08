package model;
import java.util.*;

/**
 *  Determina dados pré cadastrados, para substituir o uso de um banco de dados
 * @author Vitor manoel
 * @version 1.0
 */

public class Dados {
	private ArrayList<Cliente> cliente = new ArrayList<Cliente>();
	private ArrayList<Funcionario> funcionario = new ArrayList<Funcionario>();
	private ArrayList<Venda> vendas = new ArrayList<Venda>();
	private ArrayList<Telefone> tel = new ArrayList<Telefone>();
	private ArrayList<Endereco> end = new ArrayList<Endereco>();
	private ArrayList<Bota> bota = new ArrayList<Bota>();
	private ArrayList<Fornecedor> fornecedor = new ArrayList<Fornecedor>();
	private Estoque estoque = new Estoque();
	private Financeiro financeiro = new Financeiro(estoque);
	private Date d;
	
	/**
	 * Método responsável por carregar dados no sistema quando solicitado
	 */
	public void fileWithSomeData() {
		d = Calendar.getInstance().getTime();
		
		// instanciando os objetos
		for (int i = 0; i<10;i++) {
			tel.add( new Telefone(11*i,11111111*i));
			
			end.add(new Endereco("cidade"+i,"estado"+i,"12"+i,1+i,"bairro"+i,"logradouro"+i));
			
			cliente.add(new Cliente(end.get(i),tel.get(i),"nome"+i));
			
			funcionario.add(new Funcionario(end.get(i),tel.get(i),"Name"+i,"cargo"+1,d,1000*i));
			
			fornecedor.add(new Fornecedor("noem"+i,end.get(i),tel.get(i)));
			
			bota.add(new Bota("bota","cor"+i,30+i,"marca"+i,"material"+1,200+10*i,"descricao"+i,100+i));
			
			vendas.add(new Venda(estoque,bota.get(i),cliente.get(i),funcionario.get(i),d));
	
			vendas.get(i).realizarVenda();
			
			estoque.setCalcado(bota.get(i));
			
			financeiro.setVenda(vendas.get(i));
		}
		vendas.add(new Venda(estoque,bota.get(1),cliente.get(2),funcionario.get(1),d));
		vendas.get(10).realizarVenda();
		vendas.add(new Venda(estoque,bota.get(2),cliente.get(2),funcionario.get(1),d));
		vendas.get(11).realizarVenda();
		vendas.add( new Venda(estoque,bota.get(3),cliente.get(2),funcionario.get(1),d));
		vendas.get(12).realizarVenda();
		vendas.add(new Venda(estoque,bota.get(4),cliente.get(2),funcionario.get(1),d));
		vendas.get(13).realizarVenda();
		
	}

	public Date getDate(){
		return d;
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

	public ArrayList<Venda> getVendas() {
		return vendas;
	}

	public ArrayList<Cliente> getCliente() {
		return cliente;
	}

	public Cliente getCliente(int i) {
		return cliente.get(i);
	}

	public void setCliente(Cliente cliente) {
		this.cliente.add(cliente);
	}

	public ArrayList<Funcionario> getFuncionario() {
		return funcionario;
	}

	public void setFuncionario(Funcionario funcionario) {
		this.funcionario.add(funcionario);
	}

	public Venda getVendas(int i) {
		return vendas.get(i);
	}

	public void setVendas(Venda vendas) {
		this.vendas.add(vendas);
	}

	public void inserirVenda(Venda venda,int i) {
		this.vendas.add(venda);
		financeiro.setVenda(venda);
	}

	public ArrayList<Telefone> getTel() {
		return tel;
	}

	public void setTel(Telefone tel) {
		this.tel.add(tel);
	}

	public ArrayList<Endereco> getEnd() {
		return end;
	}

	public void setEnd(Endereco end) {
		this.end.add(end);
	}

	public ArrayList<Bota> getBota() {
		return bota;
	}

	public void setBota(Bota bota) {
		this.bota.add(bota);
	}

	public ArrayList<Fornecedor> getFornecedor() {
		return fornecedor;
	}

	public void setFornecedor(Fornecedor fornecedor) {
		this.fornecedor.add(fornecedor);
	}
	
}
