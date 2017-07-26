package com.mifeng.acm.practice;

import java.util.HashMap;

public class HalfMajorDemo {

	public static void main(String[] args) {
		int[] arr = new int[]{3, 3, 9, 4, 5, 6};
		printHalfMajor(arr);
 	}
	public static void printHalfMajor(int[] arr){
		int cand = 0; int times = 0; int m = 0;
		for(int i =0; i != arr.length; i++){
			if(times == 0){
				cand = arr[i];
				times = 1;
				HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
				//HashMap<int,int> map2 = new HashMap<int,int>();
				System.out.println("次数"+ (++m));
				System.out.println();
				//System.out.println("次数"+ (m++));
			}else if(arr[i] == cand){
				times++;
			}else{
				times--;
			}
		}
		
	}

}
