package controller.atualizacao;

import controller.busca.BuscarSerie;
import controller.cadastro.CadastrarTemporada;
import model.obras.Acervo;
import model.obras.Serie;
import model.persistencia.Serializacao;
import view.exibicao.utilidades.TituloFormatado;

import java.util.Scanner;

public class AtualizarSerie {

    public static void atualizarVisto (Scanner entrada) {
        TituloFormatado.exibirTituloSecao("Atualizar visto da série", 50, "\u001B[35m");
        System.out.print("\u001B[36m");
        entrada.nextLine();
        System.out.print("Digite o título da série: ");
        String titulo = entrada.nextLine();
        Serie serie = BuscarSerie.buscaTitulo(titulo).getFirst();
        System.out.print("Digite a data em que " + titulo + " foi vista: ");
        String dataVisto = entrada.nextLine();
        serie.alterarVisto(dataVisto);
        Serializacao.salvarSerie(Acervo.getAcervo().getSeries());
        System.out.println("Atualização feita com sucesso!");
    }

    public static void atualizarTemporada (Scanner entrada) {
        TituloFormatado.exibirTituloSecao("Atualizar temporadas da série", 50, "\u001B[35m");
        System.out.print("\u001B[36m");
        entrada.nextLine();
        System.out.print("Digite o título da série: ");
        String titulo = entrada.nextLine();
        Serie serie = BuscarSerie.buscaTitulo(titulo).getFirst();
        System.out.print("Digite o número de temporadas a serem cadastradas: ");
        int num = entrada.nextInt();
        for (int i = 1; i <= num; i++) {
            CadastrarTemporada.dadosTemporada(serie, entrada);
        }
        Serializacao.salvarSerie(Acervo.getAcervo().getSeries());
        System.out.println("Atualização feita com sucesso!");
    }

    public static void atualizarTermino (Scanner entrada) {
        TituloFormatado.exibirTituloSecao("Atualizar término da série", 50, "\u001B[35m");
        System.out.print("\u001B[36m");
        entrada.nextLine();
        System.out.print("Digite o título da série: ");
        String titulo = entrada.nextLine();
        Serie serie = BuscarSerie.buscaTitulo(titulo).getFirst();
        System.out.print("Digite o ano de termino da série: ");
        String ano = entrada.nextLine();

        serie.setAnoTermino(ano);

        Serializacao.salvarSerie(Acervo.getAcervo().getSeries());
        System.out.println("Atualização feita com sucesso!");
    }
}
