import java.util.ArrayList;
import java.util.List;

public class Usuario extends Pessoa {

    private List<Emprestimo> emprestimos = new ArrayList<>();

    public Usuario(String nome, int idade) {
        super(nome, idade);
    }

    public List<Emprestimo> getEmprestimos() { return emprestimos; }

    public void adicionarEmprestimo(Emprestimo e) {
        emprestimos.add(e);
    }
}
