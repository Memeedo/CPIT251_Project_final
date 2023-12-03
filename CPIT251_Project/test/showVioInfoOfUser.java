
import cpit251_project.Government;
import cpit251_project.Violation;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author starx
 */
public class showVioInfoOfUser {
    
   private Government gov;

    @Before
    public void setUp() {
        gov = new Government();
        
     
    }

    @Test
    public void showInfo(){
        //violator is is given to the method to check if that violator exists in the database and returns the violaton info as an object
    int violator_ID= 11223;
    Violation expected_violation = gov.getAll_violotors()[0].getViolation();
    
        assertEquals(expected_violation, gov.vio_info(violator_ID));
    
    }
    @Test
    public void showInvlidInfo(){
        //violator is is given to the method to check if that violator exists in the database and returns the violaton info as an object
    int violator_ID= 11273;
    Violation expected_violation = gov.getAll_violotors()[0].getViolation();
    
        assertNotEquals(expected_violation, gov.vio_info(violator_ID));
    
    }
    
    
}
