package Katas;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class PrimeNumbersTest {

    public static void addPrimeNumbers(ArrayList<Integer> primeNumbersExpected){
        primeNumbersExpected.add(2);
        primeNumbersExpected.add(3);
        primeNumbersExpected.add(5);
        primeNumbersExpected.add(7);
        primeNumbersExpected.add(11);
        primeNumbersExpected.add(13);
        primeNumbersExpected.add(17);
        primeNumbersExpected.add(19);
        primeNumbersExpected.add(23);
        primeNumbersExpected.add(29);
        primeNumbersExpected.add(31);
        primeNumbersExpected.add(37);
        primeNumbersExpected.add(41);
        primeNumbersExpected.add(43);
        primeNumbersExpected.add(47);
        primeNumbersExpected.add(53);
        primeNumbersExpected.add(59);
        primeNumbersExpected.add(61);
        primeNumbersExpected.add(67);
        primeNumbersExpected.add(71);
        primeNumbersExpected.add(73);
        primeNumbersExpected.add(79);
        primeNumbersExpected.add(83);
        primeNumbersExpected.add(89);
        primeNumbersExpected.add(97);
    }

    @Test
    public void noPrimeNumbers(){
        ArrayList<Integer> primeNumbersExpected = new ArrayList<>();
        ArrayList<Integer> primeNumbersActual = new ArrayList<>();

        primeNumbersActual = PrimeNumbers.primeNumbersLessThan(2);
        Assert.assertEquals(primeNumbersExpected, primeNumbersActual);
    }

    @Test
    public void primeNumbersLessThan100(){
        ArrayList<Integer> primeNumbersExpected = new ArrayList<>();
        ArrayList<Integer> primeNumbersActual = new ArrayList<>();

        addPrimeNumbers(primeNumbersExpected);
        primeNumbersActual = PrimeNumbers.primeNumbersLessThan(100);

        Assert.assertEquals(primeNumbersExpected, primeNumbersActual);
    }
}