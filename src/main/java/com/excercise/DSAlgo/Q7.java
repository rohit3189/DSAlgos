package com.excercise.DSAlgo;

import common_code.LinkedList;
import common_code.LinkedListNode;

import java.util.HashSet;
import java.util.Set;

/**
 * Given the head of a singly linked list, remove any duplicate nodes from the list in place,
 * ensuring that only one occurrence of each value is retained in the modified list.
 */
public class Q7 {
    public static void main(String[] args) {
        int[] sortedArray = {1, 1, 2, 3, 3};

        LinkedList linkedList = new LinkedList();

        System.out.println("\n" + "***** Using Sorted Array *****");

        linkedList.createLinkedList(sortedArray);

        linkedList.traverse(linkedList.head);

        System.out.println();

        LinkedListNode head1 = removeDuplicatesFromSortedArray(linkedList.head);

        linkedList.traverse(head1);

        linkedList.head = null;

        int[] unSortedArray = {6, 9, 3, 7, 9, 3};

        System.out.println("\n" + "***** Using UnSorted Array *****");

        linkedList.createLinkedList(unSortedArray);

        linkedList.traverse(linkedList.head);

        System.out.println();

        LinkedListNode head2 = removeDuplicatesFromUnSortedArray(linkedList.head);

        linkedList.traverse(head2);
    }

    public static LinkedListNode removeDuplicatesFromSortedArray(LinkedListNode head) {

        LinkedListNode temp = head;

        while (temp != null && temp.next != null) {
            if (temp.data == temp.next.data) {
                temp.next = temp.next.next;
            } else {
                temp = temp.next;
            }
        }
        return head;
    }

    public static LinkedListNode removeDuplicatesFromUnSortedArray(LinkedListNode head) {

        Set<Integer> set = new HashSet<>();

        LinkedListNode curr = head;
        LinkedListNode prev = null;

        while (curr != null) {
            int currentVal = curr.data;
            if (set.contains(currentVal)) {
                prev.next = curr.next;
            } else {
                set.add(currentVal);
                prev = curr;
            }
            curr = curr.next;
        }
        return head;
    }
}
