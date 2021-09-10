package Loja;
public class Cliente extends Pessoa {
	private Compra[] compra = new Compra[50];
	private int quantCompras;

	public Cliente(Endereco endereco, Telefone telefone, String nome) {
		super(endereco, telefone, nome);
	}

	public void ganharDesconto() {
		int arrayLength = compra.length;
		if (arrayLength > 5) {		
			
		}
	}

	public Compra[] getCompra() {
		return compra;
	}


	public void setCompra(Compra[] compra) {
		this.compra = compra;
	}


	public int getQuantCompras() {
		return quantCompras;
	}


	public void setQuantCompras(int quantCompras) {
		this.quantCompras = quantCompras;
	}


	@Override
	public String toString() {
		return "Nome=" + getNome() + "\nEndereco: " + getEndereco().toString();
	}
	
	
}
