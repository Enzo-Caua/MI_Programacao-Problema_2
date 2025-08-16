package view.menus;

import view.exibicao.*;
import view.exibicao.utilidades.TituloFormatado;

import java.util.Scanner;

/**
 * Classe responsável por exibirTituloMenu o menu de listagem de obras (livros, filmes e séries).
 * Permite ao usuário escolher o tipo de obra e aplicar filtros de ordenação para exibição.
 */
public class MenuListas {

    /**
     * Exibe o menu de listagens de obras, permitindo ao usuário escolher
     * entre livros, filmes ou séries, e aplicar filtros como avaliação,
     * gênero e ano de lançamento.
     *
     * @param entrada Scanner utilizado para capturar a entrada do usuário.
     */
    public static void mostrarMenu(Scanner entrada) {
        int opcao = 0;
        while (opcao != 4) {
            TituloFormatado.exibirTituloMenu("LISTAGEM", 50, "\u001B[35m");

            System.out.print("\u001B[36m");
            System.out.println("Opções de listas:");
            System.out.println("[1] - Listas de livros");
            System.out.println("[2] - Listas de filmes");
            System.out.println("[3] - Listas de séries");
            System.out.println("[4] - Voltar ao menu inicial\n");
            System.out.print("Digite o número do tipo de listas que deseja: ");
            opcao = entrada.nextInt();

            if (opcao == 1 || opcao == 2 || opcao == 3) {
                TituloFormatado.exibirTituloSecao("FILTROS", 50, "\u001B[35m");
                System.out.print("\u001B[36m");
                System.out.println("Opções de filtragem:\n");
                System.out.println("[1] - Listar por ordem crescente de avaliação");
                System.out.println("[2] - Listar por ordem decrescente de avaliação");
                System.out.println("[3] - Listar por gênero");
                System.out.println("[4] - Listar por ano de lançamento");
                System.out.println("[5] - Voltar ao menu de opções de listas");
                System.out.print("Escolha o filtro desejado: ");
                int escolha = entrada.nextInt();

                if (opcao == 1) {
                    ExibirLivro.mostrarLista(entrada, escolha);
                } else if (opcao == 2) {
                    ExibirFilme.mostrarLista(entrada, escolha);
                } else if (opcao == 3) {
                    ExibirSerie.mostrarLista(entrada, escolha);
                }
            }

            /**
            if (opcao >= 1 && opcao <= 3) {

                System.out.print("\u001B[36m");
                System.out.println("Opções de filtragem:\n");
                System.out.println("[1] - Listar por ordem de avaliação");
                System.out.println("[2] - Listar por gênero");
                System.out.println("[3] - Listar por ano de lançamento");
                System.out.println("[4] - Voltar ao menu de opções de listas");
                System.out.print("Escolha o filtro desejado: ");
                int escolha = entrada.nextInt();

                if (opcao == 1) { // Livros
                    switch (escolha) {
                        case 1 -> ExibirLivro.exibirAvaliacao(Acervo.getAcervo().getLivros());
                        case 2 -> ExibirLivro.exibirGenero(Acervo.getAcervo().getLivros());
                        case 3 -> ExibirLivro.exibirAnoLancamento(Acervo.getAcervo().getLivros());
                    }
                } else if (opcao == 2) { // Filmes
                    switch (escolha) {
                        case 1 -> ExibirFilme.exibirAvaliacao(Acervo.getAcervo().getFilmes());
                        case 2 -> ExibirFilme.exibirGenero(Acervo.getAcervo().getFilmes());
                        case 3 -> ExibirFilme.exibirAnoLancamento(Acervo.getAcervo().getFilmes());
                    }
                } else if (opcao == 3) { // Séries
                    switch (escolha) {
                        case 1 -> ExibirSerie.exibirAvaliacao(Acervo.getAcervo().getSeries());
                        case 2 -> ExibirSerie.exibirGenero(Acervo.getAcervo().getSeries());
                        case 3 -> ExibirSerie.exibirAnoLancamento(Acervo.getAcervo().getSeries());
                    }
                }
            }
             */
        }
    }
}