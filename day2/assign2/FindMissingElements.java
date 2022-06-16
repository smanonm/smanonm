package day2.assign2;

public class FindMissingElements {
	public static void main(String[] args) {
		int[] arr = { 1, 3, 4, 7};
		int diff = arr[0]-0;
		for(int i =0; i<arr.length; i++)
		{
			if(arr[i]-i != diff)
{ while (diff < arr[i] - i)
{
    System.out.print((i + diff) + " ");
    diff++;
}
		}

	
		}
	}}
