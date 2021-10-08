package model;
import java.util.*;
/**
 * Representa uma compra feita por um cliente armaazenando as informações necessárias
 * @author Vitor manoel
 * @version 1.0
 */
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
		return "Categoria: "+ this.calcado.getCategoria() + "| Preï¿½o: " + this.calcado.getPreco() +
				"| Data: "+ this.dataDaCompra;
	}
	
}
