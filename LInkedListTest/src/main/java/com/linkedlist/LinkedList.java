package com.linkedlist;

import java.util.List;
import java.util.ListIterator;

public class LinkedList {

    private final List<Integer> dataList;

    public LinkedList(List<Integer> dataList) {
        this.dataList = dataList;
    }

    public  ListNode createLinkedList() {
        ListNode head = null;
        ListNode next;

        if (dataList != null && !dataList.isEmpty()) {
           ListIterator<Integer> iterator =  dataList.listIterator();
           next = new  ListNode(iterator.next());
           head = next;
           while(iterator.hasNext()) {
             ListNode  node  = new ListNode(iterator.next());
             next.setNext(node);
             next = next.getNext();
           }

        }
        return head;
    }

    public void printLinkedList(ListNode node) {
        if (node != null) {
            while(node != null ){
                System.out.print(node.getData() +"->");
                node = node.getNext();
            }
        }
    }
}