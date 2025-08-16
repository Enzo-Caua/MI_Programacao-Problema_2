package controller.cadastro;

import model.obras.Acervo;
import model.obras.Filme;
import model.persistencia.Serializacao;
import view.exibicao.utilidades.TituloFormatado;

import java.util.ArrayList;
import java.util.Scanner;

/** Classe responsável por cadastrar filmes no acervo. */
public class CadastrarFilme {

    /**
     * Solicita os dados do filme ao usuário e o adiciona ao acervo.
     * @param entrada Scanner para entrada de dados.
     */
    public static void dadosFilme(Scanner entrada) {

        TituloFormatado.exibirTituloSecao("Cadastrar Filme", 50 , "\u001B[35m");

        System.out.print("\u001B[36m");

        System.out.println("Digite os dados solicitados a seguir:");
        entrada.nextLine();

        System.out.print("Título do filme: ");
        String titulo = entrada.nextLine();

        System.out.print("Título original do filme: ");
        String tituloOriginal = entrada.nextLine();

        System.out.print("Gênero do filme: ");
        String genero = entrada.nextLine();

        System.out.print("Ano de lançamento do filme: ");
        String anoLancamento = entrada.nextLine();

        System.out.print("Duração do filme (em minutos): ");
        int duracao = entrada.nextInt();

        ArrayList<String> diretores = CadastrarEquipe.cadastrarDiretores(entrada);
        ArrayList<String> roteiristas = CadastrarEquipe.cadastrarRoteiristas(entrada);
        ArrayList<String> atores = CadastrarEquipe.cadastrarAtores(entrada);

        System.out.print("Plataforma em que o filme está disponível: ");
        String plataforma = entrada.nextLine();

        Filme filme = new Filme(titulo, tituloOriginal, genero, anoLancamento,
                duracao, diretores, roteiristas, atores, plataforma);
        Acervo acervo = Acervo.getAcervo();
        acervo.addFilme(filme);
        Serializacao.salvarFilme(acervo.getFilmes());

        System.out.println("O filme " + titulo + " foi cadastrado com sucesso!\n");
        System.out.print(filme);
    }
}
