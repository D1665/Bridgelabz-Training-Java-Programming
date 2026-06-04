//package com.kwd.test.services;
//
//
//import org.junit.*;
//
//import java.util.Date;
//
//public class CalculatorServicesTestUnit4  {
//
//    //@BeforeClass- Annotation:- it executes before the all test cases
//    @BeforeClass
//    public static void init(){
//        System.out.println("Before All test cases");
//        System.out.println("Started test: "+ new Date());
//        //connection open OR file open
//    }
//
//   //@Before- Annotation:- it executes before each test cases
//    @Before
//    public void beforeEach(){
//        System.out.println("Before each test cases");
//
//    }
//
//    //@After- Annotation:- it executes after each test cases
//    @After
//    public void afterEach(){
//        System.out.println("After each test cases");
//
//    }
//
//    @Test
//    //test method of addTwonum
//    public void addTwonumTest(){
//        System.out.println("test case of addTwonum");
//
//        //actual result
//        int result=CalculatorService.addTwonum(24,34);
//
//        //expected result
//        int expected=58;
//        Assert.assertEquals(result,expected);
//
//    }
//
//    @Test
//    //test method of mulTwonum
//    public void mulTwonumTest(){
//        System.out.println("test case of mulTwonum");
//        //actual result
//        int result=CalculatorService.mulTwonum(5,2);
//        //expected result
//        int expected=10;
//        Assert.assertEquals(result,expected);
//    }
//
//
//
////     in Test annotation we can pass the particular time this method takes more than that time for this
////     test case it will fail automatically despite of matching expected value
//    @Test(timeout = 2000)
//    //test method of divideTwonum
//    public void divideTwonumTest() throws InterruptedException {
//        System.out.println("test case of divideTwonum");
//
//        Thread.sleep(3000);
//
//        //actual result
//        double result=CalculatorService.divideTwonum(8,4);
//        //expected result
//        double expected=2.0;
//        System.out.println(result+" "+expected);
//
//        Assert.assertEquals(expected, result, 0.001);
//    }
//
//
//    //AfterClass- Annotation:- it executes After the all test cases
//    @AfterClass
//    public static void cleanup(){
//        System.out.println("After All test cases");
//        System.out.println("End test Cases: "+ new Date());
//        //connection close OR file close
//    }
//
//
//}
