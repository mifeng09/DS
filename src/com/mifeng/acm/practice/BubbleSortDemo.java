package com.mifeng.acm.practice;

import java.util.Arrays;

import org.junit.Test;

/**
 * 冒泡排序
 * @author 21405
 *
 */
public class BubbleSortDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	@Test
	public void test(){
		//int[] array = new int[]{2, 4, 1, 6, 3, 5};
		int[] array = new int[]{9, 7, 6, 4, 3, 1};
		System.out.println("排序前："+ Arrays.toString(array));
		bubbleSort(array);
		
	}
	/**
	 * 比较A[1]和A[2] 2, 4, 1, 6, 3, 5
	 * 比较A[2]和A[3] 2, 1, 4, 6, 3, 5
	 * 比较 A[3]和A[4] ，不变
	 * 比较A[4]和A[5] 2, 1, 4,3,6,5
	 * 比较A[5]和A【6】 2， 1， 4,3,5,6
	 * @param A
	 */
	public void bubbleSort(int[] A){
		
	   for(int i = A.length - 1; i>=1; i--)
		for(int j =0; j<i;j++){
			if(A[j]>A[j+1]){
				int temp = A[j+1];
				A[j+1] = A[j];
				A[j] = temp;
			}
		}
		//bubbleSort()
	   System.out.println("排序后："+ Arrays.toString(A));
	}
	

}
