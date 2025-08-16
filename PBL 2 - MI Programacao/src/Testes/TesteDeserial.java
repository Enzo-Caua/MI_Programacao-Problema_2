package Testes;

import model.obras.Filme;
import model.obras.Livro;
import model.obras.Serie;
import model.persistencia.Desserializacao;

import java.util.ArrayList;

/**
 * Classe de teste utilizada para verificar a desserialização dos objetos Livro, Filme e Série.
 * Essa classe carrega os dados salvos em disco e exibe no console a quantidade e os títulos
 * dos itens recuperados.
 */
public class TesteDeserial {

    /**
     * Método principal que executa a desserialização dos dados salvos em disco e imprime
     * no console os títulos dos livros, filmes e séries recuperados.
     *
     * @param args Argumentos de linha de comando (não utilizados).
     */
    public static void main(String[] args) {
        // Desserializa os objetos do disco
        ArrayList<Livro> livros = Desserializacao.lerLivros();
        ArrayList<Filme> filmes = Desserializacao.lerFilmes();
        ArrayList<Serie> series = Desserializacao.lerSeries();

        // Verifica e exibe os dados carregados
        if (livros != null) {
            System.out.println("Livros desserializados: " + livros.size());
            livros.forEach(l -> System.out.println("- " + l.getTitulo()));
        }

        if (filmes != null) {
            System.out.println("\nFilmes desserializados: " + filmes.size());
            filmes.forEach(f -> System.out.println("- " + f.getTitulo()));
        }

        if (series != null) {
            System.out.println("\nSéries desserializadas: " + series.size());
            series.forEach(s -> System.out.println("- " + s.getTitulo()));
        }
    }
}
