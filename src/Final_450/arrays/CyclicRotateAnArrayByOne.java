package Final_450.arrays;

public class CyclicRotateAnArrayByOne {

	public static void rotate(int arr[], int n)
	{
	    int i=n-1,curr=arr[n-1];
	    while(i>0){
	        
	        arr[i]=arr[i-1];
	        i--;
	        
	    }
	    arr[0]=curr;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,3,4,5};
		rotate(arr,arr.length);
		for(Integer i : arr)
			System.out.print(i+" ");
	}

}
