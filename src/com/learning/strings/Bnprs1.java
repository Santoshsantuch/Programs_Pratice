package com.learning.strings;

public class Bnprs1 {
    private static void seperate(String str){

        StringBuilder sb=new StringBuilder();
        int cnt=0;
            for(char c: str.toCharArray()){
                if(Character.isDigit(c)) {
                    sb.append(c);
                    cnt++;
                    if (cnt % 3 == 0) {
                        sb.append(" ");
                    }
                }
            }
        System.out.println(sb.toString().trim());
    }
    public static void main(String[] args) {
        String str="123abc 987cdes";
        seperate(str);
    }
}
