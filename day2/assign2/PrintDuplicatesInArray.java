package day2.assign2;

public class PrintDuplicatesInArray {
	
public static void main(String[] args) {
	int []arr = {1, 3, 3, 4, 5, 4, 5};
	System.out.println("Duplicate elements in array" + arr.length);
	for(int i = 0; i<arr.length-1; i++){
			for(int j= i+1; j<arr.length; j++)
		{
			if(arr[i] == arr[j])
			{
			System.out.println(arr[i]);
			}
	
		}
	}
}

}