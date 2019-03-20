package com.itcast.test;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

/**
 * Unit test for simple App.
 */
public class AppTest {
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue() {
        assertTrue(true);
    }


    @Test
    public void testLambda1() {
        Runnable r = new Runnable() {
            @Override
            public void run() {
                System.out.println("------------------------------");
            }
        };

        r.run();

        Runnable runnable =() -> System.out.println("hello lambda");
        runnable.run();

        List list = Arrays.asList("bb","cc","dd","ee");




    }


}
