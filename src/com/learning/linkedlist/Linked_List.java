package com.learning.linkedlist;


public class Linked_List {
    ///  Converting array to LL
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
    ////  Traversal the LL and printing the LL
    private static void print(Node head) {
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
    /// Value is Present or Not
    private static boolean checkIfPresent(Node head, int value) {
        Node temp = head;
        while (temp != null) {
            if (temp.data == value) {
                return true;
            }
            temp = temp.next;
        }
        return false;
    }
    /// Finding length of LL
    private static int lengthOfLL(Node head) {
        int count = 0;
        Node temp = head;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr={1,7,3,5,6,9,8};

        Node head=convertArrToLL(arr);

        print(head);


        /// head = insertHead(head, 100);
        /// head=new Node(100,head); //another way of inserting at the start
        /// System.out.println(checkIfPresent(head,9));




    }
}

///  Node y=new Node(arr[3],null);
///  Node y=new Node(arr[3]);
///  System.out.println(lengthOfLL(head));
///  System.out.println(head.data); //LL returns only head