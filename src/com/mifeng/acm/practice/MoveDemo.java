package com.mifeng.acm.practice;

public class MoveDemo {

	public static void main(String[] args) {
		int[] array = new int[]{4, 2, 1};
		System.out.println(array.toString());
		for(int i = 0; i< array.length; i++){
			if(i>=array.length){
				return ;
			}
			array[i] = array[i+1];
			System.out.println(array.toString());
		}
	}

	

}
