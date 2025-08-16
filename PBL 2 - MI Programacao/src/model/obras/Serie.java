package model.obras;

import java.util.ArrayList;

/**
 * Classe que representa uma série, estendendo a classe Midia.
 */
public class Serie extends Midia {

    /**
     * Ano de término da série ou indicação de que ainda está em exibição.
     */
    private String anoTermino = "Série em Exibição";

    /**
     * Lista de diretores da série.
     */
    private final ArrayList<String> diretores;

    /**
     * Lista de roteiristas da série.
     */
    private final ArrayList<String> roteiristas;

    /**
     * Lista de atores da série.
     */
    private final ArrayList<String> atores;

    /**
     * Plataforma onde a série é exibida.
     */
    private final String plataforma;

    /**
     * Quantidade de temporadas da série.
     */
    private int qntTemporadas;

    /**
     * Lista de objetos Temporada da série.
     */
    private final ArrayList<Temporada> temporadas;

    /**
     * Soma das avaliações das temporadas, usada para cálculo da média.
     */
    private int avaliacaoTemporadas;

    /**
     * Construtor da classe Serie.
     */
    public Serie(String titulo, String tituloOriginal, String genero, String anoLancamento,
                 ArrayList<String> diretores, ArrayList<String> roteiristas,
                 ArrayList<String> atores, String plataforma) {
        super(titulo, tituloOriginal, genero, anoLancamento);
        this.diretores = diretores;
        this.roteiristas = roteiristas;
        this.atores = atores;
        this.plataforma = plataforma;
        this.qntTemporadas = 0;
        this.temporadas = new ArrayList<>();
        this.avaliacaoTemporadas = 0;
    }

    /**
     * Retorna a lista de diretores da série.
     */
    public ArrayList<String> getDiretores() {
        return diretores;
    }

    /**
     * Retorna a lista de roteiristas da série.
     */
    public ArrayList<String> getRoteiristas() {
        return roteiristas;
    }

    /**
     * Retorna a lista de atores da série.
     */
    public ArrayList<String> getAtores() {
        return atores;
    }

    /**
     * Retorna a plataforma da série.
     */
    public String getPlataforma() {
        return plataforma;
    }

    /**
     * Retorna o ano de término da série.
     */
    public String getAnoTermino() {
        return anoTermino;
    }

    /**
     * Define o ano de término da série.
     */
    public void setAnoTermino(String anoTermino) {
        this.anoTermino = anoTermino;
    }

    /**
     * Retorna a quantidade de temporadas da série.
     */
    public int getQntTemporadas() {
        return qntTemporadas;
    }

    /**
     * Adiciona uma temporada à série.
     */
    public void addTemporadas(Temporada temporada) {
        this.qntTemporadas++;
        this.temporadas.add(temporada);
    }

    /**
     * Retorna a lista de temporadas da série.
     */
    public ArrayList<Temporada> getTemporadas() {
        return temporadas;
    }

    /**
     * Soma a avaliação de uma temporada à pontuação total.
     */
    public void addAvaliacaoTemporadas(int avaliacaoTemporada) {
        this.avaliacaoTemporadas += avaliacaoTemporada;
    }

    /**
     * @return avaliação atribuída à mídia
     */
    @Override
    public int getAvaliacao() {
        if (this.qntTemporadas > 0) {
            avaliacao = (avaliacaoTemporadas / qntTemporadas);
        } else avaliacao = 0;
        return avaliacao;
    }


    /**
     * Retorna uma representação textual completa da série em formato de tabela.
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\u001B[35m+----------------------+--------------------------------------------------+\n");
        sb.append(String.format("\u001B[32m| %-20s | %-48s |\n", "Título", titulo));
        sb.append(String.format("| %-20s | %-48s |\n", "Título Original", tituloOriginal));
        sb.append(String.format("| %-20s | %-48s |\n", "Gênero", genero));
        sb.append(String.format("| %-20s | %-48s |\n", "Ano de Lançamento", anoLancamento));
        sb.append(String.format("| %-20s | %-48s |\n", "Ano de Término", anoTermino));
        sb.append(String.format("| %-20s | %-48s |\n", "Diretor(es)", diretores));
        sb.append(String.format("| %-20s | %-48s |\n", "Roteirista(s)", roteiristas));
        sb.append(String.format("| %-20s | %-48s |\n", "Ator(es)", atores));
        sb.append(String.format("| %-20s | %-48s |\n", "Plataforma", plataforma));
        sb.append(String.format("| %-20s | %-48s |\n", "Temporadas", qntTemporadas));
        sb.append(String.format("| %-20s | %-48s |\n", "Nota", getAvaliacao()));
        sb.append("\u001B[35m+----------------------+--------------------------------------------------+\u001B[m\n");
        return sb.toString();
    }
}
