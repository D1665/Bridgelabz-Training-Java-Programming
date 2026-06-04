package com.kwd.test.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorSeriviceTest {

    @Test
    public void addTwoNumTest(){
        CalculatorService cs=new CalculatorService();
        int result=CalculatorService.addTwonum(24,34);
        int expected=58;
        Assertions.assertEquals(expected,result);
    }
}
