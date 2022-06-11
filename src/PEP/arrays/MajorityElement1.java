package PEP.arrays;

public class MajorityElement1 {

	public static void majorityElmentI(int arr[]) {
		int val = arr[0];
		int count = 1;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == val)
				count++;
			else {
				if (count == 0) {
					val = arr[i];
					count = 1;
				} else {
					count--;
				}
			}
		}
		count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == val)
				count++;
		}
		if (count > arr.length / 2)
			System.out.println(val);
		else
			System.out.println("No Majority Element exist");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {2,2,1,1,1,2,2};
		
		majorityElmentI(arr);
	}

}
