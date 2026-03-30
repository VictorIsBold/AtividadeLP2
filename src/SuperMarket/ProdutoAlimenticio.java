package SuperMarket;

public class ProdutoAlimenticio extends Produto {
	
	private int diasDeValidade;

	public ProdutoAlimenticio(String nome, int codBarras, double precoBase, Fornecedor fornecedor, int validade) {
		super(nome, codBarras, precoBase, fornecedor);
		this.diasDeValidade = validade;
	}

	@Override
	public double calcularPrecoFinal() {

		if (this.diasDeValidade >= 5) {
			return this.getPrecoBase() * 1.2;
			
		} else {
			
			return this.getPrecoBase() * 0.7;
		}
	}

	public int getDiasDeValidade() {
		return diasDeValidade;
	}

	public void setDiasDeValidade(int diasDeValidade) {
		this.diasDeValidade = diasDeValidade;
	}

}
