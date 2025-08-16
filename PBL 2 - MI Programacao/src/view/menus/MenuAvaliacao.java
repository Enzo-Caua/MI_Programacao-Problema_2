package view.menus;

import controller.avaliacao.*;
import model.obras.Acervo;
import view.exibicao.utilidades.TituloFormatado;

import java.util.Scanner;

/**
 * Classe responsável por exibirTituloMenu o menu de avaliação de obras no sistema.
 * Permite que o usuário atribua notas e escreva reviews para livros, filmes e temporadas de séries.
 */
public class MenuAvaliacao {

    /**
     * Exibe o menu de avaliações e executa a ação correspondente com base na escolha do usuário.
     *
     * @param entrada Scanner utilizado para capturar entrada do usuário.
     */
    public static void mostrarMenu(Scanner entrada) {
        int opcao = 0;

        while (opcao != 7) {
            TituloFormatado.exibirTituloMenu("AVALIAÇÃO", 50, "\u001B[35m");

            System.out.print("\u001B[36m");
            System.out.println("Opções de avaliação:\n");
            System.out.println("[1] - Atribuir nota a um livro");
            System.out.println("[2] - Escrever review de um livro");
            System.out.println("[3] - Atribuir nota a um filme");
            System.out.println("[4] - Escrever review de um filme");
            System.out.println("[5] - Atribuir nota a uma temporada de uma série");
            System.out.println("[6] - Escrever review de uma temporada de uma série");
            System.out.println("[7] - Voltar ao menu inicial\n");
            System.out.print("Digite o número do tipo de avaliação que deseja realizar: ");

            opcao = entrada.nextInt();

            if ((opcao == 1 || opcao == 2) && !Acervo.getAcervo().getLivros().isEmpty()) {
                if (opcao == 1) {
                    AvaliarLivro.pontuarLivro(entrada);
                } else {
                    AvaliarLivro.reviewLivro(entrada);
                }
            } else if (opcao == 1 || opcao == 2) {
                System.out.println("Nenhum livro cadastrado!");
            }

            if ((opcao == 3 || opcao == 4) && !Acervo.getAcervo().getFilmes().isEmpty()) {
                if (opcao == 3) {
                    AvaliarFilme.pontuarFilme(entrada);
                } else {
                    AvaliarFilme.reviewFilme(entrada);
                }
            } else if (opcao == 3 || opcao == 4) {
                System.out.println("Nenhum filme cadastrado!");
            }

            if ((opcao == 5 || opcao == 6) && !Acervo.getAcervo().getSeries().isEmpty()) {
                if (opcao == 5) {
                    AvaliarTemporada.pontuarTemporada(entrada);
                } else {
                    AvaliarTemporada.reviewTemporada(entrada);
                }
            } else if (opcao == 5 || opcao == 6) {
                System.out.println("Nenhuma série cadastrada!");
            }

        }
    }
}
