package view.exibicao;

import controller.busca.BuscarSerie;
import model.obras.Acervo;
import model.obras.Filme;
import model.obras.Serie;

import java.util.ArrayList;
import java.util.Scanner;

/** Classe responsável por exibirTituloMenu as séries ao usuario. */
public class ExibirSerie {

    /**
     * Mostra a lista de séries conforme a escolha do usuário.
     * @param entrada Scanner para entrada de dados.
     * @param escolha Opção de listagem selecionada.
     */
    public static void mostrarLista(Scanner entrada, int escolha){
        if (escolha == 1){
            System.out.println("Lista de séries em ordem de crescente de avaliação:\n");
            ExibirSerie.exibirAvaliacao(Acervo.getAcervo().getSeries());

        } else if (escolha == 2){
            System.out.println("Lista de séries em ordem de decrescente de avaliação:\n");
            ExibirSerie.exibirAvaliacaoReverso(Acervo.getAcervo().getSeries());

        } else if (escolha == 3){
            entrada.nextLine();
            System.out.println("Digite o gênero das séries que deseja listar:");
            String genero = entrada.nextLine();
            System.out.println("Lista de séries do gênero " + genero + ":\n");
            ArrayList<Serie> lista = BuscarSerie.buscaGenero(genero);
            ExibirSerie.exibirGenero(lista);

        } else if (escolha == 4){
            entrada.nextLine();
            System.out.println("Digite o ano de lançamento das séries que deseja listar:");
            String anoLancamento = entrada.nextLine();
            System.out.println("Lista de séries do ano " + anoLancamento + ":\n");
            ArrayList<Serie> lista = BuscarSerie.buscaAnoLancamento(anoLancamento);
            ExibirSerie.exibirAnoLancamento(lista);
        }
    }

    /**
     * Percorre a lista e exibe todas as informações das séries.
     *
     * @param lista Lista de séries a serem exibidos
     */
    public static void exibirCompleto(ArrayList<Serie> lista) {
        for (Serie serie : lista) {
            System.out.println(serie);
        }
    }

    /**
     * Percorre a lista e exibe o titulo das séries.
     *
     * @param lista Lista de séries a serem exibidos
     */
    public static void exibirTitulo(ArrayList<Serie> lista) {
        for (Serie serie : lista) {
            String titulo = serie.getTitulo() + " / " + serie.getTituloOriginal();
            System.out.println("Título: " + titulo);
        }
    }

    /**
     * Percorre a lista e exibe o genero das séries.
     *
     * @param lista Lista de séries a serem exibidos
     */
    public static void exibirGenero(ArrayList<Serie> lista) {
        for (Serie serie : lista) {
            String titulo = serie.getTitulo();
            String genero = serie.getGenero();
            System.out.println("Título: " + titulo);
            System.out.println("Genero: " + genero);
        }
    }

    /**
     * Percorre a lista e exibe o ano de lançamento das séries.
     *
     * @param lista Lista de séries a serem exibidos
     */
    public static void exibirAnoLancamento(ArrayList<Serie> lista) {
        for (Serie serie : lista) {
            String titulo = serie.getTitulo();
            String anoLancamento = serie.getAnoLancamento();
            System.out.println("Título: " + titulo);
            System.out.println("Ano: " + anoLancamento);
        }
    }

    /**
     * Percorre a lista e exibe o status das séries.
     *
     * @param lista Lista de séries a serem exibidos
     */
    public static void exibirVisto(ArrayList<Serie> lista) {
        for (Serie serie : lista) {
            String titulo = serie.getTitulo();
            String visto = serie.isVisto() ? "Sim" : "Não";
            String dataVisto = serie.getDataVisto();
            System.out.println("Titulo: " + titulo);
            System.out.println("Visto: " + visto);
            System.out.println("Visto em: " + dataVisto);
        }
    }

    /**
     * Percorre a lista e exibe a avaliação das séries.
     *
     * @param lista Lista de séries a serem exibidos
     */
    public static void exibirAvaliacao(ArrayList<Serie> lista) {
        for (Serie serie : lista) {
            String titulo = serie.getTitulo();
            int avalicao = serie.getAvaliacao();
            System.out.println("Titulo: " + titulo);
            System.out.println("Avaliação: " + avalicao);
        }
    }

    /**
     * Percorre a lista e exibe a avaliação das séries.
     * @param lista Lista de series a serem exibidos
     */
    public static void exibirAvaliacaoReverso(ArrayList<Serie> lista) {
        for (int i = lista.size() - 1; i >= 0; i--) {
            String titulo = lista.get(i).getTitulo();
            int avalicao = lista.get(i).getAvaliacao();
            System.out.println("Titulo: " + titulo);
            System.out.println("Avaliação: " + avalicao);
        }
    }

    /**
     * Percorre a lista e exibe a review das séries.
     *
     * @param lista Lista de séries a serem exibidos
     */
    public static void exibirReview(ArrayList<Serie> lista) {
        for (Serie serie : lista) {
            String titulo = serie.getTitulo();
            int avalicao = serie.getAvaliacao();
            String review = serie.getReview();
            System.out.println("Titulo: " + titulo);
            System.out.println("Avaliação: " + avalicao);
            System.out.println("Review: " + review);
        }
    }

    /**
     * Percorre a lista e exibe os diretores das séries.
     *
     * @param lista Lista de séries a serem exibidos
     */
    public static void exibirDiretores(ArrayList<Serie> lista) {
        for (Serie serie : lista) {
            String titulo = serie.getTitulo();
            ArrayList<String> diretores = serie.getDiretores();
            System.out.println("Titulo: " + titulo);
            System.out.println("Diretores: " + diretores);
        }
    }

    /**
     * Percorre a lista e exibe os roteiristas das séries.
     *
     * @param lista Lista de séries a serem exibidos
     */
    public static void exibirRoteiristas(ArrayList<Serie> lista) {
        for (Serie serie : lista) {
            String titulo = serie.getTitulo();
            ArrayList<String> roteiristas = serie.getDiretores();
            System.out.println("Titulo: " + titulo);
            System.out.println("Roteiristas: " + roteiristas);
        }
    }

    /**
     * Percorre a lista e exibe os atores das séries.
     *
     * @param lista Lista de séries a serem exibidos
     */
    public static void exibirAtores(ArrayList<Serie> lista) {
        for (Serie serie : lista) {
            String titulo = serie.getTitulo();
            ArrayList<String> atores = serie.getDiretores();
            System.out.println("Titulo: " + titulo);
            System.out.println("Atores: " + atores);
        }
    }

    /**
     * Percorre a lista e exibe a plataforma das séries.
     *
     * @param lista Lista de séries a serem exibidos
     */
    public static void exibirPlataforma(ArrayList<Serie> lista) {
        for (Serie serie : lista) {
            String titulo = serie.getTitulo();
            String plataforma = serie.getPlataforma();
            System.out.println("Titulo: " + titulo);
            System.out.println("Plataforma: " + plataforma);
        }
    }

    /**
     * Percorre a lista e exibe o ano de termino das séries.
     *
     * @param lista Lista de séries a serem exibidos
     */
    public static void exibirAnoTermino(ArrayList<Serie> lista) {
        for (Serie serie : lista) {
            String titulo = serie.getTitulo();
            String anoTermino = serie.getAnoTermino();
            System.out.println("Titulo: " + titulo);
            System.out.println("Ano de Termino: " + anoTermino);
        }
    }

    /**
     * Percorre a lista e exibe a quantidade de temporada das séries.
     *
     * @param lista Lista de séries a serem exibidos
     */
    public static void exibirQntTemporadas(ArrayList<Serie> lista) {
        for (Serie serie : lista) {
            String titulo = serie.getTitulo();
            int qntTemporadas = serie.getQntTemporadas();
            System.out.println("Titulo: " + titulo);
            System.out.println("Nº de Temporadas: " + qntTemporadas);
        }
    }


}