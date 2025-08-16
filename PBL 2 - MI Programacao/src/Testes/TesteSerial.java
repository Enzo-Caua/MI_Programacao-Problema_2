package Testes;

import model.obras.Filme;
import model.obras.Livro;
import model.obras.Serie;
import model.persistencia.Serializacao;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Classe de teste responsável por gerar dados fictícios de mídias (livros, filmes e séries)
 * e serializá-los nos arquivos correspondentes.
 */
public class TesteSerial {

    /**
     * Método principal que instancia listas fictícias de mídias e as salva no disco.
     *
     * @param args Argumentos de linha de comando (não utilizados).
     */
    public static void main(String[] args) {
        // Geração de dados fictícios
        ArrayList<Livro> livros = GeradorDeMidias.gerarLivros();
        ArrayList<Filme> filmes = GeradorDeMidias.gerarFilmes();
        ArrayList<Serie> series = GeradorDeMidias.gerarSeries();

        // Exibição simples
        System.out.println("Livros gerados: " + livros.size());
        System.out.println("Filmes gerados: " + filmes.size());
        System.out.println("Séries geradas: " + series.size());

        // Serialização
        Serializacao.salvarLivro(livros);
        Serializacao.salvarFilme(filmes);
        Serializacao.salvarSerie(series);

        System.out.println("Objetos salvos com sucesso nos arquivos!");
    }

    /**
     * Classe auxiliar responsável por gerar listas fictícias de livros, filmes e séries.
     */
    public static class GeradorDeMidias {

        /**
         * Método principal para testar a geração de mídias (sem salvar em disco).
         *
         * @param args Argumentos de linha de comando (não utilizados).
         */
        public static void main(String[] args) {
            ArrayList<Livro> livros = gerarLivros();
            ArrayList<Filme> filmes = gerarFilmes();
            ArrayList<Serie> series = gerarSeries();

            // Apenas exibe o tamanho das listas
            System.out.println("Livros gerados: " + livros.size());
            System.out.println("Filmes gerados: " + filmes.size());
            System.out.println("Séries geradas: " + series.size());
        }

        /**
         * Gera uma lista fictícia de livros com dados pré-definidos.
         *
         * @return Lista de objetos {@code Livro}.
         */
        public static ArrayList<Livro> gerarLivros() {
            ArrayList<Livro> livros = new ArrayList<>();
            livros.add(new Livro("Dom Quixote", "Don Quixote", "Romance", "1605", "Miguel de Cervantes", "Planeta", "123456789", true));
            livros.add(new Livro("1984", "Nineteen Eighty-Four", "Distopia", "1949", "George Orwell", "Companhia das Letras", "987654321", true));
            livros.add(new Livro("O Hobbit", "The Hobbit", "Fantasia", "1937", "J.R.R. Tolkien", "HarperCollins", "1122334455", true));
            livros.add(new Livro("A Revolução dos Bichos", "Animal Farm", "Satírico", "1945", "George Orwell", "Record", "9988776655", false));
            livros.add(new Livro("O Senhor dos Anéis", "The Lord of the Rings", "Fantasia", "1954", "J.R.R. Tolkien", "Martins Fontes", "5566778899", true));
            return livros;
        }

        /**
         * Gera uma lista fictícia de filmes com dados pré-definidos.
         *
         * @return Lista de objetos {@code Filme}.
         */
        public static ArrayList<Filme> gerarFilmes() {
            ArrayList<Filme> filmes = new ArrayList<>();
            ArrayList<String> diretores = new ArrayList<>(Arrays.asList("Diretor Exemplo"));
            ArrayList<String> roteiristas = new ArrayList<>(Arrays.asList("Roteirista Exemplo"));
            ArrayList<String> atores = new ArrayList<>(Arrays.asList("Ator 1", "Ator 2"));

            filmes.add(new Filme("Matrix", "The Matrix", "Ficção Científica", "1999", 136, diretores, roteiristas, atores, "Netflix"));
            filmes.add(new Filme("Interestelar", "Interstellar", "Ficção Científica", "2014", 169, diretores, roteiristas, atores, "Amazon Prime"));
            filmes.add(new Filme("O Poderoso Chefão", "The Godfather", "Drama", "1972", 175, diretores, roteiristas, atores, "Paramount+"));
            filmes.add(new Filme("Forrest Gump", "Forrest Gump", "Drama", "1994", 142, diretores, roteiristas, atores, "HBO Max"));
            filmes.add(new Filme("Vingadores", "The Avengers", "Ação", "2012", 143, diretores, roteiristas, atores, "Disney+"));
            return filmes;
        }

        /**
         * Gera uma lista fictícia de séries com dados pré-definidos.
         *
         * @return Lista de objetos {@code Serie}.
         */
        public static ArrayList<Serie> gerarSeries() {
            ArrayList<Serie> series = new ArrayList<>();
            ArrayList<String> diretores = new ArrayList<>(Arrays.asList("Diretor A"));
            ArrayList<String> roteiristas = new ArrayList<>(Arrays.asList("Roteirista A"));
            ArrayList<String> atores = new ArrayList<>(Arrays.asList("Ator A", "Ator B"));

            series.add(new Serie("Breaking Bad", "Breaking Bad", "Drama", "2008", diretores, roteiristas, atores, "Netflix"));
            series.add(new Serie("Stranger Things", "Stranger Things", "Fantasia", "2016", diretores, roteiristas, atores, "Netflix"));
            series.add(new Serie("Game of Thrones", "Game of Thrones", "Fantasia", "2011", diretores, roteiristas, atores, "HBO Max"));
            series.add(new Serie("The Office", "The Office", "Comédia", "2005", diretores, roteiristas, atores, "Peacock"));
            series.add(new Serie("Dark", "Dark", "Mistério", "2017", diretores, roteiristas, atores, "Netflix"));
            return series;
        }
    }
}
