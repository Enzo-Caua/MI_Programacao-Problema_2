package view.menus;

import controller.cadastro.*;
import view.exibicao.utilidades.TituloFormatado;

import java.util.Scanner;

/**
 * Classe responsável por exibirTituloMenu o menu de cadastro de obras.
 * Permite cadastrar livros, filmes e séries.
 */
public class MenuCadastro {

    /**
     * Exibe o menu de cadastro e realiza a ação correspondente de acordo com a escolha do usuário.
     *
     * @param entrada Scanner utilizado para capturar a entrada do usuário.
     */
    public static void mostrarMenu(Scanner entrada) {
        int opcao = 0;

        while (opcao != 4) {
            TituloFormatado.exibirTituloMenu("CADASTRO", 50, "\u001B[35m");
            System.out.print("\u001B[36m");
            System.out.println("Tipos de obras disponíveis para cadastro:\n");
            System.out.println("[1] - Livro");
            System.out.println("[2] - Filme");
            System.out.println("[3] - Série");
            System.out.println("[4] - Voltar ao menu inicial\n");
            System.out.print("Digite o número do tipo de obra que deseja cadastrar: ");
            opcao = entrada.nextInt();

            switch (opcao) {
                case 1 -> CadastrarLivro.dadosLivro(entrada);
                case 2 -> CadastrarFilme.dadosFilme(entrada);
                case 3 -> CadastrarSerie.dadosSerie(entrada);
                // opção 4 volta ao menu inicial e encerra o laço
            }
        }
    }
}
