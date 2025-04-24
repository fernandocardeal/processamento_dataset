package tads;

import java.util.ArrayList;
import java.util.List;

import interfaces.ColecaoDeConsumidores;
import interfaces.Ordenador;
import modelos.Consumidor;

public class VetorDeConsumidores implements ColecaoDeConsumidores {

    private List<Consumidor> consumidores = new ArrayList<>();

    @Override
    public void adicionarConsumidor(Consumidor consumidor) {
        this.consumidores.add(consumidor);
    }

    @Override
    public boolean excluirConsumidor(int posConsumidor) {
        try {
            this.consumidores.remove(posConsumidor);
            return true;
        } catch (Exception e) {
            System.out.println("Impossível excluir elemento");
        }
        return false;
    }

    @Override
    public Consumidor obterConsumidor(int posConsumidor) {
        try {
            return this.consumidores.get(posConsumidor);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public int obterTotalDeConsumidores() {
        return this.consumidores.size();
    }

    @Override
    public void trocarPosicaoEntreConsumidores(int posConsumidor1, int posConsumidor2) {
        try {
            Consumidor consumidorAux = this.consumidores.get(posConsumidor2);
            this.consumidores.set(posConsumidor2, this.consumidores.get(posConsumidor1));
            this.consumidores.set(posConsumidor1, consumidorAux);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void alterarConsumidor(int posConsumidor, Consumidor novoConsumidor) {
        try {
            this.consumidores.set(posConsumidor, novoConsumidor);
        } catch (IllegalArgumentException e) {
            System.out.println("Posição inválida");
        }
    }

    @Override
    public void ordenarConsumidores(Ordenador ordenador) {
        ordenador.ordenar(this);
    }
}