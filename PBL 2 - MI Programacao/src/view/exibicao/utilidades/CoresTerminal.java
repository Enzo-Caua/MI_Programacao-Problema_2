package view.exibicao.utilidades;

/**
 * Classe utilitária para aplicar cores ANSI a strings para exibição no terminal.
 * Funciona apenas em terminais que suportam ANSI escape codes.
 */
public class CoresTerminal {

    // Códigos ANSI
    private static final String RESET = "\u001B[0m";

    private static final String PRETO   = "\u001B[30m";
    private static final String VERMELHO = "\u001B[31m";
    private static final String VERDE   = "\u001B[32m";
    private static final String AMARELO = "\u001B[33m";
    private static final String AZUL    = "\u001B[34m";
    private static final String ROXO    = "\u001B[35m";
    private static final String CIANO   = "\u001B[36m";
    private static final String BRANCO  = "\u001B[37m";

    /**
     * Aplica a cor vermelha a um texto.
     */
    public static String vermelho(String texto) {
        return VERMELHO + texto + RESET;
    }

    /**
     * Aplica a cor verde a um texto.
     */
    public static String verde(String texto) {
        return VERDE + texto + RESET;
    }

    /**
     * Aplica a cor amarela a um texto.
     */
    public static String amarelo(String texto) {
        return AMARELO + texto + RESET;
    }

    /**
     * Aplica a cor azul a um texto.
     */
    public static String azul(String texto) {
        return AZUL + texto + RESET;
    }

    /**
     * Aplica a cor roxa a um texto.
     */
    public static String roxo(String texto) {
        return ROXO + texto + RESET;
    }

    /**
     * Aplica a cor ciano a um texto.
     */
    public static String ciano(String texto) {
        return CIANO + texto + RESET;
    }

    /**
     * Aplica a cor branca a um texto.
     */
    public static String branco(String texto) {
        return BRANCO + texto + RESET;
    }
}

