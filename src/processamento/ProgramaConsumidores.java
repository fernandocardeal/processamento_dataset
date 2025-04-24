package processamento;

import interfaces.ColecaoDeConsumidores;
import modelos.Consumidor;

public class ProgramaConsumidores {
    public void listar(ColecaoDeConsumidores consumidores) {
        for (int i = 0; i < consumidores.obterTotalDeConsumidores(); i++) {
            Consumidor consumidor = consumidores.obterConsumidor(i);
            System.out.println(i + ": " + consumidor.toString());
        }
    }
}
