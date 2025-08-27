package com.learning.Arrays;

public class FreqBrute {
    public static void main(String[] args) {
        int[] arr = {4, 5, 5, 6, 7, 5, 4};
        int n = arr.length;
        boolean[] visited = new boolean[n];
        int max=0,mode=0;
        System.out.println("Element : Frequency");
        for (int i = 0; i < n; i++) {
            if (visited[i]) continue;
            int count = 1;
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                    visited[j] = true;
                }
            }
            if(count>max){
                max=count;
                mode=arr[i];
            }
            System.out.println(arr[i] + " : " + count);
        }
        System.out.println(mode);
    }
}
