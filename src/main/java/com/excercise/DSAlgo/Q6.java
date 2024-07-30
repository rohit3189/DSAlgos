package com.excercise.DSAlgo;

import common_code.LinkedList;
import common_code.LinkedListNode;

/**
 * Given the head of a singly linked list, return the middle node of the linked list.
 * If there are two middle nodes, return the second middle node.
 * This happens when the length of the list is even,
 * and the second middle node occurs at length/2.
 * Otherwise, if the length of the list is odd,
 * the middle node occurs at (length/2 +1).
 */

public class Q6 {
    public static void main(String[] args) {

        int[] evenLengthArray = {5, 7, 2, 4, 3, 6};

        int[] oddLengthArray = {6, 9, 7, 12, 43, 5, 11};

        LinkedList linkedList = new LinkedList();

        linkedList.createLinkedList(evenLengthArray);

        System.out.println(findMiddle(linkedList.head).data);

        linkedList.head = null;

        linkedList.createLinkedList(oddLengthArray);

        System.out.println(findMiddle(linkedList.head).data);
    }

    public static LinkedListNode findMiddle(LinkedListNode head) {

        LinkedListNode slow = head;
        LinkedListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }
}
