package com.mifeng.acm.practice.base;

import java.util.Scanner;

public class ShortTime {

	public static void main(String[] args) {
		
		int[] destination = new int[2];
		int walkTime, taxiTime,minTime;
		Scanner input = new Scanner(System.in);
		//打车点为num
		int stationNumber = input.nextInt();
		int[] x = new int[stationNumber];
		int[] y = new int[stationNumber];
		System.out.println("1s");
		while(input.hasNext()){
			System.out.println("2s");
			for(int i =0; i < stationNumber; i++){
				System.out.println("t");
				x[i] = input.nextInt();
				System.out.println("d");
			}
			break;
		}
		System.out.println("sex");
		while(input.hasNext()){
			
			for(int i = 0; i< stationNumber;i++){
				y[i] = input.nextInt();
			}
//			destination[0] = input.nextInt();
//			destination[1] = input.nextInt();
//			walkTime = input.nextInt();
//			taxiTime = input.nextInt();
			
			break;
		}
		destination[0] = input.nextInt();
		destination[1] = input.nextInt();
		walkTime = input.nextInt();
		taxiTime = input.nextInt();
		int minTotalTime = getMinTime(x, y, destination, walkTime, taxiTime);
		System.out.println("\n");
		System.out.println(minTotalTime);
	}
	
	public static int getMinTime(int[]x ,int[]y, int[] destination, int walkTime, int taxiTime){
		//1、walktime
		//int totalDistance = x[x.length - 1] - x[0] + y[y.length-1] - y[0];
		
		//int totalWalkTime = totalDistance * walkTime;
		int totalWalkTime = (Math.abs(destination[0]) + Math.abs(destination[1])) * walkTime;
		//
		int minStationDistance = 0, k = 0,min = Math.abs(x[0])+Math.abs(y[0]); int totalMinTime = 0;
		int[] minStation = new int[2];
		for(int i =0; i<x.length; i++){
			
			int sum = Math.abs(x[i])+Math.abs(y[i]);
			
			if(sum <= min){
				min = sum;
				minStation[0] = x[i];
				minStation[1] = y[i];
			}
			//temp = sum;
		}
		int walkStationTime = min * walkTime;
		int taxiTime2 = (Math.abs(destination[1] - minStation[1]) + Math.abs(destination[0] - minStation[0])) *taxiTime;  
		int totalTime2 =  walkStationTime + taxiTime2;
		if(totalWalkTime < totalTime2){
			totalMinTime = totalWalkTime;
		}else{
			totalMinTime = totalTime2;
		}
		return totalMinTime;
		
	}

}
