package com.linkedlist;

/**
 * Santhosh G K
 */
public class ListNode {
    private Integer data;
    ListNode next = null;

    public ListNode(Integer data) {
        this.data = data;
        next = null;
    }

    public Integer getData() {
        return this.data;
    }

    public void setData(Integer data) {
        this.data = data;
    }

    public ListNode getNext() {
        return next;
    }

    public void setNext(ListNode next) {
        this.next = next;
    }
}
