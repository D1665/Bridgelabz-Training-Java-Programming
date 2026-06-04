package com.kwd.test.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.Parameter;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

public class StringUtilsTest {

    @Test
    public void reverseTest(){
        StringUtils st=new StringUtils();
        String actual=st.reverse("Dinesh");
        Assertions.assertEquals("hseniD",actual);
    }
    @Test
    public void ispalindromeTest(){
        StringUtils st=new StringUtils();

        Assertions.assertTrue(st.ispalindrome("issijjj"));
    }
   @ParameterizedTest
   @CsvSource({
           "Dinesh,hseniD",
           "Sirsiya,ayisriS",
           "Rakesh,hsekaR",
           "Modi,yogi"
   })
    public void reverseParameterizedTest(String str,String exp){
        StringUtils st=new StringUtils();
        Assertions.assertEquals(exp,st.reverse(str));
    }
    @ParameterizedTest
    @ValueSource( strings={"xyyx","yyyy","immi"})
    public void ispalindromeTest(String strr){
        StringUtils st=new StringUtils();
        Assertions.assertTrue(st.ispalindrome(strr));
    }
}
