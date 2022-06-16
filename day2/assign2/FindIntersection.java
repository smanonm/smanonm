package day2.assign2;

public class FindIntersection {
public static void main(String[] args) {
		
		// Program to find intersection of two arrays
		
		int ara[]= {3,2,11,4,6,7};	//defined ar1
		int arb[]= {1,2,8,4,9,7};	//defined ar2
		for (int i=0;i<ara.length;i++)	//iterate from i=0 to ar1.length
		{
		for(int j=0;j<arb.length;j++) {	//iterate from j=0 to ar2.length
			if(ara[i]==arb[j]) {		//check condition when both array elements are equal
				System.out.print(ara[i] + " ");	// print the intersection values
			}
		}
		}
	}

}
