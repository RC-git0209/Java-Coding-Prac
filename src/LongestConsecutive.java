import java.util.HashSet;
import java.util.Set;

public class LongestConsecutive {
    public int longestConsecutive(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        // Use a HashSet for O(1) lookups
        Set<Integer> numSet = new HashSet<>();
        for (int num : nums) {
            numSet.add(num);
        }

        int longestStreak = 0;

        for (int num : nums) {
            // Check if it's the start of a sequence
            if (!numSet.contains(num - 1)) {
                int currentNum = num;
                int currentStreak = 1;

                // Count consecutive numbers
                while (numSet.contains(currentNum + 1)) {
                    currentNum++;
                    currentStreak++;
                }

                longestStreak = Math.max(longestStreak, currentStreak);
            }
        }
return longestStreak;
    }      

	public static void main(String[] args) {
		LongestConsecutive solution = new LongestConsecutive();

       
        int[] number1 = {100, 4, 200, 1, 3, 2, 300, 5, 400};
        System.out.println("Longest consecutive length: " + solution.longestConsecutive(number1)); 

        
        int[] number2 = {0, 3, 7, 2, 5, 4, 6, 0, 1};
        System.out.println("Longest consecutive length: " + solution.longestConsecutive(number2)); 
	}

}
