import java.util.ArrayList;
import java.util.List;

public class MissingNumber {
	public static List<Integer> findMissingNumbers(int[] arr, int start, int end) {
		List<Integer> missingNumbers = new ArrayList<>();
		
		int expected = start;
		for(int num : arr) {
			while(expected < num) {
				missingNumbers.add(expected);
				expected++;
			}
			expected = num+1;
		}
		while(expected <= end) {
			missingNumbers.add(expected);
			expected++;
		}
		
		return missingNumbers;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1, 2, 4, 6, 7, 10, 13}; //Sorted Array
		int start = 1; //Range start
		int end = 0; //= 0; // Range end
		
		List<Integer> missingNumbers = findMissingNumbers(arr, start, end);
		System.out.println("Missing numbers: " + missingNumbers);
}
}
