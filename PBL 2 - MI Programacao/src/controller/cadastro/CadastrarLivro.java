package controller.cadastro;


import model.obras.Acervo;
import model.obras.Livro;
import model.persistencia.Serializacao;
import view.exibicao.utilidades.TituloFormatado;

import java.util.Scanner;

/** Classe responsável por cadastrar livros no acervo. */
public class CadastrarLivro {

    /**
     * Solicita os dados do livro ao usuário e o adiciona ao acervo.
     * @param entrada Scanner para entrada de dados.
     */
    public static void dadosLivro(Scanner entrada) {
        boolean disponivel = false;

        TituloFormatado.exibirTituloSecao("Cadastrar Livro", 50 , "\u001B[35m");

        System.out.print("\u001B[36m");

        System.out.println("Digite os dados solicitados a seguir: ");

        entrada.nextLine();

        System.out.print("Título do livro: ");
        String titulo = entrada.nextLine();

        System.out.print("Título original do livro: ");
        String tituloOriginal = entrada.nextLine();

        System.out.print("Gênero do livro: ");
        String genero = entrada.nextLine();

        System.out.print("Ano de lançamento do livro: ");
        String anoLancamento = entrada.nextLine();

        System.out.print("Nome do(a) autor(a) do livro: ");
        String autor = entrada.nextLine();

        System.out.print("Nome da editora: ");
        String editora = entrada.nextLine();

        System.out.print("Código ISBN: ");
        String isbn = entrada.nextLine();

        System.out.print("Possui exemplar do livro? ");
        String posse = entrada.nextLine().toUpperCase();
        if (posse.equals("SIM")) {
            disponivel = true;
        } else if (posse.equals("NAO") || posse.equals("NÃO")) {
            disponivel = false;
        }

        Livro livro = new Livro(titulo, tituloOriginal, genero, anoLancamento,
                autor, editora, isbn, disponivel);
        Acervo acervo = Acervo.getAcervo();
        acervo.addLivro(livro);
        Serializacao.salvarLivro(acervo.getLivros());

        System.out.print("O livro " + titulo + " foi cadastrado com sucesso!\n");
        System.out.println(livro);
    }
}
