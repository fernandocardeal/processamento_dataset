package persistencia;

import java.io.*;
import interfaces.ColecaoDeConsumidores;
import modelos.Consumidor;

public class ManipularDataset {

    public static void lerDataset(ColecaoDeConsumidores consumidores, String arquivo) {

        try (BufferedReader leitor = new BufferedReader(new FileReader(arquivo))) {

            String linhaLida = new String();

            linhaLida = leitor.readLine();

            while ((linhaLida = leitor.readLine()) != null) {

                try {
                    String linhaInteira = linhaLida;
                    String[] dadosConsumidor = linhaInteira.split(",");

                    int id = Integer.parseInt(dadosConsumidor[0]);
                    int anoNascimento = Integer.parseInt(dadosConsumidor[1]);
                    String escolaridade = dadosConsumidor[2];
                    String estadoCivil = dadosConsumidor[3];
                    int rendaDomiciliarAnual = Integer.parseInt(dadosConsumidor[4]);
                    int gastosVinhos = Integer.parseInt(dadosConsumidor[5]);
                    int gastosCarnes = Integer.parseInt(dadosConsumidor[6]);
                    int comprasOnline = Integer.parseInt(dadosConsumidor[7]);
                    int comprasPresenciais = Integer.parseInt(dadosConsumidor[8]);

                    Consumidor consumidor = new Consumidor(id, anoNascimento, escolaridade, estadoCivil,
                            rendaDomiciliarAnual, gastosVinhos, gastosCarnes, comprasOnline, comprasPresenciais);

                    consumidores.adicionarConsumidor(consumidor);
                } catch (NumberFormatException e) {
                    e.printStackTrace();
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void escreverDataset(String arquivoEscrita, ColecaoDeConsumidores consumidores) {

        try (BufferedWriter escritor = new BufferedWriter(new FileWriter(arquivoEscrita))) {

            escritor.write(
                    "ID,ANO_NASCIMENTO,ESCOLARIDADE,ESTADO_CIVIL,RENDA_DOMICILIAR_ANUAL,GASTOS_VINHOS,GASTOS_CARNES,COMPRAS_ONLINE,COMPRAS_PRESENCIAIS\n");

            for (int i = 0; i < consumidores.obterTotalDeConsumidores(); i++) {
                escritor.write(consumidorParaCSV(consumidores.obterConsumidor(i)) + "\n");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static String consumidorParaCSV(Consumidor consumidor) {
        String dados = consumidor.getId() + ","
                + consumidor.getAnoNascimento() + ","
                + consumidor.getEscolaridade() + ","
                + consumidor.getEstadoCivil() + ","
                + consumidor.getRendaDomiciliarAnual() + ","
                + consumidor.getGastosVinhos() + ","
                + consumidor.getGastosCarnes() + ","
                + consumidor.getComprasOnline() + ","
                + consumidor.getComprasPresenciais();
        return dados;
    }
}
