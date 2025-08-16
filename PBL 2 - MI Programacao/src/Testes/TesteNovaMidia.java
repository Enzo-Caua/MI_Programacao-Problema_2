package Testes;

import model.obras.Acervo;
import model.obras.Livro;
import model.persistencia.PersistirAcervo;

/**
 * Classe de teste utilizada para adicionar uma nova mídia (livro) ao acervo do sistema.
 * O livro é criado, adicionado ao acervo e, em seguida, o acervo é persistido em disco.
 */
public class TesteNovaMidia {

    /**
     * Método principal que cria um novo objeto {@code Livro}, o adiciona ao acervo
     * e salva o acervo atualizado em disco.
     *
     * @param args Argumentos de linha de comando (não utilizados).
     */
    public static void main(String[] args) {
        Livro livro = new Livro("Dom Casmurro", "Don Casmurro", "Romance", "1605",
                "Miguel de Cervantes", "Planeta", "123456789", true);

        PersistirAcervo.deserializarAcervo();

        Acervo.getAcervo().addLivro(livro);

        PersistirAcervo.serializarAcervo();
    }
}
