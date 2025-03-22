package com.learning.linkedlist;

class CustomLinkedList {
    Node head;

    // Insert at the end
    public void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    // Delete Head
    public void deleteHead() {
        if (head == null) return;
        head = head.next;
    }

    // Delete Tail
    public void deleteTail() {
        if (head == null || head.next == null) {
            head = null;
            return;
        }
        Node temp = head;
        while (temp.next.next != null) {
            temp = temp.next;
        }
        temp.next = null;
    }

    // Delete Kth Position
    public void deleteKthPosition(int k) {
        if (head == null) return;
        if (k == 1) {
            head = head.next;
            return;
        }
        Node temp = head, prev = null;
        int count = 1;
        while (temp != null && count < k) {
            prev = temp;
            temp = temp.next;
            count++;
        }
        if (temp != null) {
            prev.next = temp.next;
        }
    }

    // Delete Element by Value
    public void deleteElement(int ele) {
        if (head == null) return;
        if (head.data == ele) {
            head = head.next;
            return;
        }
        Node temp = head, prev = null;
        while (temp != null) {
            if (temp.data == ele) {
                prev.next = temp.next;
                return;
            }
            prev = temp;
            temp = temp.next;
        }
    }

    // Print LinkedList
    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
}

public class LinkedListMain {
    public static void main(String[] args) {
        CustomLinkedList list = new CustomLinkedList();

        // Insert elements
        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insert(40);
        list.insert(50);

        System.out.println("Original List:");
        list.printList();

        // Delete head
        list.deleteHead();
        System.out.println("After deleting head:");
        list.printList();

        // Delete tail
        list.deleteTail();
        System.out.println("After deleting tail:");
        list.printList();

        // Delete Kth Position (2nd element)
        list.deleteKthPosition(2);
        System.out.println("After deleting 2nd position:");
        list.printList();

        // Delete specific element (20)
        list.deleteElement(20);
        System.out.println("After deleting element 20:");
        list.printList();
    }
}

