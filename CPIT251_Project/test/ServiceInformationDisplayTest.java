

import cpit251_project.Government;
import cpit251_project.Service;
import java.util.ArrayList;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;


public class ServiceInformationDisplayTest {
    
    private Government gov;

    @Before
    public void setUp() {
        gov = new Government();
    }

    @Test
    //the given method is to test whether it returns the correct list of services or not
    public void testServiceInformation() {
        
        ArrayList<Service> expected_services= gov.getServices();
        assertEquals(expected_services,gov.getServices());
    }
    
    @Test
    public void TestShouldTestingServiceInfo(){
    ArrayList<Service> expected_services= null;
    assertNotEquals(expected_services,gov.getServices());
    
    }
   

}
