package finalExam;

import java.util.Arrays;

public class RandomNumber {

	public static void main(String[] args) {
	
		int numbers [] = {2,6,20,4};
		
		int largest = numbers[0];
		int smallest = numbers[0];
		
		for(int i=1; i<numbers.length; i=i+1) {
			if(numbers[i]>largest) {
				largest = numbers[i];
			}
			else if (numbers[i]<smallest) {
				smallest = numbers[i];
			}
		}
System.out.println("List of array is:" + Arrays.toString(numbers));
System.out.println("Largest Number is:" + largest);
System.out.println("Smallest Number is:" + smallest);
		
		
	}

}
