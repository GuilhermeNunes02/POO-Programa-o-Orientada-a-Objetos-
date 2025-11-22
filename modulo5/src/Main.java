package src;

public class Main {
    public static void main(String[] args) {
        Autor autor = new Autor("Mariana Silva");

        // Tentar publicar sem estratégia
        autor.publicar();

        // Define estratégia para livro
        EstrategiaPublicacao livro = new EstrategiaPublicacaoLivro("Introdução ao Padrão Strategy", "Mariana Silva");
        autor.setEstrategiaPublicacao(livro);
        autor.publicar();

        // Troca a estratégia para artigo
        EstrategiaPublicacao artigo = new EstrategiaPublicacaoArtigo("Padrões de Projeto em Java", "Revista Java Hoje");
        autor.setEstrategiaPublicacao(artigo);
        autor.publicar();
    }
}
