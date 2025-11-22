package src;

public class EstrategiaPublicacaoLivro implements EstrategiaPublicacao {
    private String titulo;
    private String autor;

    public EstrategiaPublicacaoLivro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    @Override
    public void publicar() {
        System.out.println("[Livro] Publicando livro: '" + titulo + "' por " + autor + ". Formatos disponíveis: PDF, EPUB, Impressão.");
    }
}
