package com.mifeng.acm.practice;

import org.junit.Test;

public class StringParser {
	@Test
	public void test(){
		String str = "123";
		int num = parse(str);
		System.out.println("输入的字符串转换成整数表示："+ num);
		int minr = Integer.MIN_VALUE % 10;
		System.out.println("minr的值为："+ minr);
	}
	public int parse(String str){
		int result = 0;
		char[] ch = str.toCharArray();
		for(int i=0; i<ch.length; i++){
			Character s = ch[i];
			char ss = '2';
			int m = Integer.valueOf(ss);
			System.out.println("m的值为："+ m);
			int n = Integer.parseInt(s.toString());
			result += n * Math.pow(10, ch.length - i -1);
		}
		return result;
	}
	
	

}
