import java.util.*;

public class FindDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] nums = {4, 3, 2, 7, 8, 2, 3, 1, 4};
		
		List<Integer> duplicate = findDuplicates(nums);
		
		System.out.println("Duplicates: " + duplicate);
	}
	
	public static List<Integer> findDuplicates(int[] nums) {
		Set<Integer> seen = new HashSet<>();
		Set<Integer> duplicate = new HashSet<>();
		
		for(int num : nums) {
			if(!seen.add(num)) {
				duplicate.add(num);
			}
		}
		return new ArrayList<>(duplicate);
	}

}
