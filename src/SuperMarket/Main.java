package SuperMarket;

public class Main {

	public static void main(String[] args) {
				
		Carrinho cart = new Carrinho();
		
		Fornecedor fazenda = new Fornecedor("Fazenda Local", "1234", "Brasil");
		Fornecedor tech = new Fornecedor("TechGlobal", "4321", "China");
		
		ProdutoEletronico eletronico = new ProdutoEletronico("Celular", 81792371, 2000.0, tech, 24);
		ProdutoAlimenticio alimento = new ProdutoAlimenticio("Arroz", 91282612, 8.0, fazenda, 8);
				
		cart.adicionarItem(alimento);
		cart.adicionarItem(eletronico);
		
				
		double valor = cart.processarCompra();
		
		System.out.println("O valor total da compra é de: " + valor + " reais");
		
	}

}
