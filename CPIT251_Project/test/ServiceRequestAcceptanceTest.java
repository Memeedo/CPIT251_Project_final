
import cpit251_project.Government;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class ServiceRequestAcceptanceTest {
    
    private Government gov;

    @Before
    public void setUp() {
        gov = new Government();
        
       // the following statement has nothing to do with the test itself
       gov.setViolator(gov.getAll_violotors()[0]);
      gov.getViolator().setService(null);
    }

    @Test
    // it retunrs true if the service is accepted by the government ( it's always true since it's a simulation) however, it checks if the service number is valid
    public void testValidServiceRequest() {
        int service_number=1;
        assertTrue(gov.requestIsAccepted(service_number));
    }

    @Test
    public void testInvalidServiceRequest() {
       int service_number=5;
        assertFalse(gov.requestIsAccepted(service_number));
    }
}
