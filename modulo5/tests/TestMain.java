package tests;

import src.Autor;
import src.EstrategiaPublicacao;
import src.EstrategiaPublicacaoLivro;
import src.EstrategiaPublicacaoArtigo;

public class TestMain {
    public static void main(String[] args) {
        Autor autor = new Autor("Teste");

        // sem estratégia -> output esperado note
        autor.publicar();

        autor.setEstrategiaPublicacao(new EstrategiaPublicacaoLivro("Teste Livro", "Autor X"));
        autor.publicar();

        autor.setEstrategiaPublicacao(new EstrategiaPublicacaoArtigo("Teste Artigo", "Revista Y"));
        autor.publicar();

        System.out.println("Testes simples executados (ver saída). Se viu mensagens de publicação, OK.");
    }
}
