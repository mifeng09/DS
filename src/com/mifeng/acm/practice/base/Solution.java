package com.mifeng.acm.practice.base;

import org.junit.Test;

public class Solution {
	
	@Test
	public void test(){
		int n = 4;
		if(isPowerofTwo(n))
			System.out.println("true");
		else
		   System.out.println("false");
	}
	public boolean isPowerofTwo(int n){
		//return (n>0) &&  (!(n & (n-1)));
		//Integer.toBinaryString(i)
		//Integer.toBinaryString(n)
		//boolean a = (n>0) &&(!(n & (n-1)));
//		int c = n & (n-1);
//		boolean d = !c;
//		boolean b = (n>0) & (!(n & (n-1)))
		if(n <= 0){
			return false;
		}
		n&=n-1;
	    return n==0 ;
	}

}
