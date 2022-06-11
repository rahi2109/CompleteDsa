package PEP.arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class MajorityElementGeneral {
	
	public static ArrayList<Integer> majorityElementGeneral(int [] arr,int k){
		Map<Integer,Integer>map=new HashMap<>();
		for(int i=0;i<arr.length;i++) {
			if(map.get(arr[i])!=null) {
				int val=map.get(arr[i]);
				map.put(arr[i], val+1);
			}
			else {
				map.put(arr[i],1);
			}
		}
		ArrayList<Integer>list=new ArrayList<Integer>();
		for(Integer key : map.keySet()) {
			if(map.get(key)>arr.length/k)
				list.add(key);
		}
		Collections.sort(list);
		return list;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {3, 1, 2, 2, 1, 2, 3, 3};
		int k=4;
		System.out.println("Result : "+ majorityElementGeneral(arr, k));

	}

}
