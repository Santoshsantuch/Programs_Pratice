package com.learning.multithreading;

public class Test
{
    public static void main(String args[]) throws InterruptedException
    {
        System.out.println("Go to sleep");
        Thread.sleep(1000);
        System.out.println("Awake");
    }
}
