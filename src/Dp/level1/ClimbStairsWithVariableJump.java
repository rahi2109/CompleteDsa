package Dp.level1;

import java.util.Scanner;

public class ClimbStairsWithVariableJump {

	public static int climbStairsWithVariableJump(int []jump,int str) {
		
		int res=0;
		if(str==jump.length)
			return 1;
		for(int i=1;i<jump[str]&& str+i<=jump.length;i++) {
			int childres=climbStairsWithVariableJump(jump,str+i);
			res+=childres;
		}
		return res;
				
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=10;
//		sc.nextInt();
		int jump[]=new int[n];
		int res[]={3,3,0,2,1,2,4,2,0,0};
//		for(int i=0;i<n;i++)
//			jump[i]=sc.nextInt();
		
		System.out.println(climbStairsWithVariableJump(res,n));

	}

}
