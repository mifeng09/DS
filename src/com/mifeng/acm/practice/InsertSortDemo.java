package com.mifeng.acm.practice;

import java.util.Arrays;

import org.junit.Test;

/**
 * 直接插入排序
 * @author 21405
 *
 */
public class InsertSortDemo {

	public static void main(String[] args) {
		long startTime = System.nanoTime();
		//bucketSort(arr);
		System.out.println("程序运行时间："+(System.nanoTime() - startTime)+"ns");
		//int[] array = new int[]{9, 7, 6, 4, 3, 1};
		//int[] array = new int[]{2, 4, 1, 6, 3, 5};
		int[] array = new int[]{4,2,7,5,9,0,9,2};
		System.out.println("排序前："+ Arrays.toString(array));
		insertSort(array);
		System.out.println("程序运行时间："+(System.nanoTime() - startTime)+"ns");
	}
	
	@Test
	public void test(){
		long startTime = System.nanoTime();
		//bucketSort(arr);
		System.out.println("程序运行时间："+(System.nanoTime() - startTime)+"ns");
		//int[] array = new int[]{9, 7, 6, 4, 3, 1};
		//int[] array = new int[]{2, 4, 1, 6, 3, 5};
		int[] array = new int[]{4,2,7,5,9,0,9,2};
		System.out.println("排序前："+ Arrays.toString(array));
		insertSort(array);
		System.out.println("程序运行时间："+(System.nanoTime() - startTime)+"ns");
	}
	public static void insertSort(int A[]){
		
		for(int i = 1; i< A.length; i++){
			int j = i-1;
			int key = A[i];
			while(j >= 0 && key <= A[j]){
				A[j+1] = A[j];
				j = j - 1;
			}
			A[j+1] = key;
		}
		System.out.println(Arrays.toString(A));
	}

}
