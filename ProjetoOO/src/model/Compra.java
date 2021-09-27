package model;
import java.util.*;

public class Compra {
	private Calcado calcado;
	private Date dataDaCompra;
	
	public Compra(Calcado p,Date data){
		this.calcado = p;
		this.dataDaCompra = data;
	}

	public Calcado getCalcado() {
		return calcado;
	}

	public void setCalcado(Calcado calcado) {
		this.calcado = calcado;
	}

	public Date getDataDaCompra() {
		return dataDaCompra;
	}

	public void setDataDaCompra(Date dataDaCompra) {
		this.dataDaCompra = dataDaCompra;
	}
	
	@Override
	public String toString() {
		return "Categoria: "+ this.calcado.getCategoria() + "| Pre�o: " + this.calcado.getPreco() +
				"| Data: "+ this.dataDaCompra;
	}
	
}
