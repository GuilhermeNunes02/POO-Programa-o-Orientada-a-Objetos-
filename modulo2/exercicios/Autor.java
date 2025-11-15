import java.util.ArrayList;
import java.util.List;

public class Autor extends Pessoa {

    private String nacionalidade;
    private List<Livro> livrosPublicados = new ArrayList<>();

    public Autor(String nome, int idade, String nacionalidade) {
        super(nome, idade);
        this.nacionalidade = nacionalidade;
    }

    public String getNacionalidade() { return nacionalidade; }
    public void setNacionalidade(String nacionalidade) { this.nacionalidade = nacionalidade; }

    public void adicionarLivro(Livro livro) { livrosPublicados.add(livro); }

    public List<Livro> getLivrosPublicados() { return livrosPublicados; }
}
