package com.mifeng.acm.practice;

import java.util.Scanner;

import org.junit.Test;

/**
 * 熟悉递归代码实现
 * @author 21405
 *
 */
public class RecursiveDemo {
	@Test
	public void test(){
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int result = factorial(n);
		System.out.println(result);
	}
	public int factorial(int n){
		if(n == 0){
			return 1;
		}else{
		//	factorial(n) = n * factorial(n-1);
			int result = n * factorial(n - 1);
			return result;
		}
	}

}
