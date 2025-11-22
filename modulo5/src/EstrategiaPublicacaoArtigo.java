package src;

public class EstrategiaPublicacaoArtigo implements EstrategiaPublicacao {
    private String titulo;
    private String revista;

    public EstrategiaPublicacaoArtigo(String titulo, String revista) {
        this.titulo = titulo;
        this.revista = revista;
    }

    @Override
    public void publicar() {
        System.out.println("[Artigo] Publicando artigo: '" + titulo + "' na revista " + revista + ". Revisão por pares completa.");
    }
}
