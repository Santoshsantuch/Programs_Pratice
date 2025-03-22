package com.learning.linkedlist;

import com.learning.linkedlist.Node;

public class LinkedList_Insertion {

    ///  Converting LL to ARR
    private static Node convertArrToLL(int[] arr) {
        Node head = new Node(arr[0]); //Assigning head to first element - F.E is always head
        Node mover = head; //mover should start from head

        for (int i = 1; i < arr.length; i++) {
            Node temp = new Node(arr[i]); //it iterates every node
            mover.next = temp;
            mover = temp;
        }
        return head;
    }

    /// /  Traversal the LL and printing the LL
    private static void print(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    /// Insertion at the head
    private static Node insertHead(Node head, int value) {
        return new Node(value, head);

    }

    /// Insertion at the Tail
    private static Node insertTail(Node head, int value) {
        if (head == null) {
            return new Node(value);
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        Node newNode = new Node(value);
        temp.next = newNode;
        return head;
    }

    /// Insertion at the kth element
    private static Node insertKthelement(Node head, int value, int k) {
        if (head == null) {
            if (k == 1) {
                return new Node(value);
            } else {
                return head;
            }
        }

        if (k == 1) {
            Node newNode = new Node(value, head);
            return newNode;
        }
        int count = 0;
        Node temp = head;
        while (temp != null) {
            count++;
            if (count == k - 1) {
                Node newNode = new Node(value);
                newNode.next = temp.next;
                temp.next = newNode;
                break;
            }
            temp = temp.next;
        }
        return head;
    }

    /// Inserting element
    private static Node insertbeforeElement(Node head, int element, int valueBefore) {
        if (head == null) {   /// inserting an valueBefore if that is not even exist is not possible right so we return null
            return null;
        }
        if (head.data == valueBefore) {
            return new Node(element, head);
        }
        Node temp = head;
        while (temp.next != null) {
            if(temp.next.data==valueBefore) {
                Node newNode = new Node(element,temp.next);
                temp.next = newNode;
                break;
            }
            temp = temp.next;
        }

        return head;

    }

    public static void main(String[] args) {
        int[] arr = {1, 7, 3, 5, 6, 9, 8};

        Node head = convertArrToLL(arr);

        //head=insertHead(head,5);
        //head=insertTail(head,6);
        // head=insertKthelement(head,3,9);
        head = insertbeforeElement(head, 5, 9);

        print(head);
    }
}
