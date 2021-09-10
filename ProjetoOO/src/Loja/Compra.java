package Loja;
import java.util.GregorianCalendar;

public class Compra {
	private Calcado calcado;
	private GregorianCalendar dataDaCompra;
	
	public Compra(Calcado p,GregorianCalendar data){
		this.calcado = p;
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

	public GregorianCalendar getDataDaCompra() {
		return dataDaCompra;
	}

	public void setDataDaCompra(GregorianCalendar dataDaCompra) {
		this.dataDaCompra = dataDaCompra;
	}
	
}
