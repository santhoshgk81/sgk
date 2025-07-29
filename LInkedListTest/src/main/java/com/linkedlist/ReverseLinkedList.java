package com.linkedlist;

import java.util.List;

public class ReverseLinkedList {
    static LinkedList linkedList = new LinkedList(List.of(1,2,3,4,5));
    static ListNode head = linkedList.createLinkedList();
    static ListNode newHead;

    public static ListNode reverseFully(ListNode head) {
       if(head.getNext() == null || head == null) {
           return head;
       }
       ListNode lastNode = reverseFully(head.next);
       head.next.next = head;
       head.next = null;
       return lastNode;
    }

    public static ListNode reversePairRecursively(ListNode head) {
        ListNode temp;
        if(head==null || head.next ==null) {
            return head;
        } else {
            temp = head.getNext();
            head.next = temp.getNext();
            temp.next = head;
            head = temp;
            head.next.next = reversePairRecursively(head.next.next);
            return head;
        }
    }
    public static void main(String ar[]) {
        linkedList.printLinkedList(head);
        System.out.println("\n\n");
        ListNode newHead = reverseFully(head);
        linkedList.printLinkedList(newHead);
        System.out.println("\n\n");
          linkedList = new LinkedList(List.of(1,2,3,4,5));
          head = linkedList.createLinkedList();
        linkedList.printLinkedList(head);
        System.out.println("\n\n");
         newHead = reversePairRecursively(head);
        linkedList.printLinkedList(newHead);
    }
}
