package com.mifeng.acm.practice.base;

public class ReplaceDemo {
	public static void main(String[] args){
		String str = "abc";
		
		String str2 = str.replace("a", "a");
		System.out.println(str2);
		if(str == str2){
			System.out.println("==");
		}else{
			System.out.println("!=");
		}
		if(str.equals(str2)){
			System.out.println("equals");
		}else{
			System.out.println("not equals");
		}
		String s1 = "abd";
		String s2 = "abd";
		if(s1 == s2){
			System.out.println("s1==s2");
		}else{
			System.out.println("s1!=s2");
		}
		if(s1.equals(s2)){
			System.out.println("s1 equals s2");
		}else{
			System.out.println("s1 not equals s2");
		}
		System.out.println("---------------------");
		String s3 = "abr";
		String s4 = new String("abr");
		if(s3 == s4){
			System.out.println("s3==s4");
		}else{
			System.out.println("s3!=s4");
		}
		if(s3.equals(s4)){
			System.out.println("s3 equals s4");
		}else{
			System.out.println("s3 not equals s4");
		}
	}

}
