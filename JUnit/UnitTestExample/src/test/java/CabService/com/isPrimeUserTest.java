package CabService.com;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class isPrimeUserTest {

    @Test
    public void getCustomerTest(){
        String actual=new isPrimeUser(true).getCustomer();
        Assertions.assertEquals("Yes",actual);

    }

}
