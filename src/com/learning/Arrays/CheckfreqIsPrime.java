package com.learning.Arrays;
import java.util.*;
public class CheckfreqIsPrime {

        public static boolean isPrime(int n) {
            if (n <= 1) {
                return false;
            }
            int sqrt = (int) Math.sqrt(n);
            for (int i = 2; i <= sqrt; i++) {
                if (n % i == 0) {
                    return false;
                }
            }
            return true;
        }

        public static boolean checkPrimeFrequency(int[] nums) {
            Map<Integer, Integer> map = new HashMap<>();
            for (int num : nums) {
                map.put(num, map.getOrDefault(num, 0) + 1);
            }

            for (int freq : map.values()) {
                if (isPrime(freq)) {
                    return true;
                }
            }

            return false;
        }

    public static void main(String[] args) {
        int[]  arr={5,5,4,5,4,5,3,1,2,12};
        boolean res=checkPrimeFrequency(arr);
        System.out.println(res);

    }
    }


