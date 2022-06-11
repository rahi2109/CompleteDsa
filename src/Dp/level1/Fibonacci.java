package Dp.level1;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Fibonacci {
	public static int fibonacci(int n,int qb[]) {
		if(n==0||n==1)
			return n;
		if(qb[n]!=-1)
			return qb[n];
		int fib1=fibonacci(n-1,qb);
		int fib2=fibonacci(n-2,qb);
		qb[n]=fib1+fib2;
		
		return fib1+fib2;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int [n+1];
		Arrays.fill(arr, -1);
		
		System.out.println(fibonacci(n,arr));

	}

}
