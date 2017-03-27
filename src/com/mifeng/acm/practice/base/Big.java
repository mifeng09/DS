package com.mifeng.acm.practice.base;

import java.math.BigInteger;
import java.util.Scanner;

public class Big {

	public static void main(String[] args) {
		BigInteger a, b;
		 
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		for(int i = 1; i<= num; i++){
			System.out.println("Case "+i+":");
			a = input.nextBigInteger();
			b = input.nextBigInteger();
			System.out.println(a+ " + "+b+" = "+ (a.add(b)));
			if(i != num){
				System.out.println();
			}
		}

	}

}
