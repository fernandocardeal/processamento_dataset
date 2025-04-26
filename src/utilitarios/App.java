package utilitarios;

import persistencia.ManipularDataset;
import processamento.*;
import tads.VetorDeConsumidores;
import interfaces.ColecaoDeConsumidores;

public class App {
    public static void main(String[] args) {
        String arquivo = "src/dados/dadosClientes.csv";

        ColecaoDeConsumidores colecaoDeConsumidores = new VetorDeConsumidores(); // VetorDeConsumidores pode ser
                                                                                 // substituido por ListaDeConsumidores.
                                                                                 // Todas os metodos atribuidos a
                                                                                 // interface podem ser executados por
                                                                                 // ambas as classes que guardam os
                                                                                 // dados dos consumidores em tempo de
                                                                                 // execucao
        ProgramaConsumidores programaConsumidores = new ProgramaConsumidores();

        ManipularDataset.lerDataset(colecaoDeConsumidores, arquivo);
        programaConsumidores.listar(colecaoDeConsumidores);
    }
}