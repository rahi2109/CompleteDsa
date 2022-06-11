package DpStnd;

import java.util.Arrays;

public class SubsetSum_Knap {

	public static int subsetSum(int []arr,int sum,int n, int [][]dp) {
		if(sum==0)
			return 1;
		if(n==0)
			return 0;
		
		if(dp[n][sum]!=-1)
			return dp[n][sum];
		if(arr[n-1]<=sum) {
			if(subsetSum(arr,sum-arr[n-1],n-1,dp)!=0||subsetSum(arr,sum,n-1,dp)!=0)
				dp[n][sum]=1;
			else
				dp[n][sum]=0;
			return dp[n][sum];
		}
		else
		{
			dp[n][sum]=subsetSum(arr,sum,n-1,dp);
					return dp[n][sum];
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]={3, 34, 4, 12, 5, 2};
		int sum=9;
		int dp[][]=new int[arr.length+1][sum+1];
		for(int [] a: dp)
			Arrays.fill(a, -1);
		if(subsetSum(arr,sum,arr.length,dp)==1)
			System.out.println(true);
		else
			System.out.println(false);

	}

}
