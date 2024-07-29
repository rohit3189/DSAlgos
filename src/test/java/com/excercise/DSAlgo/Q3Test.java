package com.excercise.DSAlgo;

import org.junit.jupiter.api.*;

import java.util.Arrays;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class Q3Test {

    Q3 q3 = new Q3();

    @Test
    @Order(1)
    public void testProductExceptSelfOnlyPositiveNumbers() {
        int[] nums = new int[]{1, 2, 3, 4};
        Assertions.assertEquals(Arrays.toString(new int[]{24, 12, 8, 6}),
                                Arrays.toString(q3.productExceptSelf(nums)));
    }

    @Test
    @Order(2)
    public void testProductExceptSelfWithNegativeAndZero() {
        int[] nums = new int[]{-1, 1, 0, -3, 3};
        Assertions.assertEquals(Arrays.toString(new int[]{0, 0, 9, 0, 0}),
                                Arrays.toString(q3.productExceptSelf(nums)));
    }
}
