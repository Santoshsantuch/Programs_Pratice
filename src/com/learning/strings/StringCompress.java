package com.learning.strings;

public class StringCompress {
    private static String compress(String str){
        StringBuilder sb = new StringBuilder();
        int i=0;
        while(i<str.length()){
            char ch = str.charAt(i);
            int count=0;
            while(i<str.length()&& str.charAt(i)==ch){
                i++;
                count++;
            }
            sb.append(ch).append(count);
        }
    return sb.toString();

    }
    public static void main(String[] args) {
        String str="aabbccc";
        String res=compress(str);
        System.out.println(res);
    }
}
