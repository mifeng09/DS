package com.mifeng.acm.practice.base;

import java.util.Arrays;

import org.junit.Test;

public class SolutionDemo {
	
	@Test
	public void test(){
		//int[] array = new int[]{2, 7, 11, 15};
//		int[] array = new int[]{3,2,4};
//		int target = 6;
//		int[] index = twoSum(array, target);
//		System.out.println(Arrays.toString(index));
//		String a = "www";
//		//a.l
//		a.t
		
		String str = "abcabcbb";
		int len = lengthOfLongestSubstring(str);
		System.out.println(len);
	}
	
//	public int[] twoSum(int[] nums, int target) {
//        int[] index = new int[2];
//        for(int i = 0;i<nums.length - 1; i++){
//            int key = nums[i];
//            for(int j = i + 1; j<=nums.length - 1; j++){
//                int sum = key + nums[j];
//                if(sum == target){
//                    index[1] = j;
//                    index[0] = i;
//                    break;
//                }
//               
//            }
//        }
//        return index;
//    }
	
	public int lengthOfLongestSubstring(String s) {
        int start = 0; // current start point of substring without dup  
        int maxlen = 0; // max length of substring found  
        int [] table = new int[256] ; // hash table for index of each char appeared  
        for (int i = 0;i < 256;i++) table[i] = -1; // if char not present, index is -1  
        char[] str = s.toCharArray();
        int len = str.length;  
        for (int i = 0;i < len;i++) { 
        	int index = str[i];
            if (table[index] != -1) {  
                while (start <= table[index]) table[str[start++]] = -1;  
            }  
            if (i - start + 1 > maxlen) maxlen = i - start + 1;  
            table[index] = i;  
        }  
        return maxlen;  
    }
}
