package CabService.com;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CustomerFairTest {
    @Test
    public void CalculateFareTest(){
        CalculateFair cig=new CalculateFair();
        double actualresult=cig.CalculateFare(10,30,"Yes");
        double expectedresult=210;
        Assertions.assertEquals(expectedresult,actualresult);
    }
}
