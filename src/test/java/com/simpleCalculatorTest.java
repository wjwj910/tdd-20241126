package com;


import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class simpleCalculatorTest {
    @Test
    @DisplayName("multiply")
    public void t1(){
        SimpleCalculator simpleCalculator = new SimpleCalculator();
        int rs = simpleCalculator.multiply(10,10);

        assertEquals(100, rs);
    }

    @Test
    @DisplayName("minus")
    public void t2(){
        SimpleCalculator simpleCalculator = new SimpleCalculator();
        int rs = simpleCalculator.minus(10,10);

        assertEquals(0, rs);
    }

    @Test
    @DisplayName("divide")
    public void t3(){
        SimpleCalculator simpleCalculator = new SimpleCalculator();
        int rs = simpleCalculator.divide(10,10);

        assertEquals(1, rs);
    }

    @Test
    @DisplayName("reminder")
    public void t4(){
        SimpleCalculator simpleCalculator = new SimpleCalculator();
        int rs = simpleCalculator.reminder(10,10);

        assertEquals(0, rs);
    }


}