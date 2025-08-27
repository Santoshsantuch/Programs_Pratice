package com.learning.queue;

public class QueueImplUsingArrays {
    int start=-1,end=-1;
    int[] queue=new int[5];
    int size= queue.length;
    int curr_size=0;
    public void push(int val){
        if(curr_size==size) {
            System.out.println("size excceds");
            return;
        }
        if(curr_size==0) {
            start = 0;
            end = 0;
        }else{
            end=(end+1)%size;
        }
        queue[end]=val;
        curr_size+=1;
    }
    public int pop(){
        if (curr_size == 0) {
            System.out.println("Empty queue");
            return -1;
        }
        int ele=queue[start];
        if(curr_size==1){
            start=-1;
            end=-1;
        }else{
            start=(start+1)%size;
        }
        curr_size-=1;
        return ele;
    }
    public void printQueue() {
        if (curr_size == 0) {
            System.out.println("Queue is empty");
            return;
        }
        System.out.print("Queue: ");
        for (int i = 0; i < curr_size; i++) {
            int index = (start + i) % size;
            System.out.print(queue[index] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        QueueImplUsingArrays queue = new QueueImplUsingArrays();
        queue.push(5);
        queue.push(2);
        queue.push(1);
        queue.push(3);
        queue.pop();
        queue.printQueue();

    }
}
