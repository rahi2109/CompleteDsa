package Dp.level1;

import java.util.Arrays;
import java.util.Scanner;

public class ClimbStairs {

	public static int climbStairs(int n,int []arr) {
		if(n==0)
			return 1;
		if(n<0)
			return 0;
		if(arr[n]!=-1)
			return arr[n];
		int path1=climbStairs(n-1,arr);
		int path2=climbStairs(n-2,arr);
		int path3=climbStairs(n-3,arr);
		
		arr[n]= path1+path2+path3;
		return path1+path2+path3;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int [n+1];
		Arrays.fill(arr, -1);
		System.out.println(climbStairs(n,arr));

	}

}
