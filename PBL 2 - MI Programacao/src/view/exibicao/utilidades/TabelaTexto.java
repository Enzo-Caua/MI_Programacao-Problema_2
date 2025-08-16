package view.exibicao.utilidades;

import java.util.Map;

public class TabelaTexto {

    /**
     * Gera uma tabela de texto a partir de um mapa de campos e valores.
     *
     * @param dados Mapa com os rótulos e valores a serem exibidos.
     * @return String formatada como tabela.
     */
    public static String gerarTabela(Map<String, String> dados) {
        StringBuilder sb = new StringBuilder();
        String separador = "+----------------------+--------------------------------------------------+\n";
        sb.append(separador);
        for (Map.Entry<String, String> entry : dados.entrySet()) {
            String chave = entry.getKey();
            String valor = entry.getValue();
            sb.append(String.format("| %-20s | %-48s |\n", chave, valor));
        }
        sb.append(separador);
        return sb.toString();
    }
}
