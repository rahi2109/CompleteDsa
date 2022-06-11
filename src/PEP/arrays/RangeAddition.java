package PEP.arrays;


//Q . 1. Assume you have an array of length 'n' initialized with all 0's and are given 'q' queries to update.
//2. Each query is represented as a triplet: [startIndex, endIndex, inc] which increments each element of subarray A[startIndex ... endIndex] (startIndex and endIndex inclusive) with inc.
//3. Return the modified array after all 'q' queries were executed.

public class RangeAddition {
	public static int[] rangeAddition(int length,int arr[][]) {
		int res[]=new int [length];
		for(int i=0;i<arr.length;i++) {
			int si=arr[i][0];
			int ei=arr[i][1];
			int val=arr[i][2];
			
			res[si]+=val;
			if(ei+1<length)
				res[ei+1]+=-val;
			
		}
		for(int i=1;i<length;i++)
			res[i]=res[i]+res[i-1];
		
		return res;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][]= {
				{2, 6, 4},
				{0, 5, 3},
				{1, 4, -2},
				{6, 9, 1}
		};
		int len=12;
		int res[]=rangeAddition(len, arr);
		for(Integer i : res)
			System.out.print(i+" ");

	}

}
