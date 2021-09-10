package Loja;
import java.util.*;
public class Teste {

	public static void main(String[] args) {
		Dados dados = new Dados();
		dados.fileWithSomeData();
		// TODO Auto-generated method stub
		GregorianCalendar d = new GregorianCalendar();
		Telefone t = new Telefone(61,995818909);
		Endereco e = new Endereco("Ocidental","GO","72880672","70",
								"centro","super quadra 17 quadra 6");
		Cliente c1 = new Cliente(e, t,"Vitor Manoel");
		Cliente c2 = new Cliente(e,t,"Vitor Aquino");
		
		//System.out.print(cliente.toString());
		Endereco ef = new Endereco("Brasilia","DF","72949340","Qn 12","Asa Norte","QN 404 SUL");
		Telefone tf = new Telefone(61,94349300);
		Date data = d.getTime();
		Funcionario f = new Funcionario(ef,tf,"Daniel","Gerente",data,1778.50f);
		//System.out.println(f.getIngresso());
		Fornecedor fo = new Fornecedor("Alfredo calçados",e,t);
		Bota b = new Bota("Bota","Preta",40,400,"Oakley","Couro",399.99f,"Bota de couro para trilhas",200f, fo);
		Estoque estoque = new Estoque(b);
		Venda v1 = new Venda(estoque,b,c1,f,data);
		Venda v2 = new Venda(estoque,b,c2,f,data);
		Financeiro fi = new Financeiro(v1);
		fi.setVenda(v2);
		for(int i = 0; i<7;i++) {
		fi.setVenda(dados.getVendas(i));
		}
		fi.historicoVendas();
		dados.getFinanceiro().historicoVendas();
	}

}
