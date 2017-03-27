package com.mifeng.acm.practice.base;

import java.util.Scanner;
//
//public class Main {
//	
//	public static void main(String[] args){
//		int a = 0, b = 0;
//		int sum = sum(a, b);
////		Scanner input = new Scanner(System.in);
////		while(input.hasNextInt()){
////			a = input.nextInt();
////			b = input.nextInt();
////			System.out.println(a + b);
////		}
//		System.out.println(sum);
//	}
//	
//	static int sum(int a, int b){
//		return a + b;
//	}
//}


import java.util.Scanner;  

public class Main {  
    public static void main(String[] args) {  
        int a, b, sum = 0;  
        
        Scanner inScanner = new Scanner(System.in);  
        while (inScanner.hasNextInt()) {  
            a = inScanner.nextInt();  
            b = inScanner.nextInt();  
//           for(int i=0; i<=a;i++ ){
//        	   sum = sum + i;
//           }
           //System.out.println(sum+"\r\n");
          // System.out.println(sum + "\n");
          // sum = 0;
            //System.out.println("a + b =" + a+b, "%d%d");
            System.out.format("%d + %d = "+(a+b), a, b);
        }  
    }  
}  

//import java.util.Scanner;
//
//public class Main {
//	
//	public static void main(String[] args){
//		int a = 0, b = 0;
//		int sum = sum(a, b);
//
//		System.out.println(sum);
//	}
//	
//	static int sum(int a, int b){
//		return a + b;
//	}
//}