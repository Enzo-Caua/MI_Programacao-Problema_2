package view.menus;

import controller.atualizacao.*;
import model.obras.Acervo;
import view.exibicao.utilidades.TituloFormatado;

import java.util.Scanner;

/**
 * Classe responsável por exibirTituloMenu o menu de atualizações de dados relacionados às obras no sistema.
 * Permite atualizar status de leitura/visualização, disponibilidade e cadastrar temporadas.
 */
public class MenuAtualizacao {

    /**
     * Exibe o menu de opções de atualização e executa a ação correspondente com base na entrada do usuário.
     *
     * @param entrada Scanner utilizado para capturar entrada do usuário.
     */
    public static void mostrarMenu(Scanner entrada) {
        int opcao = 0;

        while (opcao != 7) {
            TituloFormatado.exibirTituloMenu("ATUALIZAÇÃO", 50, "\u001B[35m");

            System.out.print("\u001B[36m");
            System.out.println("Opções de atualizações: \n");
            System.out.println("[1] - Atualizar leitura de um livro");
            System.out.println("[2] - Atualizar visualização de um filme");
            System.out.println("[3] - Atualizar visualização de uma série");
            System.out.println("[4] - Atualizar disponibilidade de um livro");
            System.out.println("[5] - Atualizar temporadas de uma série");
            System.out.println("[6] - Atualizar ano de término de uma série");
            System.out.println("[7] - Voltar ao menu inicial\n");
            System.out.print("Digite o número do tipo de atualização que deseja fazer: ");
            opcao = entrada.nextInt();

            if ((opcao == 1 || opcao == 4) && !Acervo.getAcervo().getLivros().isEmpty()) {
                if (opcao == 1) {
                    AtualizarLivro.atualizarLido(entrada);
                } else {
                    AtualizarLivro.atualizarDisponibilidade(entrada);
                }
            } else if (opcao == 1 || opcao == 4) {
                System.out.println("Nenhum livro cadastrado!");
            }

            if (opcao == 2 && !Acervo.getAcervo().getFilmes().isEmpty()) {
                AtualizarFilme.atualizarVisto(entrada);
            } else if (opcao == 2) {
                System.out.println("Nenhum filme cadastrado!");
            }

            if ((opcao == 3 || opcao == 5 || opcao == 6) && !Acervo.getAcervo().getSeries().isEmpty()) {
                if (opcao == 3) {
                    AtualizarSerie.atualizarVisto(entrada);
                } else if (opcao == 5) {
                    AtualizarSerie.atualizarTemporada(entrada);
                } else {
                    AtualizarSerie.atualizarTermino(entrada);
                }
            } else if (opcao == 3 || opcao == 5 || opcao == 6) {
                System.out.println("Nenhuma série cadastrada!");
            }

        }
    }
}
