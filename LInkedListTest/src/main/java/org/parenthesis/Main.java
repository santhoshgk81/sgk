/**
 * Santhosh G K
 */

package org.example;

import com.linkedlist.LinkedList;
import com.linkedlist.ListNode;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList(List.of(1,2,3,4,5));
        ListNode head = linkedList.createLinkedList();
        if(head !=null ) {
            while (head !=null) {
                System.out.println(head.getData());
                head = head.getNext();
            }
        }
    }
}