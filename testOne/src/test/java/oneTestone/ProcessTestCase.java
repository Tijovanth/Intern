package oneTestone;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.modules.junit4.PowerMockRunner;
import oneTest.Process;

import java.util.HashMap;
import java.util.Map;

@RunWith(PowerMockRunner.class)
public class ProcessTestCase {

      Process process = new Process();
        Map<Long,String> map = new HashMap(); 
 
    @Test
    public void addCardDetailsTestCase() throws Exception {
        Assert.assertEquals(false,process.addCardDetails("Tijovanth","tijo",1234567890,1234,12345,map));
        Assert.assertEquals(false,process.addCardDetails("Tijovanth","tijovanth83@gmail.com",1234567890,123,12345,map));
        Assert.assertEquals(false,process.addCardDetails("Tijovanth","tijovanth83@gmail.com",1234567890,1234,5000000,map));
        Assert.assertEquals(true,process.addCardDetails("Tijovanth","tijovanth83@gmail.com",1234567890,1234,12345,map));
    }
    @Test
    public void accessCardDetailsTestCase() {
        map.put((long)1234567890,"Tijo");
        Assert.assertEquals(false,process.accesscard(123456789,1234,map));
        Assert.assertEquals(false,process.accesscard(1234567890,12,map));
        Assert.assertEquals(true,process.accesscard(1234567890,1234,map));
    }
    @Test
    public void deleteCardDetailsTestCase() {
        map.put((long)1234567890,"Tijo");
        Assert.assertEquals(true,process.deletecard(1234567890,map));
        Assert.assertEquals(false,process.deletecard(12345,map));
    }
}

