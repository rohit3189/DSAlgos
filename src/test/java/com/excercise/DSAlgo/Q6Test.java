package com.excercise.DSAlgo;

import common_code.LinkedList;
import common_code.LinkedListNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class Q6Test {

    @ParameterizedTest
    @MethodSource("streamOfArrays")
    public void testFindMiddle(int[] arr) {
        LinkedList linkedList = new LinkedList();
        linkedList.createLinkedList(arr);
        LinkedListNode linkedListNode = Q6.findMiddle(linkedList.head);
        if (arr.length % 2 == 0) {
            Assertions.assertEquals(4, linkedListNode.data);
        } else {
            Assertions.assertEquals(12, linkedListNode.data);
        }
    }

    private static Stream<int[]> streamOfArrays() {
        return Stream.of(new int[]{5, 7, 2, 4, 3, 6}, new int[]{6, 9, 7, 12, 43, 5, 11});
    }
}
