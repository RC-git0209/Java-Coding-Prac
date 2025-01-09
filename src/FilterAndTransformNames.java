import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterAndTransformNames {

	public static void main(String[] args) {
		// List of names
		List<String> names = Arrays.asList("john","Sam","Jane","Jack","Doe","jimmy");
		
		// Filter names containing "J" (case-insensitive) and convert them to uppercase
		List<String> result = names.stream()
				.filter(name -> name.toLowerCase().contains("j")) // check if "J" exists
				.map(String::toUpperCase) // convert to uppercase
				.collect(Collectors.toList()); // Collect to list
		
		System.out.println(result);

	}

}
