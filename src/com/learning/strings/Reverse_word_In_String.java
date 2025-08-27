package com.learning.strings;

public class Reverse_word_In_String {

        public static String reverseWords(String s) {
            String[] words=s.split("\\s+");
            StringBuilder st=new StringBuilder();

            for(int i=words.length-1;i>=0;i--){
                st.append(words[i]);
                if(i!=0){
                    st.append(" ");
                }
            }
            /// Using CharArray
            for(String word:words){
            for(char ch : word.toCharArray()){
                System.out.print(ch+" ");
            }
            }
            /// Using CharAt() function
            for (String word : words) {
                for (int i = 0; i < word.length(); i++) {
                    char c = word.charAt(i);
                    System.out.println(c);
                }
            }
            return st.toString();
        }

        public static void main(String[] args) {
            String str="thi sis nuerredk";
            String res=reverseWords(str);
            System.out.println(res);

        }
    }

