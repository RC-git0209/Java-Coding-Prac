import java.util.HashSet;


public class PairWithZeroSum {
	
	public static void findPairsWithZeroSum(int [] arr) {
		HashSet<Integer> seen = new HashSet<>();
		boolean foundPair = false;
		
		System.out.println("Pairs with sum equal to 0:");
		
		for (int num : arr) 
		{
			int complement = -num;
			
			if(seen.contains(complement)) {
				System.out.println("(" + complement + ", " + num + ")");
				foundPair = true;
			}
			seen.add(num);
		}
		
		if(!foundPair) {
			System.out.println("No such pairs found.");
		}
	}

	public static void main(String[] args) {
		int [] arr = {2,-3,4,3,1,-4,-2,-1,5,0};
		
		findPairsWithZeroSum(arr);
	}

}
