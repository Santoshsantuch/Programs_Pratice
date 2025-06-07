package com.learning.sorting;

class QuickSort {

    static void quickSort(int[] arr,int low, int high){
        if(low<high){
            int pivotindex=partition(arr, low,high);
            quickSort(arr,low,pivotindex-1);
            quickSort(arr,pivotindex,high);
        }

    }
    static int partition(int[] arr,int low, int high){
        int pivot=arr[high];
        int i=low-1;
        for(int j=low;j<high;j++)
            if(arr[j]<=pivot){
                i++;
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        int temp=arr[i+1];
        arr[i+1]=arr[high];
        arr[high]=temp;
        return i+1;
    }


    public static void main(String[] args) {
        int[] data = {1, 7, 4, 1, 10, 9, -2};
        System.out.println("Unsorted Array");
        printArray(data);
        int size = data.length;
        quickSort(data, 0, size - 1);
        System.out.println("Sorted Array in Ascending Order: ");
        printArray(data);
    }

    static void printArray(int[] array) {
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}