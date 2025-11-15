import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Date;

public class EmprestimoTest {

    @Test
    public void testGettersSetters() {
        Date dataRetirada = new Date();
        Date dataDevolucao = new Date();

        Livro livro = new Livro("Java Basics", new Autor("Alan Turing", "Inglês"), "Tecnologia", true);
        Usuario usuario = new Usuario("Gabriel", 21);

        Emprestimo emprestimo = new Emprestimo(livro, usuario, dataRetirada, dataDevolucao);

        assertEquals(livro, emprestimo.getLivro());
        assertEquals(usuario, emprestimo.getUsuario());
        assertEquals(dataRetirada, emprestimo.getDataRetirada());
        assertEquals(dataDevolucao, emprestimo.getDataDevolucao());

        Date novaData = new Date(dataRetirada.getTime() + 86400000);
        emprestimo.setDataDevolucao(novaData);
        assertEquals(novaData, emprestimo.getDataDevolucao());
    }

    @Test
    public void testToString() {
        Date dataRetirada = new Date();
        Date dataDevolucao = new Date();

        Livro livro = new Livro("Java Basics", new Autor("Alan Turing", "Inglês"), "Tecnologia", true);
        Usuario usuario = new Usuario("Gabriel", 21);

        Emprestimo emprestimo = new Emprestimo(livro, usuario, dataRetirada, dataDevolucao);

        assertTrue(emprestimo.toString().contains("Java Basics"));
    }
}
s