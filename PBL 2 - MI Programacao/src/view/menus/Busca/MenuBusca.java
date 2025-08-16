package view.menus.Busca;

import model.obras.Acervo;
import view.exibicao.utilidades.TituloFormatado;
import java.util.Scanner;

/**
 * Classe responsável por exibirTituloMenu o menu de busca de obras no sistema.
 * Permite ao usuário escolher o tipo de obra (livros, filmes ou séries) a ser buscada.
 */
public class MenuBusca {

    /**
     * Exibe o menu de busca de obras e redireciona para o submenu específico
     * de acordo com a escolha do usuário.
     *
     * @param entrada Scanner utilizado para capturar entrada do usuário.
     */
    public static void mostrarMenu(Scanner entrada) {
        int opcao = 0;

        while (opcao != 4) {
            TituloFormatado.exibirTituloMenu("BUSCAS", 50, "\u001B[35m");

            System.out.print("\u001B[36m");
            System.out.println("Opções de tipos de obras para buscar:");
            System.out.println("[1] - Livros");
            System.out.println("[2] - Filmes");
            System.out.println("[3] - Séries");
            System.out.println("[4] - Voltar ao menu inicial\n");
            System.out.print("Digite o número do tipo de obra que deseja buscar: ");
            opcao = entrada.nextInt();

            switch (opcao) {
                case 1 -> {
                    if (Acervo.getAcervo().getLivros().isEmpty()) {
                        System.out.println("Nenhum livro cadastrado!");
                    } else {
                        MenuBuscaLivros.mostrarMenu(entrada);
                    }
                }
                case 2 -> {
                    if (Acervo.getAcervo().getFilmes().isEmpty()) {
                        System.out.println("Nenhum filme cadastrado!");
                    } else {
                        MenuBuscaFilmes.mostrarMenu(entrada);
                    }
                }
                case 3 -> {
                    if (Acervo.getAcervo().getSeries().isEmpty()) {
                        System.out.println("Nenhuma série cadastrada!");
                    } else {
                        MenuBuscaSeries.mostrarMenu(entrada);
                    }
                }
            }
        }
    }
}
