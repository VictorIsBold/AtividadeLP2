package SuperMarket;

public abstract class Produto {
	
	private String nome;
	private int codBarras;
	private double precoBase;
	private Fornecedor fornecedor;
	
	
	public Produto(String nome, int codBarras, double precoBase, Fornecedor fornecedor) {
		super();
		this.nome = nome;
		this.codBarras = codBarras;
		this.setPrecoBase(precoBase);
		this.setFornecedor(fornecedor);
	}
	
	
	public abstract double calcularPrecoFinal();
	
	public void exibirResumo() {
		System.out.println("Produto: " + this.nome);
		System.out.println("Preço: " + this.precoBase);
		System.out.println("Fornecedor: " + this.fornecedor);
		System.out.println("Código de Barras: " + this.codBarras);		
	}


	public double getPrecoBase() {
		return precoBase;
	}


	public void setPrecoBase(double precoBase) {
		this.precoBase = precoBase;
	}


	public Fornecedor getFornecedor() {
		return fornecedor;
	}


	public void setFornecedor(Fornecedor fornecedor) {
		this.fornecedor = fornecedor;
	}
	
	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public int getCodBarras() {
		return codBarras;
	}


	public void setCodBarras(int codBarras) {
		this.codBarras = codBarras;
	}

	
}
