package com.learning.strings;

import java.util.Scanner;

public class CountVows_Cons {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int VowCount=0;
        int ConsCount=0;
        String str="hello";
        for(char c:str.toCharArray()){
            if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'){
                VowCount++;
            }else{
                ConsCount++;
            }
        }

        System.out.println(VowCount);
        System.out.println(ConsCount);

    }
}
