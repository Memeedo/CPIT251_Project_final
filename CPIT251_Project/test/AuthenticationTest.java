
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
        gov = new Government();                                                                      /*
    
                                                                            this the actual hypothetical database of the government
                                                                    allViolators[0] = new User("Ahmed", 22, 11223, vio1, "ah2233");
                                                                    allViolators[1] = new User("Saleh", 23, 11345, vio2, "sh432");
                                                                     allViolators[2] = new User("Wael", 29, 11425, vio3, "lm2943");
                                                                     allViolators[3] = new User("Khalid", 21, 12345, vio1, "kh112233");
    */

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
