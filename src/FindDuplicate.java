import java.util.*;
import java.util.stream.Collectors;

public class FindDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] nums = {4, 3, 2, 7, 8, 2, 3, 1};
		
		List<Integer> duplicates = findDuplicates(nums);
		
		System.out.println("Duplicates: " + duplicates);
	}
	
	public static List<Integer> findDuplicates(int[] nums) {
		Set<Integer> seen = new HashSet<>();
		Set<Integer> duplicates = new HashSet<>();
		
		for(int num : nums) {
			if(!seen.add(num)) {
				duplicates.add(num);
			}
		}
		return new ArrayList<>(duplicates);
	}

}
