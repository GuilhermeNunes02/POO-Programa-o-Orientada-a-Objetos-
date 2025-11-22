package src;

// Autor funciona como um 'decorator' / entidade que possui uma estratégia de publicação
public class Autor implements PublicavelInterface {
    private String nome;
    private EstrategiaPublicacao estrategia;

    public Autor(String nome) {
        this.nome = nome;
    }

    public void setEstrategiaPublicacao(EstrategiaPublicacao estrategia) {
        this.estrategia = estrategia;
    }

    @Override
    public void publicar() {
        if (estrategia == null) {
            System.out.println(nome + " não tem estratégia de publicação definida.");
        } else {
            System.out.println(nome + " inicia o processo de publicação:");
            estrategia.publicar();
        }
    }
}
