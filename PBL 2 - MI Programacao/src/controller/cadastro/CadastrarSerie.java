package controller.cadastro;


import model.obras.Acervo;
import model.obras.Serie;
import model.persistencia.Serializacao;
import view.exibicao.utilidades.TituloFormatado;

import java.util.ArrayList;
import java.util.Scanner;

/** Classe responsável por cadastrar séries no acervo. */
public class CadastrarSerie {

    /**
     * Solicita os dados da série ao usuário e a adiciona ao acervo.
     * Também permite o cadastro das temporadas da série.
     * @param entrada Scanner para entrada de dados.
     */
    public static void dadosSerie(Scanner entrada) {

        TituloFormatado.exibirTituloSecao("Cadastrar Serie", 50 , "\u001B[35m");

        System.out.print("\u001B[36m");

        System.out.println("Digite os dados solicitados a seguir: ");
        entrada.nextLine();

        System.out.print("Título da série: ");
        String titulo = entrada.nextLine();

        System.out.print("Título original da série: ");
        String tituloOriginal = entrada.nextLine();

        System.out.print("Gênero da série: ");
        String genero = entrada.nextLine();

        System.out.print("Ano de lançamento da série: ");
        String anoLancamento = entrada.nextLine();

        ArrayList<String> diretores = CadastrarEquipe.cadastrarDiretores(entrada);
        ArrayList<String> roteiristas = CadastrarEquipe.cadastrarRoteiristas(entrada);
        ArrayList<String> atores = CadastrarEquipe.cadastrarAtores(entrada);

        System.out.print("Plataforma em que a série está disponível: ");
        String plataforma = entrada.nextLine();

        Serie serie = new Serie(titulo, tituloOriginal, genero, anoLancamento,
                diretores, roteiristas, atores, plataforma);
        Acervo acervo = Acervo.getAcervo();
        acervo.addSerie(serie);

        System.out.print("Número de temporadas a serem cadastradas: ");
        int num = entrada.nextInt();
        for (int i = 1; i <= num; i++) {
            CadastrarTemporada.dadosTemporada(serie, entrada);
        }

        Serializacao.salvarSerie(acervo.getSeries());

        System.out.println("A série " + titulo + " foi cadastrada com sucesso!\n");
        System.out.print(serie);
    }
}
