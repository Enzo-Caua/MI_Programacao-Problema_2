package view.exibicao.utilidades;

import java.util.List;

public class TabelaDinamica {

    /**
     * Gera uma tabela de texto com cabeçalho e linhas de dados.
     *
     * @param linhas Lista de linhas, onde a primeira é o cabeçalho.
     * @return Representação da tabela como String.
     */
    public static String gerarTabela(List<List<String>> linhas) {
        if (linhas == null || linhas.isEmpty()) return "";

        int colunas = linhas.get(0).size();
        int[] larguras = new int[colunas];

        // Descobrir a largura máxima de cada coluna
        for (List<String> linha : linhas) {
            for (int i = 0; i < colunas; i++) {
                String valor = linha.get(i) != null ? linha.get(i) : "";
                larguras[i] = Math.max(larguras[i], valor.length());
            }
        }

        StringBuilder sb = new StringBuilder();

        // Construir as linhas da tabela
        for (int l = 0; l < linhas.size(); l++) {
            List<String> linha = linhas.get(l);
            for (int i = 0; i < colunas; i++) {
                String valor = linha.get(i) != null ? linha.get(i) : "";
                sb.append(String.format("| %-"+larguras[i]+"s ", valor));
            }
            sb.append("|\n");

            // Linha separadora após o cabeçalho
            if (l == 0) {
                for (int i = 0; i < colunas; i++) {
                    sb.append("|");
                    sb.append("-".repeat(larguras[i] + 2));
                }
                sb.append("|\n");
            }
        }

        return sb.toString();
    }
}
