import java.util.ArrayList;
import java.util.List;

public class PairsWithDifference {

	public static void main(String[] args) {
		int[] arr = {4,2,6,1,6,7,-1};
		int k = 2;
		
		//Find all pairs with difference equal to k
		List<List<Integer>> result = findPairsWithDifference(arr, k);
		
		// Print the result
		System.out.println(result);

	}
	
	public static List<List<Integer>> findPairsWithDifference(int[] arr, int k) 
	{
		List<List<Integer>> pairs = new ArrayList<>();
		
		//Iterate over all pairs in the array
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr.length; j++) {
				
				//Check if the difference is equal to k
				if(arr[i] - arr[j] == k) {
					List<Integer> pair = new ArrayList<>();
					pair.add(arr[i]);
					pair.add(arr[j]);
					pairs.add(pair);
				}
			}
		}
		
		return pairs;
	}

}
