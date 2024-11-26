package com;


import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class simpleCalculatorTest {
    @Test
    @DisplayName("1 + 2 = 3")
    public void t1(){
        SimpleCalculator simpleCalculator = new SimpleCalculator();
        int rs = simpleCalculator.plus(1,2);

        assertEquals(3, rs);
    }

    @Test
    @DisplayName("2 + 10 = 12")
    public void t2(){
        SimpleCalculator simpleCalculator = new SimpleCalculator();
        int rs = simpleCalculator.plus(2,10);

        assertEquals(12, rs);
    }
}