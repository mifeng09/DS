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
		// TODO Auto-generated method stub

	}
	
	@Test
	public void test(){
      
		//int[] array = new int[]{9, 7, 6, 4, 3, 1};
		int[] array = new int[]{2, 4, 1, 6, 3, 5};
		System.out.println("排序前："+ Arrays.toString(array));
		insertSort(array);
	}
	public void insertSort(int A[]){
		
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
