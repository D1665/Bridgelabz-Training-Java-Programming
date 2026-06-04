package CabService.com;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class CabInvoiceGeneratorTest {



    @Test
    public void CalculateFareTest(){
        CalculateFair cig=new CalculateFair();
        double actualresult=cig.CalculateFare(10,30,"NO");
        double expectedresult=130;
        Assertions.assertEquals(expectedresult,actualresult);
    }


}
