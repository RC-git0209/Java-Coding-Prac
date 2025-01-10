
import java.util.Arrays;
import java.util.List;

class RemoveDuplicateNumbers {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1,2,4,5,2,5,6,4);
		
		List<Integer> distinctnumbers = numbers.stream()
				.distinct()
				.toList();
		System.out.println("Print the list of numbers :" + numbers);
		System.out.println("Print the Distinct Numbers :" + distinctnumbers);
		distinctnumbers.forEach(System.out::println);

	}

}
