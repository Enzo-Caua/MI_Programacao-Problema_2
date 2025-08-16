package view.menus.Busca;

import controller.busca.BuscarSerie;
import model.obras.Serie;
import view.exibicao.ExibirSerie;
import view.exibicao.utilidades.TituloFormatado;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Classe responsável por exibirTituloMenu o menu de filtros para busca de séries.
 * Permite buscar séries por diferentes critérios, como título, diretor,
 * ator, gênero e ano de lançamento.
 */
public class MenuBuscaSeries {

    /**
     * Exibe o menu de busca de séries e executa a ação correspondente à escolha do usuário.
     *
     * @param entrada Scanner utilizado para capturar a entrada do usuário.
     */
    public static void mostrarMenu(Scanner entrada) {
        int opcao = 0;

        while (opcao != 6) {
            TituloFormatado.exibirTituloMenu("BUSCAS POR SÉRIES", 50, "\u001B[35m");

            System.out.print("\u001B[36m");
            System.out.println("Filtros de busca:\n");
            System.out.println("[1] - Título da série");
            System.out.println("[2] - Diretor da série");
            System.out.println("[3] - Ator no elenco da série");
            System.out.println("[4] - Gênero da série");
            System.out.println("[5] - Ano de lançamento da série");
            System.out.println("[6] - Voltar ao menu dos tipos de obras\n");
            System.out.print("Digite o número do filtro que deseja usar: ");
            opcao = entrada.nextInt();
            entrada.nextLine(); // Limpa o buffer do scanner

            switch (opcao) {
                case 1 -> {
                    System.out.println("Digite o título da série:");
                    String titulo = entrada.nextLine();
                    System.out.println("Resultados da busca de séries pelo título " + titulo + ":");
                    ArrayList<Serie> lista = BuscarSerie.buscaTitulo(titulo);
                    ExibirSerie.exibirCompleto(lista);
                }
                case 2 -> {
                    System.out.println("Digite o nome do(a) diretor(a) da série:");
                    String diretor = entrada.nextLine();
                    System.out.println("Resultados da busca de séries pelo(a) diretor(a) " + diretor + ":");
                    ArrayList<Serie> lista = BuscarSerie.buscaDiretor(diretor);
                    ExibirSerie.exibirCompleto(lista);
                }
                case 3 -> {
                    System.out.println("Digite o nome do ator:");
                    String ator = entrada.nextLine();
                    System.out.println("Resultados da busca de séries pelo ator " + ator + ":");
                    ArrayList<Serie> lista = BuscarSerie.buscaAtor(ator);
                    ExibirSerie.exibirCompleto(lista);
                }
                case 4 -> {
                    System.out.println("Digite o gênero da série:");
                    String genero = entrada.nextLine();
                    System.out.println("Resultados da busca de séries pelo gênero " + genero + ":");
                    ArrayList<Serie> lista = BuscarSerie.buscaGenero(genero);
                    ExibirSerie.exibirCompleto(lista);
                }
                case 5 -> {
                    System.out.println("Digite o ano de lançamento da série:");
                    String anoLancamento = entrada.nextLine();
                    System.out.println("Resultados da busca de séries pelo ano " + anoLancamento + ":");
                    ArrayList<Serie> lista = BuscarSerie.buscaAnoLancamento(anoLancamento);
                    ExibirSerie.exibirCompleto(lista);
                }
            }
        }
    }
}
