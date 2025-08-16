package model.obras;

/**
 * Classe que representa um livro, estendendo a classe Midia.
 */
public class Livro extends Midia {

    /**
     * Nome do autor do livro.
     */
    private final String autor;

    /**
     * Nome da editora do livro.
     */
    private final String editora;

    /**
     * Código ISBN do livro.
     */
    private final String isbn;

    /**
     * Indica se o livro está disponível fisicamente.
     */
    private boolean disponivel;

    /**
     * Construtor da classe Livro.
     */
    public Livro(String titulo, String tituloOriginal, String genero, String anoLancamento,
                 String autor, String editora, String isbn, boolean disponivel) {
        super(titulo, tituloOriginal, genero, anoLancamento);
        this.autor = autor;
        this.editora = editora;
        this.isbn = isbn;
        this.disponivel = disponivel;
    }

    /**
     * Retorna o nome do autor do livro.
     */
    public String getAutor() {
        return autor;
    }

    /**
     * Retorna o nome da editora do livro.
     */
    public String getEditora() {
        return editora;
    }

    /**
     * Retorna o código ISBN do livro.
     */
    public String getIsbn() {
        return isbn;
    }

    /**
     * Retorna true se o livro está disponível.
     */
    public boolean isDisponivel() {
        return disponivel;
    }

    /**
     * Alterna o estado de disponibilidade do livro.
     */
    public void alterarDisponivel() {
        this.disponivel = !this.disponivel;
    }

    /**
     * Retorna uma representação textual completa do livro em formato de tabela.
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\u001B[35m+----------------------+--------------------------------------------------+\n");
        sb.append(String.format("\u001B[32m| %-20s | %-48s |\n", "Título", titulo));
        sb.append(String.format("| %-20s | %-48s |\n", "Título Original", tituloOriginal));
        sb.append(String.format("| %-20s | %-48s |\n", "Gênero", genero));
        sb.append(String.format("| %-20s | %-48s |\n", "Ano de Lançamento", anoLancamento));
        sb.append(String.format("| %-20s | %-48s |\n", "Autor", autor));
        sb.append(String.format("| %-20s | %-48s |\n", "Editora", editora));
        sb.append(String.format("| %-20s | %-48s |\n", "ISBN", isbn));
        sb.append(String.format("| %-20s | %-48s |\n", "Possui exemplar", disponivel ? "Sim" : "Não"));
        sb.append(String.format("| %-20s | %-48s |\n", "Nota", avaliacao));
        sb.append(String.format("| %-20s | %-48s |\n", "Review", review));
        sb.append(String.format("| %-20s | %-48s |\n", "Foi lido", visto ? "Sim" : "Não"));
        if (visto) {
            sb.append(String.format("| %-20s | %-48s |\n", "Data de leitura", dataVisto));
        }
        sb.append("\u001B[35m+----------------------+--------------------------------------------------+\u001B[m\n");
        return sb.toString();
    }

}
