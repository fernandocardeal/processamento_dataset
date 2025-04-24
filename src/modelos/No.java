package modelos;

public class No {
	private Consumidor consumidor;
	private No proximo;
	
	public No(Consumidor consumidor) {
		this.consumidor =  consumidor;
		this.proximo = null;
	}

	public Consumidor obterConsumidor() {
		return this.consumidor;
	}

	public void definirConsumidor(Consumidor consumidor) {
		this.consumidor = consumidor;
	}

	public No obterProximo() {
		return proximo;
	}

	public void definirProximo(No proximo) {
		this.proximo = proximo;
	}
	
}
