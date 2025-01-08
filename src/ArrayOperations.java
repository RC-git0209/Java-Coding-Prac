import java.util.Arrays;

public class ArrayOperations {

	public static void main(String[] args) {
		int[] arr = {2,5,3,6,7,11,9};
		
		System.out.println("Array before sorting: " + Arrays.toString(arr));
		
		performOperations(arr);
		
		Arrays.sort(arr);
		
		System.out.println("Array after sorting: " + Arrays.toString(arr));
		
		performOperations(arr);

	}
	
	public static void performOperations(int[] arr) 
	{
		int min = Arrays.stream(arr).min().orElseThrow();
		int max = Arrays.stream(arr).max().orElseThrow();
		int sum = Arrays.stream(arr).sum();
		double avg = Arrays.stream(arr).average().orElseThrow();
		
		System.out.println("min: " + min);
		System.out.println("max: " + max);
		System.out.println("sum: " + sum);
		System.out.println("avg: " + avg);
	}

}
