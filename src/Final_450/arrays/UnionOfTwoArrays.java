package Final_450.arrays;
import java.util.Set;
import java.util.HashSet;
public class UnionOfTwoArrays {

	public static int union(int a[],int b[]) {
		Set<Integer> set=new HashSet<>();
		
		for(int i=0;i<a.length;i++)
			set.add(a[i]);
		for(int i=0;i<b.length;i++)
			set.add(b[i]);
		
		return set.size();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1, 2, 3, 4, 5};
		int b[]	= {	1, 2, 3,};
		System.out.println("Count of union Elements : "+ union(a,b));

	}

}
