package Katas;

import org.junit.Assert;
import org.junit.Test;

public class FactorialRecursionTest {

    @Test
    public void expectedResultValidNumbers(){
        Assert.assertEquals(24, FactorialRecursion.calculateFactorialRecursion(4));
        Assert.assertEquals(120, FactorialRecursion.calculateFactorialRecursion(5));
    }

}