package com.mifeng.acm.practice;

import java.util.Arrays;

import org.junit.Test;

public class StringReplaceDemo {
    @Test
	public void test(){
//		String str = "123abc";
//		String from = "abc";
//		String to = "4567";
//		String str = "123abcabc";
//		String from = "abc";
//		String to = "X";
		String str = "123";
		String from = "abc";
		String to = "456";
		String result = replace(str, from, to);
		System.out.println("替换后："+result.toString());
	}
    public String replace(String str, String from, String to){
    	char[] chFrom = from.toCharArray();
    	char[] chSrc = str.toCharArray();
    	char[] chTo = to.toCharArray();
    	//1、首先判断字符串from是不是字符串str的子字符串
//    	if(from.length() < to.length()){
//    		//char[] chNew = new char[str.length()+to.length()];
//    	}else{
//    		
//    	}
    	int pos = str.indexOf(from);
    	if(pos!=-1){
    		char[] chNew = new char[pos+to.length()];
    		System.arraycopy(chSrc, 0, chNew, 0, pos);
    		System.arraycopy(chTo, 0, chNew, pos, chTo.length);
    		System.out.println(Arrays.toString(chNew));
    		return Arrays.toString(chNew);
    	}else{
    		return Arrays.toString(chSrc);
    	}
    	
    	
//    	if(pos!=-1){
//    		
//    		for(int i =0; i<chFrom.length; i++){
//    			
//    			chSrc[pos++] = chFrom[i];
//    			
//    		}
//    	}
    	
    }
}
