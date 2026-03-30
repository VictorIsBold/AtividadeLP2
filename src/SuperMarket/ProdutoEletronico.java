package SuperMarket;

public class ProdutoEletronico extends Produto {
	
	private int mesesDeGarantia;

	public ProdutoEletronico(String nome, int codBarras, double precoBase, Fornecedor fornecedor, int mesesGarantia) {
		super(nome, codBarras, precoBase, fornecedor);
		this.mesesDeGarantia = mesesGarantia;
	}

	@Override
	public double calcularPrecoFinal() {
		
		if (this.mesesDeGarantia <= 12) {
			return this.getPrecoBase() * 1.5;
			
		} else {
			return this.getPrecoBase() * 1.5 * 1.15;
		}
	}

	public int getMesesDeGarantia() {
		return mesesDeGarantia;
	}

	public void setMesesDeGarantia(int mesesDeGarantia) {
		this.mesesDeGarantia = mesesDeGarantia;
	}

}
