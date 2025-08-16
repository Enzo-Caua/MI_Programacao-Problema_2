package view.exibicao;

import controller.busca.BuscarLivro;
import model.obras.Acervo;
import model.obras.Filme;
import model.obras.Livro;

import java.util.ArrayList;
import java.util.Scanner;

/** Classe responsável por exibirTituloMenu os livros ao usuario. */
public class ExibirLivro {

    /**
     * Mostra a lista de livros conforme a escolha do usuário.
     * @param entrada Scanner para entrada de dados.
     * @param escolha Opção de listagem selecionada.
     */
    public static void mostrarLista(Scanner entrada, int escolha) {
        if (escolha == 1) {
            System.out.println("Lista de livros em ordem de crescente de avaliação:\n");
            ExibirLivro.exibirAvaliacao(Acervo.getAcervo().getLivros());
        } else if (escolha == 2) {
            System.out.println("Lista de livros em ordem de decrescente de avaliação:\n");
            ExibirLivro.exibirAvaliacaoReverso(Acervo.getAcervo().getLivros());
        } else if (escolha == 3) {
            entrada.nextLine();
            System.out.println("Digite o gênero dos livros que deseja listar:");
            String genero = entrada.nextLine();
            System.out.println("Lista de livros do gênero " + genero + ":\n");
            ArrayList<Livro> lista = BuscarLivro.buscaGenero(genero);
            ExibirLivro.exibirGenero(lista);
        } else if (escolha == 4) {
            entrada.nextLine();
            System.out.println("Digite o ano de lançamento dos livros que deseja listar:");
            String anoLancamento = entrada.nextLine();
            System.out.println("Lista de livros do ano " + anoLancamento + ":\n");
            ArrayList<Livro> lista = BuscarLivro.buscaAnoLancamento(anoLancamento);
            ExibirLivro.exibirAnoLancamento(lista);
        }
    }

    /**
     * Percorre a lista e exibe todas as informações dos livros.
     * @param lista Lista de livros a serem exibidos
     */
    public static void exibirCompleto(ArrayList<Livro> lista) {
        for (Livro livro : lista) {
            System.out.println(livro);
        }
    }

    /**
     * Percorre a lista e exibe o titulo dos livros.
     * @param lista Lista de livros a serem exibidos
     */
    public static void exibirTitulo(ArrayList<Livro> lista) {
        for (Livro livro : lista) {
            String titulo = livro.getTitulo() + " / " + livro.getTituloOriginal();
            System.out.println("Título: " + titulo);
        }
    }

    /**
     * Percorre a lista e exibe o genero dos livros.
     * @param lista Lista de livros a serem exibidos
     */
    public static void exibirGenero(ArrayList<Livro> lista) {
        for (Livro livro : lista) {
            String titulo = livro.getTitulo();
            String genero = livro.getGenero();
            System.out.println("Título: " + titulo);
            System.out.println("Genero: " + genero);
        }
    }

    /**
     * Percorre a lista e exibe o ano de lançamento dos livros.
     * @param lista Lista de livros a serem exibidos
     */
    public static void exibirAnoLancamento(ArrayList<Livro> lista) {
        for (Livro livro : lista) {
            String titulo = livro.getTitulo();
            String anoLancamento = livro.getAnoLancamento();
            System.out.println("Título: " + titulo);
            System.out.println("Ano: " + anoLancamento);
        }
    }

    /**
     * Percorre a lista e exibe o status dos livros.
     * @param lista Lista de livros a serem exibidos
     */
    public static void exibirVisto(ArrayList<Livro> lista) {
        for (Livro livro : lista) {
            String titulo = livro.getTitulo();
            String visto = livro.isVisto() ? "Sim" : "Não";
            String dataVisto = livro.getDataVisto();
            System.out.println("Titulo: " + titulo);
            System.out.println("Visto: " + visto);
            System.out.println("Visto em: " + dataVisto);
        }
    }

    /**
     * Percorre a lista e exibe a avaliação dos livros.
     * @param lista Lista de livros a serem exibidos
     */
    public static void exibirAvaliacao(ArrayList<Livro> lista) {
        for (Livro livro : lista) {
            String titulo = livro.getTitulo();
            int avalicao = livro.getAvaliacao();
            System.out.println("Titulo: " + titulo);
            System.out.println("Avaliação: " + avalicao);
        }
    }

    /**
     * Percorre a lista e exibe a avaliação dos livros.
     * @param lista Lista de livros a serem exibidos
     */
    public static void exibirAvaliacaoReverso(ArrayList<Livro> lista) {
        for (int i = lista.size() - 1; i >= 0; i--) {
            String titulo = lista.get(i).getTitulo();
            int avalicao = lista.get(i).getAvaliacao();
            System.out.println("Titulo: " + titulo);
            System.out.println("Avaliação: " + avalicao);
        }
    }

    /**
     * Percorre a lista e exibe a review dos livros.
     * @param lista Lista de livros a serem exibidos
     */
    public static void exibirReview(ArrayList<Livro> lista) {
        for (Livro livro : lista) {
            String titulo = livro.getTitulo();
            int avalicao = livro.getAvaliacao();
            String review = livro.getReview();
            System.out.println("Titulo: " + titulo);
            System.out.println("Avaliação: " + avalicao);
            System.out.println("Review: " + review);
        }
    }

    /**
     * Percorre a lista e exibe o autor dos livros.
     * @param lista Lista de livros a serem exibidos
     */
    public static void exibirAutor(ArrayList<Livro> lista) {
        for (Livro livro : lista) {
            String titulo = livro.getTitulo();
            String autor = livro.getAutor();
            System.out.println("Título: " + titulo);
            System.out.println("Autor: " + autor);
        }
    }

    /**
     * Percorre a lista e exibe a editora dos livros.
     * @param lista Lista de livros a serem exibidos
     */
    public static void exibirEditora(ArrayList<Livro> lista) {
        for (Livro livro : lista) {
            String titulo = livro.getTitulo();
            String editora = livro.getEditora();
            System.out.println("Titulo: " + titulo);
            System.out.println("Editora: " + editora);

        }
    }

}
