package DpStnd;

import java.util.Arrays;

public class knapsak01 {
	
	public static int knapsack(int []wt,int []val,int w,int n,int [][]dp) {
		if(n==0|| w==0)
			return 0;
		if(dp[n][w]!=-1)
			return dp[n][w];
		
		if(w-wt[n-1]>=0)
			dp[n][w]=Math.max(val[n-1]+knapsack(wt,val,w-wt[n-1],n-1,dp),knapsack(wt,val,w,n-1,dp) );
		else
			dp[n][w]=knapsack(wt,val,w,n-1,dp);
		return dp[n][w];
		
			
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int wt[]= {1,3,4,5};
		int val[]= {1,3,5,7};
		int w=5;
		int n=wt.length;
		int dp[][]=new int [n+1][w+1];
		for(int [] a:dp)
		Arrays.fill(a,-1);
		System.out.println("result :" +knapsack(wt,val,w,n,dp));
		
		for(int i=0;i<=n;i++) {
			for(int j=0;j<=w;j++)
				System.out.print(dp[i][j]+" ");
			System.out.println();
		}
			
			
	}

}
