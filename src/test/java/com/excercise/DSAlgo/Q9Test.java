package com.excercise.DSAlgo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.stream.Stream;

public class Q9Test {

    Q9 q9 = new Q9();

    @ParameterizedTest
    @MethodSource(value = {"streamOfArrays1", "streamOfArrays2"})
    public void testNextGreaterElement(int[] arr1, int[] arr2, int[] expectedResult) {
        int[] actualResult = q9.nextGreaterElement(arr1, arr2);
        Assertions.assertEquals(Arrays.toString(expectedResult), Arrays.toString(actualResult));
    }

    public static Stream<Arguments> streamOfArrays1() {
        return Stream.of(Arguments.of(new int[]{2, 4}, new int[]{1, 2, 3, 4}, new int[]{3, -1}));
    }

    public static Stream<Arguments> streamOfArrays2() {
        return Stream.of(Arguments.of(new int[]{4, 1, 2}, new int[]{1, 3, 4, 2}, new int[]{-1, 3, -1}));
    }
}