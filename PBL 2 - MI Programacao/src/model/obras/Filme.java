package model.obras;

import java.util.ArrayList;

/**
 * Classe que representa um filme, estendendo a classe Midia.
 */
public class Filme extends Midia {

    /**
     * Duração do filme em minutos.
     */
    private final int duracao;

    /**
     * Lista de diretores do filme.
     */
    private final ArrayList<String> diretores;

    /**
     * Lista de roteiristas do filme.
     */
    private final ArrayList<String> roteiristas;

    /**
     * Lista de atores do filme.
     */
    private final ArrayList<String> atores;

    /**
     * Plataforma de exibição do filme (ex: Netflix, cinema).
     */
    private final String plataforma;

    /**
     * Construtor da classe Filme.
     */
    public Filme(String titulo, String tituloOriginal, String genero, String anoLancamento,
                 int duracao, ArrayList<String> diretores, ArrayList<String> roteiristas,
                 ArrayList<String> atores, String plataforma) {
        super(titulo, tituloOriginal, genero, anoLancamento);
        this.diretores = diretores;
        this.roteiristas = roteiristas;
        this.atores = atores;
        this.duracao = duracao;
        this.plataforma = plataforma;
    }

    /**
     * Retorna a duração do filme.
     */
    public int getDuracao() {
        return duracao;
    }

    /**
     * Retorna a lista de diretores do filme.
     */
    public ArrayList<String> getDiretores() {
        return diretores;
    }

    /**
     * Retorna a lista de roteiristas do filme.
     */
    public ArrayList<String> getRoteiristas() {
        return roteiristas;
    }

    /**
     * Retorna a lista de atores do filme.
     */
    public ArrayList<String> getAtores() {
        return atores;
    }

    /**
     * Retorna a plataforma onde o filme foi exibido.
     */
    public String getPlataforma() {
        return plataforma;
    }

    /**
     * Retorna uma representação textual completa do filme em formato de tabela.
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\u001B[35m+----------------------+--------------------------------------------------+\n");
        sb.append(String.format("\u001B[32m| %-20s | %-48s |\n", "Título", titulo));
        sb.append(String.format("| %-20s | %-48s |\n", "Título Original", tituloOriginal));
        sb.append(String.format("| %-20s | %-48s |\n", "Gênero", genero));
        sb.append(String.format("| %-20s | %-48s |\n", "Ano de Lançamento", anoLancamento));
        sb.append(String.format("| %-20s | %-48s |\n", "Duração", duracao));
        sb.append(String.format("| %-20s | %-48s |\n", "Diretor(es)", diretores));
        sb.append(String.format("| %-20s | %-48s |\n", "Roteirista(s)", roteiristas));
        sb.append(String.format("| %-20s | %-48s |\n", "Ator(es)", atores));
        sb.append(String.format("| %-20s | %-48s |\n", "Plataforma", plataforma));
        sb.append(String.format("| %-20s | %-48s |\n", "Nota", avaliacao));
        sb.append(String.format("| %-20s | %-48s |\n", "Review", review));
        sb.append(String.format("| %-20s | %-48s |\n", "Foi visto", visto ? "Sim" : "Não"));
        if (visto) {
            sb.append(String.format("| %-20s | %-48s |\n", "Data de visualização", dataVisto));
        }
        sb.append("\u001B[35m+----------------------+--------------------------------------------------+\u001B[0m\n");
        return sb.toString();
    }

}
