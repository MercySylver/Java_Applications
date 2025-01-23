import java.util.Arrays;

public class UsingArraysClass{
	public static void main(String args[]){
		int[] numbers = {6,19,2,29,1,30,8,3,12,4};
		Arrays.sort(numbers);
		
		
		int index = Arrays.binarySearch(numbers,30);
		
		System.out.printf("The index numbers of 30 is %d%n",index);
		System.out.println("===================================");
		
		int[] arr1 = {1, 6, 3};
		int[] arr2 = {1, 2, 3};
		boolean isEqual = Arrays.equals(arr1, arr2);
		
		System.out.printf("%b%n",isEqual);	
		
		//filling an arrays
		int[] myArrays = new int[5];
		
		Arrays.fill(myArrays,20);
		
		
		//copy an array
		int[] original = {1, 2, 3};
		int[] copy = Arrays.copyOf(original, 5); 
		
		
		//converting arrays to a string
		String copyArray = Arrays.toString(copy);
		
		System.out.printf("%s%n",copyArray);
		System.out.println("=================================");
		
		for(int element : numbers){
			System.out.printf("%d%n",element);
		}
		System.out.println("=================================");
		for(int component : myArrays){
			
			System.out.printf("%d%n",component);
		}			

		System.out.println("=================================");
		for(int value : copy){
			
			System.out.printf("%d%n",value);
		}		
	}
}