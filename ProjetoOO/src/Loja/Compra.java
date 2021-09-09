package Loja;
import java.util.GregorianCalendar;



public class Compra {
	private Calcado calcado;
	private int quantCompras;
	private GregorianCalendar dataDaCompra;
	
	public Compra(Calcado p, int quant,GregorianCalendar data){
		this.calcado = p;
		this.quantCompras = quant;
		this.dataDaCompra = data;
	}
	
	public void ganharDesconto() {
		
	}
	public void listarCompras() {
		
	}

	public Calcado getCalcado() {
		return calcado;
	}

	public void setCalcado(Calcado calcado) {
		this.calcado = calcado;
	}

	public int getQuantCompras() {
		return quantCompras;
	}

	public void setQuantCompras(int quantCompras) {
		this.quantCompras = quantCompras;
	}

	public GregorianCalendar getDataDaCompra() {
		return dataDaCompra;
	}

	public void setDataDaCompra(GregorianCalendar dataDaCompra) {
		this.dataDaCompra = dataDaCompra;
	}
	
}
