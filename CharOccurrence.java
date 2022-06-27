package Week2.day1;

public class CharOccurrence {
public static void main(String[] args) {
	// Check number of occurrences of a char (eg 'e') in a String
	
				String str = "welcome to chennai";
				int length = str.length(); //				// declare and initialize a variable count to store the number of occurrences

				System.out.println("Length of the string " + (length)); //				//get the length of the array


				char[] array = str.toCharArray();{ //				// convert the string into char array

					for (int i=0; i<length; i++) //				// traverse from 0 till the array length 

					{
					System.out.println(array[i]);
					}
					boolean contains = str.contains("e"); //					// Check the char array has the particular char in it 

System.out.println(contains);
				
				
				}
				char charAt = str.charAt(2);
						{
					System.out.println(charAt);
						}

				
					// if is has increment the count
						 
					
					// print the count out of the loop
}


}
