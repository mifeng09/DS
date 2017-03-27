package com.mifeng.acm.practice.base;

public class Package0_1 {
	private int c;  //背包总容量
	private int n;  //背包中物品数目
	private int []v;  //背包中每个物品的价值，一定是一一对应的
	private int []w;  //背包中每个物品的重量，一定是一一对应的
	private int [][]m;  //动态规划求解时候所使用的空间
	
	public Package0_1(){
//		c=20;n=6;
//		v=new int[]{12,45,23,14,5,27};
//		w=new int[]{2,9,8,3,7,6};
//		m=new int[n][c];
//		c=20;n=6;
		c=17;n=5;
		v=new int[]{4,5,10,11,13};
		w=new int[]{3,4,7,8,9};
		m=new int[n][c];
	}
	
	public Package0_1(int c,int n,int []v,int []w,int [][]m){
		this.c=c;this.n=n;
		this.v=v;this.w=w;
		this.m=m;
	}
	
	//自底向上求解子问题
	public void knapsack(){
		for(int i=0;i<n;i++)
			m[i][0]=0;
		for(int s=1;s<=n;s++){
			for(int i=n-s;i>=0;i--){
				for(int j=1;j<c;j++){
					if(i==n-1){
						if(j<w[i])
							m[i][j]=0;
						else if(j>=w[i])
							m[i][j]=v[i];
					}
					else{
						if(j<w[i])
							m[i][j]=m[i+1][j];
						else if(j>=w[i])
							m[i][j]=m[i+1][j]>(m[i][j-w[i]]+v[i])?m[i+1][j]:(m[i][j-w[i]]+v[i]);
					}
				}
			}
		}
	}
	//循环求解0,1向量组，0代表相应位置不装入背包，1代表装入背包
	public void traceBack(){
		for(int k=1;k<=n;k++)
			System.out.print(k+"  ");
		System.out.println();
		int j=c-1;
		for(int i=0;i<n-1;i++){
			if(m[i][j]==m[i+1][j])
				System.out.print(0+"  ");
			else{
				System.out.print(1+"  ");
				j-=w[i];
			}
		}
		if(j>=w[n-1])
			System.out.print(1);
		else 
			System.out.print(0);
	}
	
	public static void main(String[] args) {
		Package0_1 package0_1=new Package0_1();
		package0_1.knapsack();
		package0_1.traceBack();
	}


}
