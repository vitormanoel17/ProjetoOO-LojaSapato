package Loja;

public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Telefone t = new Telefone(61,995818909);
		Endereco e = new Endereco("Ocidental","GO","72880672","70",
								"centro","super quadra 17 quadra 6");
		Cliente cliente = new Cliente(e, t,"Vitor Manoel");
		System.out.print(cliente.toString());
	}

}
