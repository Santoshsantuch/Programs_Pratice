package com.learning.strings;

import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;

public class LongestCommonSubstring {

    private static String find(String str1,String str2,String str3){
        int n=str1.length();
        HashSet<String> set=new HashSet<>();
        for(int i=0;i<n;i++){
            for(int j=i+1;j<=n;j++){
                String sub=str1.substring(i,j);
                if(str2.contains(sub)&&str3.contains(sub)){
                    set.add(sub);
                }
            }
        }
       String largesub="";
        for(String str:set){
            if(str.length()>largesub.length()){
                largesub=str;
            }
        }

        return largesub;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str1=sc.nextLine();
        String str2=sc.nextLine();
        String str3=sc.nextLine();
        String res=find(str1,str2,str3);
        System.out.println(res);
    }
}
