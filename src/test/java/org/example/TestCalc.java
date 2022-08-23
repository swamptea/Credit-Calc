package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestCalc {


    @Test
    public void testPayment(){
        Assertions.assertEquals(8560.75, Calc.payment(100000, 5, 12));
    }
    @Test
    public void testCreditSum(){
        Assertions.assertEquals(102729, Calc.creditSum(8560.75, 12));
    }
    @Test
    public void testOverPayment(){
        Assertions.assertEquals(2729, Calc.overPayment(100000, 102729));
    }
}
