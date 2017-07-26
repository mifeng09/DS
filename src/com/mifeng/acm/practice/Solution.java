package com.mifeng.acm.practice;

import java.util.Arrays;
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);  
	        int testNum = sc.nextInt();  
	        for(int i=0 ;i<testNum ;i++){  
	            int n = sc.nextInt();  
	            int[]a = new int[n];  
	            for(int j=0 ;j<n ;j++){  
	                a[j] = sc.nextInt();  
	            }  
	            System.out.printf("Case %d:\n",i+1);  
	         // int result = maxSubSum4(a); 
	          maxSubSum4(a);  
	        //  System.out.println(result);
	        if(i!=testNum-1){  
	            System.out.println();     
	        }  
	        }  
	}
	public static void  maxSubSum4(int[] array){
		int sum = 0; int max = Integer.MIN_VALUE;
	  int[] temp = new int[1001];int k = 0;
		for(int i = 0; i<array.length; i++){
			sum = sum + array[i];
			//if(sum >0)
			if(max <= sum){
				temp[k++] = i;
			}
			max = Math.max(max, sum);
			sum = sum <0 ? 0:sum;
			
		}
		System.out.println(Arrays.toString(temp));
		System.out.println(max + " "+ temp[0]+" "+temp[k]+"\n");
		//return max;
	}

}
