package com.mifeng.acm.practice.ms;

import java.util.Scanner;
import java.util.Stack;

public class Main {
	
	public static void main(String[] args){
		 Scanner sc = new Scanner(System.in); 
		 String str = sc.nextLine();
		 //Stack<String> stack = null;
		// char[] strArray = str.toCharArray();
		 
		 
		
	}
	public static int complete(String str){
		Stack<Character> stack = new Stack<Character>();  
		int countLeft = 0, countRight = 0;
		for(int i = 0; i< str.length(); i++){
			if("(".equals(str.charAt(i))){
				//stack.push(str.charAt(i));
				countLeft++;
			}else{
//				if(stack.isEmpty()){
//					return
//				}
//				stack.pop();
				countRight++;
			}
		}
		int offset = countRight - countLeft;
		int sum = 0;
		for(int i = 0; i<offset;i++){
			sum = sum + i;
		}
		return 3 * offset + sum;
		 
		 
	}
}
