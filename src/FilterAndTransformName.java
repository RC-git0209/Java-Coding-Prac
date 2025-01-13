import java.util.*;
import java.util.stream.Collectors;


public class FilterAndTransformName {

	public static void main(String[] args) {
		List<String> names = Arrays.asList("Rohan", "ram", "ramesh", "sam", "mahesh", "Rony");
		
		List<String> result = names.stream()
				.filter(name -> name.contains("R") || name.contains("r"))
				.map(String::toLowerCase)
				.collect(Collectors.toList());
		
		System.out.println(result);

	}

}
