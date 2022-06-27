package Week2.day1;

public class ReverseString {
	public static void main(String[] args) {
		// Here is the input
		String test = "feeling good";
		int length = test.length();
		System.out.println("Length of the array " + length);
		char [] array = test.toCharArray();
				for(int i=0;i<array.length-1; i--) {
					System.out.println(array[i]);
					System.out.println(array[1]);
					boolean startsWith = test.startsWith("ch");
					System.out.println(startsWith);
				}

		// Build the logic to find the count of each
		/* Pseudo Code: 1
			a) Convert the String to character array
			b) Traverse through each character (using loop in reverse direction)
			c) Print the character (without newline -> like below
			   System.out.print(ch);
		*/

		
		
		/* Pseudo Code: 2
		a) Find the length of the string
		b) Traverse through each index from length-1 -> 0 (using loop in reverse direction)
		c) Find the character of the String using its index
		*/
	}

}
