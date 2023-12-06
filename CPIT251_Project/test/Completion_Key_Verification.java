
import cpit251_project.Government;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author starx
 */
public class Completion_Key_Verification {
    
   
     private Government gov;
     
     
    @Before
    public void setUp() {
        gov = new Government();
        //the following statement is unrelated to the test, 
        //just to make test works since the statement is not in subject of testing
       gov.setViolator(gov.getAll_violotors()[0]);
    }
    
    @Test
    public void testCompletion(){
    int serviceNo = 2;
    int userID = 11345;
    int expectedKey = 62;
    int violator_given_key =62;
        // the given method is to check whether the violator has done the service by the gov sending to him a key after completion and he should insert the given to verify that he completed the service
        assertEquals(expectedKey,gov.completionKey(serviceNo, userID,violator_given_key));
    
    }

    
}
