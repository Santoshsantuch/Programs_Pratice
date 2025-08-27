package com.learning.linkedlist;

public class LinkedList_Deletion {

    ///  Coverting LL to Array
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

    /// Deletion the head
    private static Node deletehead(Node head) {
        //Node temp = head;
        if (head == null) {
            return head;
        }
        head = head.next;
        return head;
    }

    ///     Deletion the Tail
    private static Node deleteTail(Node head) {
        Node temp = head;
        if (head == null || head.next == null) {
            return null;
        }
        while (temp.next.next != null) {
            temp = temp.next;
        }
        temp.next = null;
        return head;
    }

    private static Node deletekthPositionUpdated(Node head, int k) {
        if (head == null) return null;
        if (k == 1) return head.next; // Delete head if k is 1

        Node temp = head;
        Node prev = null;
        int count = 1;
        while (temp != null && count < k) {
            prev = temp;
            temp = temp.next;
            count++;
        }
        /// it is the logic to assign the prev.next to the head.next like after while loops completes
        /// it comes to this condition and do  the job
        if (temp != null) {
            prev.next = temp.next;
        }
        return head;
    }

    // Deleting an Element
    private static Node deleteEleUpdated(Node head, int ele) {
        if (head == null) return null;
        if (head.data == ele) return head.next; // If element is at head
        Node temp = head;
        Node prev = null;

        while (temp != null && temp.data!=ele) {

            prev = temp;
            temp = temp.next;
        }
        if(temp != null) {
            prev.next = temp.next;
        }
        return head;
    }

    /// Deletion the Kth Positon
    private static Node deletekthPosition(Node head, int k) {
        Node temp = head;
        if (head == null) {
            return head;
        }
        if (k == 1) {
            head = head.next;
            return head;
        }
        int count = 0;
        Node prev = null;
        while (temp != null) {
            count++;
            if (count == k) {
                prev.next = prev.next.next;
                break;
            }
            prev = temp;
            temp = temp.next;
        }
        return head;
    }

    /// Deleting the Element
    private static Node deleteEle(Node head, int ele) {
        Node temp = head;
        if (head == null) {
            return head;
        }
        if (head.data == ele) {
            head = head.next;
            return head;
        }
        Node prev = null;
        while (temp != null) {
            if (temp.data == ele) {
                prev.next = prev.next.next;
            }
            prev = temp;
            temp = temp.next;
        }
        return head;
    }

    public static void main(String[] args) {
        int[] arr = {1, 7, 3, 5, 6, 9, 8};

        Node head = convertArrToLL(arr);
        head = deleteEleUpdated(head, 3);
        print(head);

        // head=deletehead(head);
        // head=deletekthPosition(head,3);
        // head=deleteEle(head,9);
    }

}
