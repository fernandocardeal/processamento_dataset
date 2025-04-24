package utilitarios;

import modelos.Consumidor;
import persistencia.ManipularDataset;
import processamento.*;
import tads.ListaDeConsumidores;
import interfaces.ColecaoDeConsumidores;
import java.util.List;

public class TesteLista {
    public static void main(String[] args) {
        String arquivo = "src/dados/dadosClientesReduzidos.csv";

        List<Consumidor> consumidores = ManipularDataset.lerDataset(arquivo);

        ColecaoDeConsumidores colecaoDeConsumidores = new ListaDeConsumidores();

        for (Consumidor consumidor : consumidores) {
            colecaoDeConsumidores.adicionarConsumidor(consumidor);
        }

        ProgramaConsumidores programaConsumidores = new ProgramaConsumidores();
        programaConsumidores.listar(colecaoDeConsumidores);

        System.out.println("\n");

        System.out.println(colecaoDeConsumidores.obterConsumidor(2));
        System.out.println(colecaoDeConsumidores.obterConsumidor(5));

        colecaoDeConsumidores.trocarPosicaoEntreConsumidores(5, 2);

        System.out.println("Troca Realizada");
        System.out.println(colecaoDeConsumidores.obterConsumidor(2));
        System.out.println(colecaoDeConsumidores.obterConsumidor(5));

        System.out.println("\nTotal de Consumidores: " + colecaoDeConsumidores.obterTotalDeConsumidores());

        System.out.println("\n\n\n");
        colecaoDeConsumidores.ordenarConsumidores(new OrdenarPorEscolaridade());
        programaConsumidores.listar(colecaoDeConsumidores);

        ManipularDataset.escreverDataset(arquivo, colecaoDeConsumidores);
    }
}