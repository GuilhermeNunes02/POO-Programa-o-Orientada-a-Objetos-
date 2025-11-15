import org.junit.Test;
import static org.junit.Assert.*;

public class UsuarioTest {

    @Test
    public void testGettersSetters() {
        Usuario usuario = new Usuario("Gabriel", 21);

        assertEquals("Gabriel", usuario.getNome());
        assertEquals(21, usuario.getIdade());

        usuario.setNome("Lucas");
        usuario.setIdade(30);

        assertEquals("Lucas", usuario.getNome());
        assertEquals(30, usuario.getIdade());
    }

    @Test
    public void testToString() {
        Usuario usuario = new Usuario("Gabriel", 21);
        assertTrue(usuario.toString().contains("Gabriel"));
    }
}
