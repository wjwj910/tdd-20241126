package com;


import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class simpleCalculatorTest {
    @Test
    @DisplayName("plus")
    public void t1(){
        SimpleCalculator simpleCalculator = new SimpleCalculator();
        int rs = simpleCalculator.plus(10,10);

        //assertEquals(0, rs);
        assertThat(rs).isEqualTo(20);
    }

    @Test
    @DisplayName("minus")
    public void t2(){
        SimpleCalculator simpleCalculator = new SimpleCalculator();
        int rs = simpleCalculator.minus(10,10);

        //assertEquals(0, rs);
        assertThat(rs).isEqualTo(0);
    }

    @Test
    @DisplayName("multiply")
    public void t3(){
        SimpleCalculator simpleCalculator = new SimpleCalculator();
        int rs = simpleCalculator.multiply(10,10);

        //assertEquals(100, rs);
        assertThat(rs).isEqualTo(100);
    }

    @Test
    @DisplayName("divide")
    public void t4(){
        SimpleCalculator simpleCalculator = new SimpleCalculator();
        int rs = simpleCalculator.divide(10,10);

        //assertEquals(1, rs);
        assertThat(rs).isEqualTo(1);
    }

    @Test
    @DisplayName("reminder")
    public void t5(){
        SimpleCalculator simpleCalculator = new SimpleCalculator();
        int rs = simpleCalculator.reminder(10,10);

        //assertEquals(0, rs);
        assertThat(rs).isEqualTo(0);
    }


}