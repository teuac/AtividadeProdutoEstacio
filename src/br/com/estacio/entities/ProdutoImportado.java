package br.com.estacio.entities;

public class ProdutoImportado extends Produto {
	private Integer tipo;

	public ProdutoImportado() {
		super();
	
	}

	public ProdutoImportado(String nome, Double preco, Integer tipo) {
		super(nome, preco);
		this.tipo = tipo;
	}

	public Integer getTipo() {
		return tipo;
	}

	public void setTipo(Integer tipo) {
		this.tipo = tipo;
	}
	
	@Override
	public Double calcularImposto() {
		Double imp = 0.0;
		if(tipo == 1) {
			imp = preco + (preco / 100) * 35;
		}
		else if( tipo == 2) {
			imp = preco + (preco / 100) * 15;
		}
		else if(tipo == 3){
			imp = preco + (preco / 100) * 20;
		}
		
		return imp;
		
	}
	@Override
	public String toString() {
		return "Produto: "+ getNome() +
		" /nPreco: " + preco +
		" /nImposto pago: " + (calcularImposto() - preco)+
		" /n Valor total: "+ calcularImposto();
		
	}
	
	

	
	
	

}
