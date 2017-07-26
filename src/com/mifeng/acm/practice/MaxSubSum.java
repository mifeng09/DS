package com.mifeng.acm.practice;

import java.util.Arrays;

import org.junit.Test;

/**
 * 给定一个数组，求该数组的最大子数组和，并给出子数组的区间
 * @author 21405
 *
 */
public class MaxSubSum {
	@Test
	public void test(){
		//int[] array = new int[]{-2,8,1,-3,9};
		int[] array = new int[]{-2,11,-4};
		//int[] array = new int[]{-1,7,-6,4};
		//int result = maxSubSum(array, 0);
//		int result2 = maxSubSum2(array);
//		System.out.println("Result2 is: "+ result2);
		//方法3
//		int result3 = maxSubSum3(array, 0, array.length -1);
//		System.out.println("Result3 is: "+ result3);
		int result4 = maxSubSum4(array);
		System.out.println("Result4 is: "+ result4);
		int result5 = maxSubSum5(array);
		System.out.println("Result5 is: "+ result5);
	}
	
	public int maxSubSum(int[] array, int radix){
		int result = 0;
		int[] subArray;
		if(array.length == 0){
			return 0;
		}
		
		for(int i = radix; i<array.length; i++ ){
			if(array[i] >= 0){
				//return maxSubSum(array.)
				/*
				 * 到此步中的数组复制中出现了问题
				 */
				//result = maxSubSum(System.arraycopy(array, radix, subArray, 0, array.length - 1 -radix))
			}
		}
		return result;
	}
	public int maxSubSum2(int[] array){
		int sum = 0; 
		for(int i = 0; i<array.length; i++){
			if(array[i]<0){
				array[i] = 0;
			}
			sum = sum + array[i];
		}
		return sum;
	}
	/*
	 * 方法3采用分治法
	 */
	public int maxSubSum3(int[] array, int left, int right){
		int sum = 0;
		if(left==right){
			if(array[left] > 0){
				return array[left];
			}else{
				return 0;
			}
			//return array[left] > 0 ? array[left] : 0;
		}else{
			//int temp = 0;
			int middle = (left + right) / 2;
			int leftMaxSum = maxSubSum3(array, left, middle);
			int rightMaxSum = maxSubSum3(array, middle+1, right);
			int s1 = 0;
			int lefts = 0;
			for(int k=middle;k>=0;k--){
				lefts = lefts + array[k];
				if(lefts>s1){
					s1 = lefts;
				}
			}
			int s2 = 0;
			int rights = 0;
			for(int k = middle+1;k<=right;k++){
				rights = rights + array[k];
				if(rights > s2){
					s2 = rights;
				}
			}
			sum = s1 + s2;
			//sum = sum<leftMaxSum
			if(sum < leftMaxSum){
				sum = leftMaxSum;
			}
			if(sum < rightMaxSum){
				sum = rightMaxSum;
			}
			//return Math.max(leftMaxSum, rightMaxSum);
		}
		System.out.println("left is "+ left);
		System.out.println("right is "+ right);
		return sum;
	}
	
	public int maxSubSum4(int[] array){
		int sum = 0; int max = Integer.MIN_VALUE;
		final int p1 = 0, p2 = 0; int[] temp = new int[20];int k = 0;
		//for()
		for(int i = 0; i<array.length; i++){
			sum = sum + array[i];
			k =i;
			if(sum >0)
//			if(array[i]<0){
//				array[i] = 0;
//			}
			if(max <= sum){
				//int cur = i;
				//int temp =cur;
				temp[k++] = i;
				//i =k
				System.out.println("i is "+ i);
			}
			max = Math.max(max, sum);
			//if()
			sum = sum <0 ? 0:sum;
			//temp.l
		}
		System.out.println(k);
		System.out.println(Arrays.toString(temp));
		//System.out.println(max + " "+ temp[0]+" "+temp[k+1]+"\n");
		System.out.println(max + " "+ temp[1]+" "+temp[k-1]+"\n");
		return max;
	}
	/**
	 * 动态规划法
	 * 设b[i]表示a[0...i]的和
	 * @param array
	 * @return
	 */
	public int maxSubSum5(int[] array){
		int a[] = new int[array.length];
		int b = 0; int max = 0; //int temp = 0;
		for(int i =0; i< array.length; i++){
			b = b + array[i];
			if(b < 0){
				if(a[i] < 0){
					max = 0;
				}else
					max = a[i];
				//max = array[i];
			}else{
				if(a[i] < 0){
					max = b;
				}else{
					max = b + a[i];
				}
				//max = temp + array[i];
			}
		    //temp = k;
			
		}
		return max;
	}
}

