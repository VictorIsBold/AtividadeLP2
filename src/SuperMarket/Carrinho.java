package SuperMarket;
import java.util.ArrayList;


public class Carrinho {
	
	private ArrayList<Produto> itens;
	

	public Carrinho() {
		
		this.itens = new ArrayList<Produto>();
		
	}
	
	
	public void adicionarItem(Produto produto) {
		this.itens.add(produto);
	}
	
	public double processarCompra() {
		
		double total = 0.0;
		
		for (int i = 0; i < this.itens.size(); i++) {
			total += this.itens.get(i).calcularPrecoFinal();
		}
		
		return total;
			
	}

}
