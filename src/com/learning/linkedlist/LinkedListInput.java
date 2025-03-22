package com.learning.linkedlist;
import com.learning.linkedlist.Node;
import java.util.LinkedList;
import java.util.Scanner;

class MyLinkedList {
    Node head;
    // Insert at the end
    void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return; /// stops further execution, preventing unnecessary traversal of the list.
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    // Print the linked list
    void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
}

public class LinkedListInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MyLinkedList list = new MyLinkedList();

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            list.insert(sc.nextInt());  // Insert each element
        }
        sc.close();

        // Print the final linked list
        System.out.print("Linked List: ");
        list.printList();
    }
}