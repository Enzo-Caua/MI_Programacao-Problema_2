package view.exibicao.utilidades;

/**
 * Classe utilitária para exibição formatada de títulos em menus ou seções da interface de texto.
 * Permite centralizar títulos dentro de uma largura definida e aplicar bordas e cores ANSI.
 */
public class TituloFormatado {

    /**
     * Exibe um título centralizado com bordas superiores e inferiores compostas por sinais de igual (=).
     * Útil para destacar o título principal de um menu.
     *
     * @param titulo  A string que representa o título a ser exibido.
     * @param largura A largura total (em caracteres) da linha.
     * @param cor     A sequência ANSI de cor a ser aplicada antes da impressão do título.
     */
    public static void exibirTituloMenu(String titulo, int largura, String cor) {
        int espacos = (largura - titulo.length()) / 2;
        String linhaCentralizada = repetir(" ", Math.max(0, espacos)) + titulo;

        System.out.println(cor);
        System.out.println(repetir("=", largura));
        System.out.println(linhaCentralizada);
        System.out.println(repetir("=", largura));
        System.out.println("\u001B[0m"); // Reseta a cor
    }

    /**
     * Exibe um título centralizado com bordas compostas por símbolos "+" e "-".
     * Pode ser usado para delimitar seções dentro de um menu ou interface.
     *
     * @param titulo  A string que representa o título da seção.
     * @param largura A largura total (em caracteres) da linha.
     * @param cor     A sequência ANSI de cor a ser aplicada antes da impressão do título.
     */
    public static void exibirTituloSecao(String titulo, int largura, String cor) {
        int espacos = (largura - titulo.length()) / 2;
        String linhaCentralizada = repetir(" ", Math.max(0, espacos)) + titulo;

        System.out.println(cor);
        System.out.println("+" + repetir("-", largura - 2)+ "+");
        System.out.println(linhaCentralizada);
        System.out.println("+" + repetir("-", largura - 2)+ "+");
        System.out.print("\u001B[0m"); // Reseta a cor
    }

    /**
     * Retorna uma string composta pela repetição de outra string um número definido de vezes.
     *
     * @param s     A string a ser repetida.
     * @param vezes O número de vezes que a string deve ser repetida.
     * @return Uma nova string contendo {@code s} repetida {@code vezes} vezes.
     */
    private static String repetir(String s, int vezes) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < vezes; i++) {
            sb.append(s);
        }
        return sb.toString();
    }
}
