package com.mifeng.acm.practice.base;

import java.math.BigInteger;
import java.util.Scanner;

public class plusDEmo {
	
//	public static void main(String[] args){
//		int point = 1;
//		System.out.println("input numbers");
//		Scanner input = new Scanner(System.in);
//		int inputNumber = input.nextInt();
////		while(input.hasNextInt()){
////			inputNumber = input.nextInt();
////			break;
////		}
//		while(input.hasNextInt()){
//			if(point > inputNumber){
//				break;
//			}
//			int paramA = input.nextInt();
//			int paramB = input.nextInt();
//			 System.out.format("%d + %d = "+(paramA+paramB), paramA, paramB);
//			 point++;
//		}
//	}
	
	public static void main(String[] args) {
        BigInteger a, b;
        int T;
        Scanner in = new Scanner(System.in);
        T = in.nextInt();
        for (int i = 1; i <= T; ++i) {
            System.out.println("Case" + " " + i + ":");
            a = in.nextBigInteger();
            b = in.nextBigInteger();
            if (i < T) {
                System.out.println(a + " + " + b + " = " + a.add(b) );
                System.out.println();
            } else {
                System.out.println(a + " + " + b + " = " + a.add(b));
            }
        }
    }
}
