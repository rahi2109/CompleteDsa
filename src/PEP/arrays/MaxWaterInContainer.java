package PEP.arrays;
//Q : 1. Given n non-negative integers a1, a2, ..., an. 
//2. Each represents a point at coordinate (i, ai). 
//3. 'n' vertical lines are drawn such that the two endpoints of the line i is at (i, ai) and (i, 0). 
//4. Find two lines, which, together with the x-axis forms a container, such that the container contains the most water.
//5. (Not volume because we are working with 2D so amount of water is basically Area).
//Note : that you may not slant the container.
public class MaxWaterInContainer {

	public static int maxWaterInContainer(int arr[]) {
		int i=0,j=arr.length-1;
		int max_water=0;
		while(i<j) {
			max_water=Math.max(max_water, Math.min(arr[i], arr[j])*(j-i));
			if(arr[i]<=arr[j]) {
				i++;
			}
			else
				j--;
		}
		return max_water;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1, 8, 6, 2,	5, 4, 8, 3,	7};
		System.out.println("max_water : "+ maxWaterInContainer(arr));

	}

}
