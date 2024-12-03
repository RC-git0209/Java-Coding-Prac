import java.util.Arrays;

public class SortBinaryArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] in = {0, 1, 0, 1, 0, 0, 1, 1, 0, 1};
		int[] sortedArray = sortBinaryArray(in);
		
		System.out.println(Arrays.toString(sortedArray));
	}
	
	public static int[] sortBinaryArray(int[] in) {
		return Arrays.stream(in)
				.sorted()
				.toArray(); 
	}

}
