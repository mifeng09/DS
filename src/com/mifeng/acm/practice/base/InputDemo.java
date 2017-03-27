package com.mifeng.acm.practice.base;

import java.util.Arrays;
import java.util.Scanner;

public class InputDemo {

	public static void main(String[] args) {
		int[] A = null;
		Scanner scan = new Scanner(System.in);
		while(scan.hasNext()){
			int length = scan.nextInt();
			int[] array = new int[length];
			for(int i = 0; i<length; i++){
				array[i] = scan.nextInt();
			}
			System.out.println(Arrays.toString(array));
			A = array;
			break;
		}
		System.out.println("welcome to china");
		System.out.println("second is" + Arrays.toString(A));
	}

}
