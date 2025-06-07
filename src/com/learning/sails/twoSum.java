package com.learning.sails;

import java.util.HashMap;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int a = nums[i];
            int more = target - a;
            if (map.containsKey(more)) {
                return new int[]{map.get(more), i};

            }
            map.put(a, i);
        }
        return new int[]{};
    }
}
//for(int i=0;i<nums.length-1;i++)
//    {
//      for(int j=i+1;j<nums.length;j++)
//       {
//         if(nums[i]+nums[j]==target){
//             return new int[]{i,j};
//         }
//       }
//     }
//     return new int[]{};
