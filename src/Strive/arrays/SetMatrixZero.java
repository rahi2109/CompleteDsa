package Strive.arrays;

import java.util.Arrays;

public class SetMatrixZero {

	public static void setMatrixZero(int [][] arr) {
		int m=arr.length;
		int n=arr[0].length;
		int rows[]=new int [m];
		int cols[]=new int[n];
		Arrays.fill(rows, -1);
		Arrays.fill(cols, -1);
		for(int i=0;i<m;i++)
			for(int j=0;j<n;j++)
				if(arr[i][j]==0) {
					rows[i]=0;
					cols[j]=0;
				}
		for(int i=0;i<m;i++)
			for(int j=0;j<n;j++)
				if(rows[i]==0 || cols[j]==0) {
					arr[i][j]=0;
					
				}
	

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][]= {{1,1,1},{1,0,1},{1,1,1}};
		
		setMatrixZero(arr);
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[0].length;j++)
				System.out.print(arr[i][j]+" ");
			System.out.println();
		}

	}

}
