package com.mifeng.acm.practice;

import java.util.Arrays;

import org.junit.Test;

/**
 * 选择排序
 * @author 21405
 *
 */
public class SelectSortDemo {
	
	@Test
	public void test(){
		int[] array = new int[]{2, 4, 1, 6, 3, 5};
		//int[] array = new int[]{9, 6, 1, 5, 3, 0};
		System.out.println("排序前："+ Arrays.toString(array));
		selectSort(array);
	}
	
//	public void selectSort(int[] A){
//		for(int i = 0 ; i< A.length; i++){
//			int min = A[i];
//			int j = i+1;
//			int k = 0 ;
//			for(; j < A.length; j++ ){
//				if(min >= A[j]){
//					min = A[j];
//					k = j;
//				}
//				//if(j)
//				//A[i] = min;
//				//A[j] = A[i];
//			}
//			if(k!=0){
//				A[k] = A[i];
//				A[i] = min;
//			}
//			
//		}
//		System.out.println("排序后："+ Arrays.toString(A));
//	}
	
	public void selectSort(int[] A){
		for(int i = 0 ; i< A.length; i++){
			int min = A[i];
			int j ;
			int k = 0 ;
			for(j=i+1; j < A.length; j++ ){
				if(min >= A[j]){
					min = A[j];
					k = j;
				}
			}
			if(min != A[i]){
				A[k] = A[i];
			}
			A[i] = min;
			
			
		}
		System.out.println("排序后："+ Arrays.toString(A));
	}

}
