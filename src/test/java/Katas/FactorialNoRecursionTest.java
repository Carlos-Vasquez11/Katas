package Katas;

import org.junit.Assert;
import org.junit.Test;

public class FactorialNoRecursionTest{

    @Test
    public void expectedResultValidNumbers(){
        Assert.assertEquals(24, FactorialNoRecursion.calcularFactorial(4));
        Assert.assertEquals(120, FactorialNoRecursion.calcularFactorial(5));
    }


}