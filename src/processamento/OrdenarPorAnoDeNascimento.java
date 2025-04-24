package processamento;

import interfaces.ColecaoDeConsumidores;
import interfaces.Ordenador;

public class OrdenarPorAnoDeNascimento implements Ordenador {

    public void ordenar(ColecaoDeConsumidores consumidores) {
        ordenacaoRapidaDeConsumidores(consumidores, 0, consumidores.obterTotalDeConsumidores());
    }

    public void ordenacaoRapidaDeConsumidores(ColecaoDeConsumidores consumidores, int inicio, int fim) {
        if (inicio < fim) {
            int pivo = particionar(consumidores, inicio, fim);
            ordenacaoRapidaDeConsumidores(consumidores, inicio, pivo);
            ordenacaoRapidaDeConsumidores(consumidores, pivo + 1, fim);
        }
    }

    public int particionar(ColecaoDeConsumidores consumidores, int inicio, int fim) {
        int pivo = consumidores.obterConsumidor(inicio).getAnoNascimento();
        int i = inicio + 1;
        for (int j = inicio + 1; j < fim; j++) {
            if (consumidores.obterConsumidor(j).getAnoNascimento() < pivo) {
                consumidores.trocarPosicaoEntreConsumidores(i, j);
                i++;
            }
        }
        consumidores.trocarPosicaoEntreConsumidores(inicio, i - 1);
        return i - 1;
    }

}
