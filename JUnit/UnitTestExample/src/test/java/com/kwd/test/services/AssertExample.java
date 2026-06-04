package com.kwd.test.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class AssertExample {

    //Assertion - Validating actual result with expected result
    //Assertions Class which is the part of org.junit.jupiter.api package provide some static methods
    @Test
    public void Test1(){
        System.out.println("testing some assertions methods");
        int actual =12;
        int expected=12;

        //overloaded methods
//        Assertions.assertEquals(expected,actual);   //use to compare two value



//       int []acutalIntArray={1,2,3};
//       int []expectedIntArray={1,2,3};
//          Assertions.assertArrayEquals(expectedIntArray,acutalIntArray); //use to compare two array


//       String actualName= new String("Dinesh");
//       String expectedName=new String("Dinesh");
//      Assertions.assertSame(expectedName,actualName);  // this will fail the test case because this will check reference
//       Assertions.assertEquals(expectedName,actualName); //this will pass the test case because this will check only value
//

//        String actualValue=null;
//        Assertions.assertNull(actualValue);  //check the value is null
//        Assertions.assertNotNull(actualValue); //check the value is not null
//

//        Boolean actualValue=true;
//      Assertions.assertTrue(actualValue); //check the value is true
//        Assertions.assertFalse(actualValue); //check the value is false

//        List<Integer> actualList= Arrays.asList(1,2,3,4,5,6);
//        List<Integer> expectedList=Arrays.asList(1,2,3,4,5,6);
//        Assertions.assertIterableEquals(expectedList,actualList);  //use to compare two collection



//        Assertions.assertThrows(RuntimeException.class,()->{ //use to check the particular Exception
////            throw new RuntimeException("This is testing Exception"); // this will pass test cases
//              System.out.println("This is testing Execulable");  //this will fail the test cases because
//                                                                 //not throwing runtime exception
//        });



    }
}
