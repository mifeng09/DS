package com.mifeng.acm.practice.foursection;

public class FourSection {
	public static boolean isFourSection(int[] array, int size){
		int head =0;
		int medium = 0;
		int tail = 0;
		long [] sum = new long[size];
		
		/**
		 * 求和数组
		 */
		sum[0] = array[0];
		for(int i = 1; i<array.length; i++)
			sum[i] = sum[i-1] + array[i];
		
		/**
		 * 求四均分
		 */
		long avg = sum[size-1]/4;
		
		/**
		 * 求第一个位置的向左的最大值
		 * 
		 */
		for(int i = 0; i<array.length; i++){
			if(sum[i] > avg){
				head = i+1;
				break;
			}
		}
		
		/**
		 * 求得第三个位置的向右最大值
		 */
		for(int i = array.length-1; i>=0; i--){
			if(sum[array.length -1] -sum[i] >avg){
				tail = i;
				break;
			}
		}
		
		/**
		 * 判断medium是否存在
		 */
		while(true){
			if(head < 1)
				return false;
			if(tail > array.length -2)
				return false;
			long sum1 = sum[head -1];
			long sum4 = sum[array.length -1] -sum[tail];
			if(sum1 > sum4){
				head = head - 1;
			}
			if(head < 0){
				return false;
			}else if(sum1 < sum4){
				tail = tail + 1;
				if(tail > array.length -1)
					return false;
			}else{
				for(int i = head +1; i<=tail -3; i++){
					long sum2 = sum[i] - sum[head];
					long sum3 = sum[tail -1] - sum[i+1];
					if((sum2 == sum3) && (sum2 == sum1)){
						medium = i+1;
						return true;
					}
				}
			}
			
		}
	}
	
	public static void main(String[] args){
//		int [] array = new int[10];
//		for(int i =0; i<10; i++){
//			array[i] = (int) (Math.random() * 10);
//		}
		int[] array={1,1,1,1,10,1,3,1,1,2,1,5,2,2};
		//int[] array = {2,5,1,1,1,1,4,1,7,3,7};
		boolean flag = FourSection.isFourSection(array, array.length);
		if(flag)
			System.out.println("array hava four :true");
		else
			System.out.println("do not have :false");
	}
	

}
