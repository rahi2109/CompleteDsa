package Final_450.arrays;

public class MaxAndMin {

	class pair{
		int max;
		int min;
		pair(){
			this.max=Integer.MIN_VALUE;
			this.min=Integer.MAX_VALUE;
		}
	}
	public static pair maxAndMin(int arr[]) {
		MaxAndMin mnm=new MaxAndMin();
		MaxAndMin.pair res=mnm.new pair();
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<res.min)
				res.min=arr[i];
			if(arr[i]>res.max)
				res.max=arr[i];
		}
		return res;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {3,2,1,5,4};
		MaxAndMin mnm=new MaxAndMin();
		MaxAndMin.pair res=maxAndMin(arr);
		System.out.println("min= "+res.min+" max="+ res.max);

	}

}
