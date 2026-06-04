package com.kwd.test.services;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.assertTrue;


public class CalculatorServicesTestUnit5 {


//    @BeforeAll- Annotation in junit5:- it executes before the all test cases
    @BeforeAll
    public static void init(){
        System.out.println("Before All test cases");
        System.out.println("Started test: "+ new Date());
        //connection open OR file open
    }

       //@BeforeEach- Annotation in junit5:- it executes before each test cases
    @BeforeEach
    public void beforeEach(){
        System.out.println("Before each test cases");

    }

    //@AfterEach- Annotation in junit5:- it executes after each test cases
    @AfterEach
    public void afterEach(){
        System.out.println("After each test cases");

    }

    @Test
    @DisplayName("this is custom name") //this annotation use to give name to test cases
    //test method of addTwonum
    public void addTwonumTest(){
        System.out.println("test case of addTwonum");

        //actual result
        int result=CalculatorService.addTwonum(24,34);

        //expected result
        int expected=58;
        Assertions.assertEquals(expected,result,"Test case failed! ");

    }
    @ParameterizedTest
    @CsvSource({
            "12,14,26",
            "2,3,5",
            "4,4,8",
            "2,2,2"

    })
    public void addTwonumParameterizedTest(int a,int b,int expected){
        Assertions.assertEquals(expected,CalculatorService.addTwonum(a,b));

    }
    @ParameterizedTest
    @ValueSource(ints = {1,2,3,4,5})
    void testNumbers(int num){

        assertTrue(num > 0);
    }



    @Test
    //test method of mulTwonum
    @Disabled  //this annotation use to ignore test cases
    public void mulTwonumTest(){
        System.out.println("test case of mulTwonum");
        //actual result
        int result=CalculatorService.mulTwonum(5,2);
        //expected result
        int expected=10;
        Assertions.assertEquals(result,expected,"Test case failed! ");
    }

        //AfterAll- Annotation in JUnit5 :- it executes After the all test cases
    @AfterAll
    public static void cleanup(){
        System.out.println("After All test cases");
        System.out.println("End test Cases: "+ new Date());
        //connection close OR file close
    }
}


