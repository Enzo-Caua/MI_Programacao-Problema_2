package view.exibicao;

import controller.busca.BuscarFilme;
import model.obras.Acervo;
import model.obras.Filme;
import view.exibicao.utilidades.TituloFormatado;

import java.util.ArrayList;
import java.util.Scanner;

/** Classe responsável por exibirTituloMenu os filmes ao usuario. */
public class ExibirFilme {

    /**
     * Mostra a lista de filmes conforme a escolha do usuário.
     * @param entrada Scanner para entrada de dados.
     * @param escolha Opção de listagem selecionada.
     */
    public static void mostrarLista(Scanner entrada, int escolha){
        if (escolha == 1){
            System.out.println("Lista de filmes em ordem de crescente de avaliação:\n");
            ExibirFilme.exibirAvaliacao(Acervo.getAcervo().getFilmes());
        }
        else if (escolha == 2){
            System.out.println("Lista de filmes em ordem de decrescente de avaliação:\n");
            ExibirFilme.exibirAvaliacaoReverso(Acervo.getAcervo().getFilmes());
        }
        else if (escolha == 3){
            entrada.nextLine();
            System.out.println("Digite o gênero dos filmes que deseja listar:");
            String genero = entrada.nextLine();
            System.out.println("Lista de filmes do gênero " + genero + ":\n");
            ArrayList<Filme> lista = BuscarFilme.buscaGenero(genero);
            ExibirFilme.exibirGenero(lista);
        }
        else if (escolha == 4){
            entrada.nextLine();
            System.out.println("Digite o ano de lançamento dos filmes que deseja listar:");
            String anoLancamento = entrada.nextLine();
            System.out.println("Lista de filmes do ano " + anoLancamento + ":\n");
            ArrayList<Filme> lista = BuscarFilme.buscaAnoLancamento(anoLancamento);
            ExibirFilme.exibirAnoLancamento(lista);
        }
    }


    /**
     * Percorre a lista e exibe todas as informações dos filmes.
     * @param lista Lista de filmes a serem exibidos
     */
    public static void exibirCompleto(ArrayList<Filme> lista) {
        TituloFormatado.exibirTituloMenu("FILMES", 50, "\u001B[35m");
        for (Filme filme : lista) {
            System.out.println(filme);
        }
    }

    /**
     * Percorre a lista e exibe o titulo dos filmes.
     * @param lista Lista de filmes a serem exibidos
     */
    public static void exibirTitulo(ArrayList<Filme> lista) {
        TituloFormatado.exibirTituloMenu("FILMES POR TITULO", 50, "\u001B[35m");
        for (Filme filme : lista) {
            String titulo = filme.getTitulo() + " / " + filme.getTituloOriginal();
            System.out.println("Título: " + titulo);
        }
    }

    /**
     * Percorre a lista e exibe o genero dos filmes.
     * @param lista Lista de filmes a serem exibidos
     */
    public static void exibirGenero(ArrayList<Filme> lista) {
        for (Filme filme : lista) {
            String titulo = filme.getTitulo();
            String genero = filme.getGenero();
            System.out.println("Título: " + titulo);
            System.out.println("Genero: " + genero);
        }
    }

    /**
     * Percorre a lista e exibe o ano de lançamento dos filmes.
     * @param lista Lista de filmes a serem exibidos
     */
    public static void exibirAnoLancamento(ArrayList<Filme> lista) {
        for (Filme filme : lista) {
            String titulo = filme.getTitulo();
            String anoLancamento = filme.getAnoLancamento();
            System.out.println("Título: " + titulo);
            System.out.println("Ano: " + anoLancamento);
        }
    }

    /**
     * Percorre a lista e exibe o status dos filmes.
     * @param lista Lista de filmes a serem exibidos
     */
    public static void exibirVisto(ArrayList<Filme> lista) {
        for (Filme filme : lista) {
            String titulo = filme.getTitulo();
            String visto = filme.isVisto() ? "Sim" : "Não";
            String dataVisto = filme.getDataVisto();
            System.out.println("Titulo: " + titulo);
            System.out.println("Visto: " + visto);
            System.out.println("Visto em: " + dataVisto);
        }
    }

    /**
     * Percorre a lista e exibe a avaliação dos filmes.
     * @param lista Lista de filmes a serem exibidos
     */
    public static void exibirAvaliacao(ArrayList<Filme> lista) {
        for (Filme filme : lista) {
            String titulo = filme.getTitulo();
            int avalicao = filme.getAvaliacao();
            System.out.println("Titulo: " + titulo);
            System.out.println("Avaliação: " + avalicao);
        }
    }

    /**
     * Percorre a lista e exibe a avaliação dos filmes.
     * @param lista Lista de filmes a serem exibidos
     */
    public static void exibirAvaliacaoReverso(ArrayList<Filme> lista) {
        for (int i = lista.size() - 1; i >= 0; i--) {
            String titulo = lista.get(i).getTitulo();
            int avalicao = lista.get(i).getAvaliacao();
            System.out.println("Titulo: " + titulo);
            System.out.println("Avaliação: " + avalicao);
        }
    }

    /**
     * Percorre a lista e exibe a review dos filmes.
     * @param lista Lista de filmes a serem exibidos
     */
    public static void exibirReview(ArrayList<Filme> lista) {
        for (Filme filme : lista) {
            String titulo = filme.getTitulo();
            int avalicao = filme.getAvaliacao();
            String review = filme.getReview();
            System.out.println("Titulo: " + titulo);
            System.out.println("Avaliação: " + avalicao);
            System.out.println("Review: " + review);
        }
    }

    /**
     * Percorre a lista e exibe os diretores dos filmes.
     * @param lista Lista de filmes a serem exibidos
     */
    public static void exibirDiretores(ArrayList<Filme> lista) {
        for (Filme filme : lista) {
            String titulo = filme.getTitulo();
            ArrayList<String> diretores = filme.getDiretores();
            System.out.println("Titulo: " + titulo);
            System.out.println("Diretores: " + diretores);
        }
    }

    /**
     * Percorre a lista e exibe os roteiristas dos filmes.
     * @param lista Lista de filmes a serem exibidos
     */
    public static void exibirRoteiristas(ArrayList<Filme> lista) {
        for (Filme filme : lista) {
            String titulo = filme.getTitulo();
            ArrayList<String> roteiristas = filme.getDiretores();
            System.out.println("Titulo: " + titulo);
            System.out.println("Roteiristas: " + roteiristas);
        }
    }

    /**
     * Percorre a lista e exibe os atores dos filmes.
     * @param lista Lista de filmes a serem exibidos
     */
    public static void exibirAtores(ArrayList<Filme> lista) {
        for (Filme filme : lista) {
            String titulo = filme.getTitulo();
            ArrayList<String> atores = filme.getAtores();
            System.out.println("Titulo: " + titulo);
            System.out.println("Atores: " + atores);
        }
    }

    /**
     * Percorre a lista e exibe a duração dos filmes.
     * @param lista Lista de filmes a serem exibidos
     */
    public static void exibirDuracao(ArrayList<Filme> lista) {
        for (Filme filme : lista) {
            String titulo = filme.getTitulo();
            int duracao = filme.getDuracao();
            System.out.println("Titulo: " + titulo);
            System.out.println("Duracao: " + duracao + " minutos");
        }
    }

    /**
     * Percorre a lista e exibe a plataforma dos filmes.
     * @param lista Lista de filmes a serem exibidos
     */
    public static void exibirPlataforma(ArrayList<Filme> lista) {
        for (Filme filme : lista) {
            String titulo = filme.getTitulo();
            String plataforma = filme.getPlataforma();
            System.out.println("Titulo: " + titulo);
            System.out.println("Plataforma: " + plataforma);
        }
    }

}
