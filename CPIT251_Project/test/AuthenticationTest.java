
import cpit251_project.Government;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
/**
 *
 * @author starx
 */
public class AuthenticationTest {

    private Government gov;

    @Before
    public void setUp() {
        gov = new Government();

    }

    @Test
    public void testValidAuthentication() {

        assertTrue("Authentication should succeed with valid credentials", gov.Authentication(11425, "lm2943"));
    }

    @Test
    public void testInvalidAuthentication() {
        assertFalse("Authentication should fail with invalid credentials", gov.Authentication(11345, "kh112233"));
    }

}
