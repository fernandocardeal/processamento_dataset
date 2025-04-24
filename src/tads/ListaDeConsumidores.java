package tads;

import interfaces.ColecaoDeConsumidores;
import interfaces.Ordenador;
import modelos.Consumidor;
import modelos.No;

public class ListaDeConsumidores implements ColecaoDeConsumidores {

	No noInicial = null;
	int totalDeConsumidores = 0;

	@Override
	public void adicionarConsumidor(Consumidor consumidor) {
		No novoNo = new No(consumidor);
		No noAtual = this.noInicial;
		if (this.noInicial != null) {
			while (noAtual.obterProximo() != null) {
				noAtual = noAtual.obterProximo();
			}
			noAtual.definirProximo(novoNo);
		} else {
			this.noInicial = novoNo;
		}
		this.totalDeConsumidores++;
	}

	@Override
	public boolean excluirConsumidor(int posConsumidor) {
		No noAtual = this.noInicial;
		No noAnterior = null;
		int posicaoAtual = 0;

		if (this.noInicial != null) {
			while ((noAtual.obterProximo() != null) && (posConsumidor != posicaoAtual)) {
				noAnterior = noAtual;
				noAtual = noAtual.obterProximo();
				posicaoAtual++;
			}
			if (posConsumidor == posicaoAtual) {
				if (noAnterior == null) {
					this.noInicial = noAtual.obterProximo();
				} else {
					noAnterior.definirProximo(noAtual.obterProximo());
				}
				this.totalDeConsumidores--;
				return true;
			}
		}
		return false;
	}

	@Override
	public Consumidor obterConsumidor(int posConsumidor) {
		int posicaoAtual = 0;
		No noAtual = this.noInicial;
		while ((noAtual != null) && (posicaoAtual != posConsumidor)) {
			noAtual = noAtual.obterProximo();
			posicaoAtual++;
		}
		if (posicaoAtual == posConsumidor) {
			return noAtual.obterConsumidor();
		}
		return null;
	}

	@Override
	public int obterTotalDeConsumidores() {
		return this.totalDeConsumidores;
	}

	@Override
	public void trocarPosicaoEntreConsumidores(int posConsumidor1, int posConsumidor2) {
		No noAux1 = null;
		No noAux2 = null;
		Consumidor consumidorAux = null;

		int posicaoAtual = 0;
		No noAtual = this.noInicial;

		while (noAtual != null && (noAux1 == null || noAux2 == null)) {
			if (posicaoAtual == posConsumidor1) {
				noAux1 = noAtual;
			}
			if (posicaoAtual == posConsumidor2) {
				noAux2 = noAtual;
			}
			noAtual = noAtual.obterProximo();
			posicaoAtual++;
		}
		if (noAux1 == null || noAux2 == null) {
			System.out.println("Consumidor faltante. Troca não é possível");
		} else {
			consumidorAux = noAux1.obterConsumidor();
			noAux1.definirConsumidor(noAux2.obterConsumidor());
			noAux2.definirConsumidor(consumidorAux);
		}
	}

	@Override
	public void alterarConsumidor(int posConsumidor, Consumidor novoConsumidor) {
		int posicaoAtual = 0;
		No noAtual = this.noInicial;
		while ((noAtual != null) && (posicaoAtual != posConsumidor)) {
			noAtual = noAtual.obterProximo();
			posicaoAtual++;
		}
		if (posicaoAtual == posConsumidor) {
			noAtual.definirConsumidor(novoConsumidor);
			System.out.println("Consumidor atualizado");
		} else {
			System.out.println("Posição inválida");
		}
	}

	@Override
	public void ordenarConsumidores(Ordenador ordenador) {
		ordenador.ordenar(this);
	}
}