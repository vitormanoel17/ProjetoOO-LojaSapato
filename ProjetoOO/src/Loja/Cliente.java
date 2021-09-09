package Loja;
public class Cliente extends Pessoa {
	Compra compra;

	public Cliente(Endereco endereco, Telefone telefone, String nome) {
		super(endereco, telefone, nome);
	}

	public Compra getCompra() {
		return compra;
	}

	public void setCompra(Compra compra) {
		this.compra = compra;
	}

	@Override
	public String toString() {
		return "Nome=" + getNome() + "\nEndereco: " + getEndereco().toString();
	}
	
	
}
