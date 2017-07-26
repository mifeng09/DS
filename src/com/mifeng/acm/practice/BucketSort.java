package com.mifeng.acm.practice;

import java.util.Arrays;

public class BucketSort {

	public static void main(String[] args) {

        int[] arr = new int[]{};
		long startTime = System.nanoTime();
		bucketSort(arr);
		System.out.println("程序运行时间："+(System.nanoTime() - startTime)+"ns");
	}
	public static void bucketSort(int[] arr){
		int[] a = new int[200];
		for(int i = 0; i<arr.length; i++){
			a[arr[i]] += 1;
		}
		System.out.println(Arrays.toString(a));
		for(int i = 0; i<a.length; i++){
			if(a[i] !=0){
				for(int j = 0; j<a[i]; j++)
				System.out.println(i);
			}
		}
	}

}
