import org.junit.Test;
import static org.junit.Assert.*;

public class LivroTest {

    @Test
    public void testGettersSetters() {
        Autor autor = new Autor("Jess", "Brasileira");
        Livro livro1 = new Livro("Java Basico", autor, "tecnologia", true);
        Livro livro2 = new Livro("Java Avançado", autor, "tecnologia", false);

        assertEquals("Java Basico", livro1.getTitulo());
        assertEquals("tecnologia", livro1.getGenero());
        assertTrue(livro1.isDisponivel());

        assertEquals("Java Avançado", livro2.getTitulo());
        assertFalse(livro2.isDisponivel());

        livro2.setDisponivel(true);
        assertTrue(livro2.isDisponivel());
    }

    @Test
    public void testToString() {
        Autor autor = new Autor("Jess", "Brasileira");
        Livro livro = new Livro("Java Basico", autor, "tecnologia", true);

        assertTrue(livro.toString().contains("Java Basico"));
    }
}
