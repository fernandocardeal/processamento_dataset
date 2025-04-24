package processamento;

import java.util.ArrayList;

import interfaces.ColecaoDeConsumidores;
import interfaces.Ordenador;
import modelos.Consumidor;

import java.util.List;

public class OrdenarPorEscolaridade implements Ordenador {

    @Override
    public void ordenar(ColecaoDeConsumidores colecao) {

        boolean troca;
        do {
            troca = false;
            for (int i = 0; i < colecao.obterTotalDeConsumidores() - 1; i++) {
                if (compararEscolaridade(colecao.obterConsumidor(i), colecao.obterConsumidor(i + 1)) == 1) {
                    colecao.trocarPosicaoEntreConsumidores(i, i + 1);
                    troca = true;
                }
            }
        } while (troca);
    }

    public int compararEscolaridade(Consumidor consumidor1, Consumidor consumidor2) {
        List<String> escolaridades = new ArrayList<>();
        escolaridades.add("Basic");
        escolaridades.add("Graduation");
        escolaridades.add("2n Cycle");
        escolaridades.add("Master");
        escolaridades.add("PhD");

        int escolaridade1 = escolaridades.indexOf(consumidor1.getEscolaridade());
        int escolaridade2 = escolaridades.indexOf(consumidor2.getEscolaridade());

        return escolaridade1 > escolaridade2 ? 1 : -1;

    }

}
