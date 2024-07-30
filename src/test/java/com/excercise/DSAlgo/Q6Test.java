package com.excercise.DSAlgo;

import common_code.LinkedList;
import common_code.LinkedListNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Q6Test {

    @Test
    public void testFindMiddle_EvenLength() {
        int[] evenLengthArray = {5, 7, 2, 4, 3, 6};
        LinkedList linkedList = new LinkedList();
        linkedList.createLinkedList(evenLengthArray);
        LinkedListNode linkedListNode = Q6.findMiddle(linkedList.head);

        Assertions.assertEquals(4, linkedListNode.data);
    }

    @Test
    public void testFindMiddle_OddLength() {
        int[] oddLengthArray = {6, 9, 7, 12, 43, 5, 11};
        LinkedList linkedList = new LinkedList();
        linkedList.createLinkedList(oddLengthArray);
        LinkedListNode linkedListNode = Q6.findMiddle(linkedList.head);

        Assertions.assertEquals(12, linkedListNode.data);
    }
}
