import org.junit.Test;
import static org.junit.Assert.*;

public class AutorTest {

    @Test
    public void testGettersSetters() {
        Autor autor = new Autor("Jess", "Brasileira");

        assertEquals("Jess", autor.getNome());
        assertEquals("Brasileira", autor.getNacionalidade());

        autor.setNome("Maria");
        autor.setNacionalidade("Argentina");

        assertEquals("Maria", autor.getNome());
        assertEquals("Argentina", autor.getNacionalidade());
    }

    @Test
    public void testToString() {
        Autor autor = new Autor("Jess", "Brasileira");
        assertTrue(autor.toString().contains("Jess"));
    }
}
