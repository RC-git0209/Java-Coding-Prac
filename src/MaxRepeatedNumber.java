import java.util.Arrays;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.*;

public class MaxRepeatedNumber {

	public static void main(String[] args) {
		int[] input = {2, 3, 4, 2, 3, 4, 1, 2};
		Optional<Integer> maxRepeatedNumber = findMaxRepeatedNumber(input);
		
		maxRepeatedNumber.ifPresentOrElse(
				num -> System.out.println("Max repeated number is: " + num),
				() -> System.out.println("No numbers found.")
				);
}
	
public static Optional<Integer> findMaxRepeatedNumber(int[] input) {
	if (input == null || input.length == 0) {
		return Optional.empty();
		}
	
	Map<Integer, Long> frequencyMap = Arrays.stream(input)
			.boxed()
			.collect(Collectors.groupingBy(num -> num, Collectors.counting()));
	
	return frequencyMap.entrySet()
			.stream()
			.max(Map.Entry.comparingByValue())
			.map(Map.Entry::getKey);

	}

}
