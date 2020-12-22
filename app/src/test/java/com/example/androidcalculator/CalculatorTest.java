package com.example.androidcalculator;

import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {
    Calculator calculatorUnit = new Calculator();
    @Test
    public void TestingAddition(){
        float output = calculatorUnit.Addition(2,3);
        Assert.assertEquals(5,output,0);
    }
    @Test
    public void TestingSubrataction(){
       float output = calculatorUnit.Subraction(3,2);
       Assert.assertEquals(1,output,0);
    }
    @Test
    public void TestingMultiplication(){
        float output = calculatorUnit.Multiplication(2,3);
        Assert.assertEquals(6,output,0);
    }
    @Test
    public void TestingDivision(){
        float output = calculatorUnit.Division(4,2);
        Assert.assertEquals(2,output,0);
    }
}
