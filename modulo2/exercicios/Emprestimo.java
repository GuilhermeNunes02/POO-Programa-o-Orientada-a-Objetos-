import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Emprestimo {

    private Date dataRetirada;
    private Date dataDevolucao;
    private Usuario usuario;
    private List<Livro> livros = new ArrayList<>();

    public Emprestimo(Usuario usuario) {
        this.usuario = usuario;
        this.dataRetirada = new Date();
        this.dataDevolucao = new Date();
        usuario.adicionarEmprestimo(this);
    }

    public void adicionarLivro(Livro livro) {
        if (!livro.isDisponivel()) {
            System.out.println("O livro não está disponível");
            return;
        }

        livro.validarDisponibilidade();
        livros.add(livro);
    }

    public Date getDataRetirada() { return dataRetirada; }
    public Date getDataDevolucao() { return dataDevolucao; }
    public Usuario getUsuario() { return usuario; }
    public List<Livro> getLivros() { return livros; }
}
