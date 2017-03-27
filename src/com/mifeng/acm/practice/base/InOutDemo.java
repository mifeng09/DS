package com.mifeng.acm.practice.base;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InOutDemo {

	public static void main(String[] args) {
//		int a;
//		int b;
		String c;
		char[] ch = new char[100];
		System.out.println(ch.toString());
		Scanner scan = new Scanner(System.in);
		//System.out.println(scan.nextLine());
//		while(scan.hasNext()){
//			//a = scan.next();
//			a = scan.nextInt();
//			//b = scan.nextInt();
//			c = scan.nextLine();
//			System.out.println(a + c);
		//c = scan.nextLine();
		//scan.n
		//char[] chr =c.toCharArray();	
		Object[] chr = null;
		List charList = new ArrayList();
		while(scan.hasNext()){
		//	scan.hasNextLine()
		//	scan.n
	//	while(true){
			String str = scan.next();
			String str2 = scan.next();
			String str3 = scan.next();
			String str4= scan.next();
			String str5 = scan.next();
			String str6= scan.next();
			
			System.out.println("str is :"+ str);
			System.out.println("str2 is :"+ str2);
			System.out.println("str3 is :"+ str3);
			System.out.println("str4 is :"+ str4);
			System.out.println("str5 is :"+ str5);
			System.out.println("str6 is :"+ str6);
			charList.add(str);
			//scan.close();
			//if(scan.next())
			break;
			
		}
		//scan.close();
		//chr = charList.toArray();
		System.out.println("str6 is :");
	}
	

}
