package com.mifeng.acm.practice.base;

import java.util.Arrays;
import java.util.Scanner;
/**
 * 构造多行字符串
 * @author 21405
 *
 */
public class LineDemo {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int lineNumber = input.nextInt();
		String[] strArray = new String[lineNumber];
		//while(input.hasNextLine()){
		while(input.hasNext()){
			for(int i=0;i<lineNumber;i++){
				strArray[i] = input.nextLine();
			}
			//String str = input.nextLine();
			break;
		}
		System.out.println(Arrays.toString(strArray));
	}

}
