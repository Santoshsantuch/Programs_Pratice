package com.learning.stack;

import java.util.Arrays;

public class CustomStackUsingArrays {
    int top=-1;
    int[] stack= new int[10];
    public void push(int val){
        if(top>= stack.length-1){
            System.out.println("size is exceeded");
        }
        top=top+1;
        stack[top]=val;
    }
    public void pop(){
        if(top==-1){
            System.out.println("Empty stack");
        }
        stack[top]=0;
        top=top-1;

    }
    public int top() {
        if (top == -1) {
            System.out.println("Stack is empty");
            return -1;
        }
        return stack[top];
    }
    public int size(){
        return top+1;
    }

    public int[] getStack() {
        return Arrays.copyOf(stack, top + 1);
    }

    public static void main(String[] args) {
        CustomStackUsingArrays st = new CustomStackUsingArrays();
        st.push(5);
        st.push(6);
        st.push(8);
        st.push(1);
        //st.pop();
        System.out.println(st.size());
        System.out.println(Arrays.toString(st.getStack()));

    }
}
