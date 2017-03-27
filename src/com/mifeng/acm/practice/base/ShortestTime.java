package com.mifeng.acm.practice.base;

import java.util.Arrays;
import java.util.Scanner;
/**
 * 实现m*n矩阵
 * @author 21405
 *
 */
public class ShortestTime {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//int length = input.nextInt();
		//String[] stringArray = new String[length];
		//int[] array = new int
		int m = input.nextInt();
		int n = input.nextInt();
		int[][] matrix = new int[m][n];
		int[] array = new int[2];
		//while(input.hasNextLine()){
		while(input.hasNext()){
			for(int i =0; i<m; i++){
				for(int j=0;j<n;j++){

					matrix[i][j] =  input.nextInt();
				}
				
			}
			break;
		}
		System.out.println(Arrays.toString(matrix));
	}

}
