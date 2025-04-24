package interfaces;

import modelos.Consumidor;

public interface ColecaoDeConsumidores {

    public void adicionarConsumidor(Consumidor consumidor);

    public boolean excluirConsumidor(int posConsumidor);

    public Consumidor obterConsumidor(int posConsumidor);

    public int obterTotalDeConsumidores();

    public void trocarPosicaoEntreConsumidores(int posConsumidor1, int posConsumidor2);

    public void alterarConsumidor(int posConsumidor, Consumidor novoConsumidor);

    public void ordenarConsumidores(Ordenador ordenador);
}