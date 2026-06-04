package CabService.com;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ValidationTest {

    @Test
    public void isValidPhonenumTest(){
        Validation v=new Validation();
        Boolean actual=v.isValidphone("9634343434");
        Assertions.assertTrue(actual);

    }
    @Test
    public void isValidEmailTest(){
        Validation v=new Validation();
        Boolean actual=v.isValidemail("dineshsirsiya@gmail.com");
        Assertions.assertTrue(actual);

    }
    @Test
    public void isValidPasswordTest(){
        Validation v=new Validation();
        Boolean actual=v.isValidpassword("Ss8$jjjjj");
        Assertions.assertTrue(actual);

    }

}
