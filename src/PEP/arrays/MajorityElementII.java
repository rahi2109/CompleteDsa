package PEP.arrays;

import java.util.ArrayList;

public class MajorityElementII {

	public static ArrayList<Integer> majorityElementII(int arr[]){
		
		int v1=arr[0];
		int v2=arr[1];
		int c1=1;
		int c2=1;
		for(int i=2;i<arr.length;i++) {
			if(arr[i]==v1)
				c1++;
			else if(arr[i]==v2)
				c2++;
			else {
				if(c1==0) {
					v1=arr[i];
					c1=1;
				}
				else if(c2==0) {
					v2=arr[i];
					c2=1;
				}
				else {
					c1--;
					c2--;
				}
			}
		}
		
		ArrayList<Integer>list=new ArrayList<>();
		c1=0;c2=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==v1)
				c1++;
			if(arr[i]==v2)
				c2++;
			
		}
		if(c1>arr.length/3)
			list.add(v1);
		if(c2>arr.length/3)
			list.add(v2);
		return list;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {3,2,3};
		System.out.println("result : "+majorityElementII(arr));

	}

}
